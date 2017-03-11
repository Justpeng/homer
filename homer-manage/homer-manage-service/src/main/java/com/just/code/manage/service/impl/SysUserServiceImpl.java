package com.just.code.manage.service.impl;


import com.just.code.manage.mapper.SysUserMapper;
import com.just.code.manage.pojo.SysUser;
import com.just.code.manage.service.SysUserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {
	
	@Resource
	private SysUserMapper sysUserMapper;


	@Override
	public SysUser getById(Long id) {
		return sysUserMapper.selectByPrimaryKey(id);
	}
}
