package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TUserMapper;
import com.hyg.yucai.model.TUser;
import com.hyg.yucai.model.TUserExample;
import com.hyg.yucai.service.TUserService;


@Service
public class TUserServiceImpl implements TUserService{

	@Autowired
	private TUserMapper tUserMapper;
	
	//动态查找
	@Override
	public List<TUser> findUserByDy(TUserExample userExample) throws Exception {
		List<TUser> user=tUserMapper.selectByExample(userExample);
		return user;
	}

	///动态更新根据id
	@Override
	public int updateUserById(TUser user)
			throws Exception {
		int x=tUserMapper.updateByPrimaryKeySelective(user);
		return x;
	}

	@Override
	public int addUser(TUser user) throws Exception {
		int x=tUserMapper.insertSelective(user);
		return x;
	}

	@Override
	public List<TUser> findAllUser() throws Exception {
		List<TUser> user=tUserMapper.selectByExample(null);
		return user;
	}

}
