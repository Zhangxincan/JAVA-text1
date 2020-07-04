package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ClazzMapper;
import com.accp.dao.StudentMapper;
import com.accp.domain.Clazz;
import com.accp.domain.Student;
import com.accp.domain.StudentExample;

@Service
@Transactional
public class ClazzService {
	@Autowired
	ClazzMapper mapper;
	@Autowired
	StudentMapper stumapper;
	public String insert(Clazz cla) {
		try {
			int count = mapper.insert(cla);
			if (count > 0) {
				for (Student st : cla.getList()) {
					st.setClid(cla.getClid());
					stumapper.insert(st);
				}
			} 
			return "0001";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "0000";
	}
	public Clazz findById(Integer clid) {
		Clazz cla=mapper.selectByPrimaryKey(clid);
		StudentExample ex=new StudentExample();
		ex.createCriteria().andClidEqualTo(cla.getClid());
		cla.setList(stumapper.selectByExample(ex));
		return cla;
	}
	public String update(Clazz cla) {
		try {
			int count = mapper.updateByPrimaryKey(cla);
			for (Student st : cla.getList()) {
				stumapper.deleteByPrimaryKey(st.getStuid());
				st.setStuid(null);
				st.setClid(cla.getClid());
				stumapper.insert(st);
			} 
			return "0001";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "0000";
	}
}
