package com.hyg.yucai.controller;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class UploadImageController {
	private static final ObjectMapper objectMapper = new ObjectMapper();
	private PrintWriter writer = null;
	
	/**
	 * to图片添加、修改上传
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/file_upload",method=RequestMethod.POST)
	public void file_upload(HttpServletRequest request, HttpServletResponse response) throws Exception{
	
		  ServletContext application = request.getSession().getServletContext();
	        String savePath = application.getRealPath("/") + "upload/";
	        // 文件保存目录URL
	        String saveUrl = request.getContextPath() + "/upload/";
	        System.out.println(saveUrl);
	        // 定义允许上传的文件扩展名
	        HashMap<String, String> extMap = new HashMap<String, String>();
	        extMap.put("image", "gif,jpg,jpeg,png,bmp");
//	        extMap.put("flash", "swf,flv");
//	        extMap.put("media", "swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");
//	        extMap.put("file", "doc,docx,xls,xlsx,ppt,htm,html,txt,zip,rar,gz,bz2");
	 
	        // 最大文件大小
	        long maxSize = 3000000;
	 
	        response.reset();
	        response.setCharacterEncoding("UTF-8");
	        response.setContentType("text/html");
	        writer = response.getWriter();
	        if (!ServletFileUpload.isMultipartContent(request)) {
	            writer.println(objectMapper.writeValueAsString(getError("请选择文件。")));
	            return;
	        }
	        // 检查目录（不存在就添加）
	        File uploadDir = new File(savePath);
	        if(!uploadDir.exists()){  
	        	uploadDir.mkdirs();  
	        }
	        if (!uploadDir.isDirectory()) {
	            writer.println(objectMapper.writeValueAsString(getError("上传目录不存在。")));
	            return;
	        }
	        // 检查目录写权限
	        if (!uploadDir.canWrite()) {
	            writer.println(objectMapper.writeValueAsString(getError("上传目录没有写权限。")));
	            return;
	        }
	 
	        String dirName = request.getParameter("dir");
	        if (dirName == null) {
	            dirName = "image";
	        }
	        if (!extMap.containsKey(dirName)) {
	            writer.println(objectMapper.writeValueAsString(getError("目录名不正确。")));
	            return;
	        }
	        // 创建文件夹
	        savePath += dirName + "/";
	        saveUrl += dirName + "/";
	        File saveDirFile = new File(savePath);
	        if (!saveDirFile.exists()) {
	            saveDirFile.mkdirs();
	        }
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	        String ymd = sdf.format(new Date());
	        savePath += ymd + "/";
	        saveUrl += ymd + "/";
	        File dirFile = new File(savePath);
	        if (!dirFile.exists()) {
	            dirFile.mkdirs();
	        }
	 
	        FileItemFactory factory = new DiskFileItemFactory();
	        ServletFileUpload upload = new ServletFileUpload(factory);
	        upload.setHeaderEncoding("UTF-8");
	        List items = upload.parseRequest(request);
	        Iterator itr = items.iterator();
	        while (itr.hasNext()) {
	            FileItem item = (FileItem) itr.next();
	            String fileName = item.getName();
	            if (!item.isFormField()) {
	                // 检查文件大小
	                if (item.getSize() > maxSize) {
	                    writer.println(objectMapper.writeValueAsString(getError("上传文件大小超过限制。")));
	                    return;
	                }
	                // 检查扩展名
	                String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
	                if (!Arrays.<String>asList(extMap.get(dirName).split(",")).contains(fileExt)) {
	                    writer.println(objectMapper.writeValueAsString(getError("上传文件扩展名是不允许的扩展名。\n只允许"
	                            + extMap.get(dirName) + "格式。")));
	                    return;
	                }
	 
	                SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
	                String newFileName =
	                        df.format(new Date()) + "_" + new Random().nextInt(1000) + "." + fileExt;
	                try {
	                    File uploadedFile = new File(savePath, newFileName);
	                    item.write(uploadedFile);
	                } catch (Exception e) {
	                    writer.println(objectMapper.writeValueAsString(getError("上传文件失败。")));
	                }
	 
	                Map<String, Object> msg = new HashMap<String, Object>();
	                msg.put("error", 0);
	                msg.put("url", saveUrl + newFileName);
	                writer.println(objectMapper.writeValueAsString(msg));
	               
	                return;
	            }
	        }
	        return;
	}


	
	 private Map<String, Object> getError(String message) {
	        Map<String, Object> msg = new HashMap<String, Object>();
	        msg.put("error", 1);
	        msg.put("message", message);
	        return msg;
	    }
	 
	 @SuppressWarnings("rawtypes")
	    class NameComparator implements Comparator {
	        public int compare(Object a, Object b) {
	            Hashtable hashA = (Hashtable) a;
	            Hashtable hashB = (Hashtable) b;
	            if (((Boolean) hashA.get("is_dir")) && !((Boolean) hashB.get("is_dir"))) {
	                return -1;
	            } else if (!((Boolean) hashA.get("is_dir")) && ((Boolean) hashB.get("is_dir"))) {
	                return 1;
	            } else {
	                return ((String) hashA.get("filename")).compareTo((String) hashB.get("filename"));
	            }
	        }
	    }
	 
	    @SuppressWarnings("rawtypes")
	    class SizeComparator implements Comparator {
	        public int compare(Object a, Object b) {
	            Hashtable hashA = (Hashtable) a;
	            Hashtable hashB = (Hashtable) b;
	            if (((Boolean) hashA.get("is_dir")) && !((Boolean) hashB.get("is_dir"))) {
	                return -1;
	            } else if (!((Boolean) hashA.get("is_dir")) && ((Boolean) hashB.get("is_dir"))) {
	                return 1;
	            } else {
	                if (((Long) hashA.get("filesize")) > ((Long) hashB.get("filesize"))) {
	                    return 1;
	                } else if (((Long) hashA.get("filesize")) < ((Long) hashB.get("filesize"))) {
	                    return -1;
	                } else {
	                    return 0;
	                }
	            }
	        }
	    }
	 
	    @SuppressWarnings("rawtypes")
	    class TypeComparator implements Comparator {
	        public int compare(Object a, Object b) {
	            Hashtable hashA = (Hashtable) a;
	            Hashtable hashB = (Hashtable) b;
	            if (((Boolean) hashA.get("is_dir")) && !((Boolean) hashB.get("is_dir"))) {
	                return -1;
	            } else if (!((Boolean) hashA.get("is_dir")) && ((Boolean) hashB.get("is_dir"))) {
	                return 1;
	            } else {
	                return ((String) hashA.get("filetype")).compareTo((String) hashB.get("filetype"));
	            }
	        }
	    }
}
