package com.cy;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.pj.syslog.dao.SysLogDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSysLog {
	@Autowired
	private SysLogDao sysLogDao;
	@Test
	public void testDeleteAll() {
		int rows = sysLogDao.deleteObject(21,22,23);
		System.out.println(rows);
	}
}
