package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TAdmin;
import com.hyg.yucai.model.TAdminExample;

public interface TAdminService {
	
	///查询动态条件
	public List<TAdmin> findAdminbyDy(TAdminExample adminExample) throws Exception;
	//插入
	public int insertAdmin(TAdmin admin) throws Exception;
	///更新admin
	public int updateAdmin(TAdmin admin,TAdminExample adminExample) throws Exception;
	///根据id更新admin
	public int updateAdminbyId(TAdmin admin) throws Exception;
	//根据id删除admin
	public int delAdminById(TAdmin admin) throws Exception;
	
	

}
