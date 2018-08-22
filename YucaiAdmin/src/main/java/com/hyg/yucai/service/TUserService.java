package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TUser;
import com.hyg.yucai.model.TUserExample;

public interface TUserService {
	//根据动态条件查询用户
	public List<TUser> findUserByDy(TUserExample userExample) throws Exception;
	//查询所有用户
	public List<TUser> findAllUser() throws Exception;
	///更新用户根据id
	public int updateUserById(TUser user) throws Exception;
	///添加用户
	public int addUser(TUser user) throws Exception;

}
