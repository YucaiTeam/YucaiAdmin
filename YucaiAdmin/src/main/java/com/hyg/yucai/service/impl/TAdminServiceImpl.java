package com.hyg.yucai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyg.yucai.mapper.TAdminMapper;
import com.hyg.yucai.model.TAdmin;
import com.hyg.yucai.model.TAdminExample;
import com.hyg.yucai.service.TAdminService;

@Service
public class TAdminServiceImpl implements TAdminService{
	
	@Autowired
	private TAdminMapper tAdminMapper;

	@Override
	public List<TAdmin> findAdminbyDy(TAdminExample adminExample) throws Exception {
		List<TAdmin> adminlist=tAdminMapper.selectByExample(adminExample);
		return adminlist;
	}

	@Override
	public int insertAdmin(TAdmin admin) throws Exception {
		int x=tAdminMapper.insertSelective(admin);
		return x;
	}

	@Override
	public int updateAdmin(TAdmin admin,TAdminExample adminExample) throws Exception {
		int x =tAdminMapper.updateByExampleSelective(admin, adminExample);
		return x;
	}

	@Override
	public int updateAdminbyId(TAdmin admin) throws Exception {
		int x =tAdminMapper.updateByPrimaryKeySelective(admin);
		return x;
	}

	@Override
	public int delAdminById(TAdmin admin) throws Exception {
		int x =tAdminMapper.deleteByPrimaryKey(admin.getAdminid());
		return x;
	}
	

}
