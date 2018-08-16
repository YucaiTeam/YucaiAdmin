package com.hyg.yucai.service;

import java.util.List;

import com.hyg.yucai.model.TUser;
import com.hyg.yucai.model.TUserExample;

public interface UserService {

	public List<TUser> selectAllUser(TUserExample example);
}
