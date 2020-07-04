package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ClazzMapper;
import com.accp.dao.StudentMapper;
import com.accp.domain.Clazz;
import com.accp.domain.Student;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class StudentService {
	@Autowired
	StudentMapper stumapper;
	@Autowired
	ClazzMapper clamapper;
	public PageInfo<Student> findByPage(Integer dangqianyemian,Integer pageSize){
		Page<Student> page=PageHelper.startPage(dangqianyemian, pageSize);
		List<Student> list=stumapper.selectByExample(null);
		for (Student s : list) {
			Clazz cla=clamapper.selectByPrimaryKey(s.getClazzid());
			s.setClaname(cla.getClazzname());
		}
		return page.toPageInfo();
	}
	public String insert(Clazz cla) {
		try {
			int count = clamapper.insert(cla);
			if (count > 0) {
				for (Student st : cla.getList()) {
					st.setClazzid(cla.getClazzid());
					stumapper.insert(st);
				}
			} 
			return "增加成功";
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("畜生");
		return "增加失败";
	}
}
