package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Student;
import com.accp.service.StudentService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/StudentPage")
public class StudentController {
	@Autowired
	StudentService dy;
	@RequestMapping("/tofindByPage")
	public String tofindByPage() {
		return "StudentPage";
	}
	@RequestMapping("/findByPage")
	@ResponseBody
	public PageInfo<Student> findByPage(Integer dangqianyemian){
		Integer pageSize=2;
		return dy.findByPage(dangqianyemian, pageSize);
	}
	@RequestMapping("/remove")
	@ResponseBody
	public String remove(Integer [] checklist) {
		
		return dy.remove(checklist);
	}
}
