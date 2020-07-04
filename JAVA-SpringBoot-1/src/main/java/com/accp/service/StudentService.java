package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ClazzMapper;
import com.accp.dao.StudentMapper;
import com.accp.domain.Student;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class StudentService {
	@Autowired
	StudentMapper mapper;
	@Autowired
	ClazzMapper clzmapper;
	public PageInfo<Student> findByPage(Integer dangqianyemian,Integer pageSize){
		Page<Student> page=PageHelper.startPage(dangqianyemian, pageSize);
		List<Student> list=mapper.selectByExample(null);
		for (Student st : list) {
			st.setClz(clzmapper.selectByPrimaryKey(st.getClid()));
		}
		return page.toPageInfo();
	}
	public String remove(Integer [] checklist) {
	try {
				for (Integer stuid : checklist) {
					mapper.deleteByPrimaryKey(stuid);
				}
				return "0001";
		} catch (Exception e) {
			// TODO: handle exception
		}
				return "0000";
	}
}
