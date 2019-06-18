package com.cy.pj.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pj.sys.service.SysLogService;

@Controller
@RequestMapping("/log/")
public class SysLogController {
	@Autowired
	private SysLogService sysLogService;
	@RequestMapping("doDeleteObjects")
	@ResponseBody
	public String doDeleteObjects(Integer... ids) {
		int rows = sysLogService.deleteObject(ids);
		return "delete ok,rows="+rows;
	}
}
