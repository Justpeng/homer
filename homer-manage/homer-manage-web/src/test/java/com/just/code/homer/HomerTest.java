package com.just.code.homer;


import com.just.code.manage.pojo.SysUser;
import com.just.code.manage.service.SysUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext*.xml"})
public class HomerTest {

	private Logger logger = Logger.getLogger(this.getClass().getName());

	@Resource
	private SysUserService sysUserService;

	@Test
	public void test1() {
		SysUser sysUser = sysUserService.getById(1L);
		logger.info("--------------------------------" + sysUser.toString());
	}
}
