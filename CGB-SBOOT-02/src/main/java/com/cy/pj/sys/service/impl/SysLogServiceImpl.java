package com.cy.pj.sys.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cy.pj.sys.service.SysLogService;
import com.cy.pj.syslog.dao.SysLogDao;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class SysLogServiceImpl implements SysLogService {
	//private static final Logger log = LoggerFactory.getLogger(SysLogServiceImpl.class);
	@Autowired
	@Qualifier("sysLogDao")
	private SysLogDao sysLogDao;
	@Override
	public int deleteObject(Integer... ids) {
		int rows = sysLogDao.deleteObject(ids);
		if (rows>0) {
			log.info("delete ok,rows="+rows);
		}
		return rows;
	}

}
