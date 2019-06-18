package com.cy.pj.syslog.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SysLogDao {
	int deleteObject(@Param("ids") Integer... ids);
}
