package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Clazz;
import com.accp.service.ClazzService;

@Controller
@RequestMapping("/clazz")
public class ClazzController {
	@Autowired
	ClazzService dy;
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(@RequestBody Clazz cla) {
		return dy.insert(cla);
	}
	@RequestMapping("/findById")
	@ResponseBody
	public Clazz findById(Integer clid) {
		return dy.findById(clid);
	}
	@RequestMapping("/update")
	@ResponseBody
	public String update(@RequestBody Clazz cla) {
		return dy.update(cla);
	}
}
