package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Clazz;
import com.accp.domain.Student;
import com.accp.service.StudentService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService dy;
	@RequestMapping("/tofind")
	public String tofind() {
		return "student";
	}
	@RequestMapping("/findByPage")
	@ResponseBody
	public  PageInfo<Student> findByPage(Integer dangqianyemian){
		Integer pageSize=2;
		return dy.findByPage(dangqianyemian, pageSize);
	}
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(@RequestBody Clazz cla) {
		return dy.insert(cla);
	}
}
