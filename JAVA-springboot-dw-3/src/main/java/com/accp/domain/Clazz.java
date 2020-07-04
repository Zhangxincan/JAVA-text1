package com.accp.domain;

import java.util.List;

public class Clazz {
    private Integer clazzid;

    private String clazzname;
    private List<Student> list;
    public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	
	public Integer getClazzid() {
        return clazzid;
    }

    public void setClazzid(Integer clazzid) {
        this.clazzid = clazzid;
    }

    public String getClazzname() {
        return clazzname;
    }

    public void setClazzname(String clazzname) {
        this.clazzname = clazzname;
    }
}