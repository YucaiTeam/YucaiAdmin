package com.hyg.yucai.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyg.yucai.model.TAdmin;
import com.hyg.yucai.model.TAdminExample;
import com.hyg.yucai.model.TUser;
import com.hyg.yucai.model.TUserExample;
import com.hyg.yucai.service.TAdminService;
import com.hyg.yucai.service.TUserService;

@Controller
public class AdminContorller {
	@Autowired
	private TAdminService tAdminService;
	
	@Autowired
	private TUserService tUserService;
	
	///验证登陆
	@RequestMapping("/login")
	@ResponseBody
	public String loginfind(HttpServletRequest req,HttpServletResponse resp,TAdmin admin) throws Exception{
		//跨域
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(admin.getAdminname());
		System.out.println(admin.getPassword());
		///根据用户，密码查询
		TAdminExample adminExample=new TAdminExample();
		adminExample.createCriteria()
			.andAdminnameEqualTo(admin.getAdminname()).andPasswordEqualTo(admin.getPassword());
		List<TAdmin> adminlist=tAdminService.findAdminbyDy(adminExample);
		if(adminlist.size()>0){
			admin.setAdminid(adminlist.get(0).getAdminid());
			admin.setLogtime(new Date());
			int x=tAdminService.updateAdminbyId(admin);
			if(x>0){
				//加到session
				HttpSession session =req.getSession();
				session.setAttribute("AdminName", admin.getAdminname());
				//设置失效时长
				///session.setMaxInactiveInterval(1000);
				System.out.println("登陆成功！");
				return "Loginok";
			}else{
				return "Sessionno";
			}	
		}else{
			System.out.println("用户名或密码错误！");
			return "Loginno";
		}
			
	}
	///取消登陆
	@RequestMapping("/loginOut")
	@ResponseBody
	public String loginout(HttpServletRequest req,HttpServletResponse resp) throws Exception{
		//跨域
		resp.setHeader("Access-Control-Allow-Origin", "*");
		///测试接收
		System.out.println("session");
		HttpSession session=req.getSession();
		if(session!=null){
			session.invalidate();
		}
		//通知结果
		return "outOK";
		
	}
	///登陆页面展示
	@RequestMapping("/loginShow")
	public String logintest(HttpServletRequest req,HttpServletResponse resp) throws Exception{
		//跨域
		resp.setHeader("Access-Control-Allow-Origin", "*");
		return "Login";
	}
	
	////注册用户
	@RequestMapping("/Regist")
	@ResponseBody
	public String registadmin(HttpServletRequest req,HttpServletResponse resp,TAdmin admin) throws Exception{
		//跨域
		resp.setHeader("Access-Control-Allow-Origin", "*");
		System.out.println(admin.getAdminname());
		System.out.println(admin.getPassword());
		///根据用户，密码查询
		TAdminExample adminExample=new TAdminExample();
		adminExample.createCriteria()
			.andAdminnameEqualTo(admin.getAdminname());
		List<TAdmin> adminlist=tAdminService.findAdminbyDy(adminExample);
		if(adminlist.size()>0){
			System.out.println("已有用户！");
			return "rehave";
		}else{
			admin.setRegistdate(new Date());
			admin.setDelflag(0);
			int x=tAdminService.insertAdmin(admin);
			System.out.println(x);
			if(x>0){
				System.out.println("注册成功");
				return "reok";
			}else{
				System.out.println("注册失败");
				return "reno";
			}
			
		}
			
	}
	////添加管理员
	@RequestMapping("/addUserManager")
	@ResponseBody
	public String addusermanager(HttpServletRequest req,HttpServletResponse resp,TUser user)throws Exception{
		//跨域
		resp.setHeader("Access-Control-Allow-Origin", "*");
		user.setUserid(3);
		user.setUserrole(1);
		int x=tUserService.updateUserById(user);
		if(x>0){
			System.out.println("修改成功");
			return "AddUserManagerok";
		}else{
			System.out.println("修改失败");
			return "AddUserManagerno";
		}
	}
	//添加用户
	@RequestMapping("/addUser")
	@ResponseBody
	public String adduser(HttpServletRequest req,HttpServletResponse resp,TUser user) throws Exception{
		//跨域
		resp.setHeader("Access-Control-Allow-Origin", "*");
		user.setRegistdate(new Date());
		int x=tUserService.addUser(user);
		if(x>0){
			System.out.println("添加成功");
			return "AddUserok";
		}else{
			System.out.println("添加失败");
			return "AddUserno";
		}
	}
	/////更新根据id
	@RequestMapping("/updateAdmin")
	@ResponseBody
	public String updateadmin(HttpServletRequest req,HttpServletResponse resp,TAdmin admin) throws Exception{
		//跨域
		resp.setHeader("Access-Control-Allow-Origin", "*");
		admin.setAdminid(3);
		int x=tAdminService.updateAdminbyId(admin);
		if(x>0){
			System.out.println("修改成功");
			return "upok";
		}else{
			System.out.println("修改失败");
			return "upno";
		}
	}
	//更改用户信息
	@RequestMapping("/updateUser")
	@ResponseBody
	public String updateuser(HttpServletRequest req,HttpServletResponse resp,TUser user)throws Exception{
		//跨域
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
		user.setUserid(3);
		int x=tUserService.updateUserById(user);
		if(x>0){
			System.out.println("修改成功");
			return "upuserok";
		}else{
			System.out.println("修改失败");
			return "upuserno";
		}
	}
	/////删除根据id（修改删除标记）
	@RequestMapping("/delAdmin")
	@ResponseBody
	public String deladmin(HttpServletRequest req,HttpServletResponse resp,TAdmin admin) throws Exception{
		//跨域
		resp.setHeader("Access-Control-Allow-Origin", "*");
		admin.setAdminid(3);
		admin.setDelflag(1);
		int x=tAdminService.updateAdminbyId(admin);
		if(x>0){
			System.out.println("删除成功");
			return "delok";
		}else{
			System.out.println("删除失败");
			return "delno";
		}
	}

	///User操作
	//删除用户信息
	@RequestMapping("/delUser")
	@ResponseBody
	public String deluser(HttpServletRequest req,HttpServletResponse resp,TUser user)throws Exception{
		//跨域
		resp.setHeader("Access-Control-Allow-Origin", "*");
		user.setDelflag(1);
		user.setUserid(3);
		int x=tUserService.updateUserById(user);
		if(x>0){
			System.out.println("删除成功");
			return "deluserok";
		}else{
			System.out.println("删除失败");
			return "deluserno";
		}
	}
	///查询用户表（会员+普通用户）
	@RequestMapping("/findUser")
	@ResponseBody
	public List<TUser> findUser(HttpServletRequest req,HttpServletResponse resp,TUser user)throws Exception{
		//跨域
		resp.setHeader("Access-Control-Allow-Origin", "*");
		List<TUser> userlist=tUserService.findAllUser();
		return userlist;
	}
	///查询用户表（会员+普通用户）
	@RequestMapping("/findUserBy")
	@ResponseBody
	public List<TUser> findUserByDy(HttpServletRequest req,HttpServletResponse resp,TUser user)throws Exception{
		//跨域
		resp.setHeader("Access-Control-Allow-Origin", "*");
		
		TUserExample userExample=new TUserExample();
		userExample.createCriteria().andUserroleEqualTo(1);
		List<TUser> userlist=tUserService.findUserByDy(userExample);
		return userlist;
	}
	
	
	
	

}
