package com.accp.domain;

import java.util.List;

public class Clazz {
    private Integer clid;

    private String clname;
    private List<Student> list;
    
    public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }

    public String getClname() {
        return clname;
    }

	public void setClname(String clname) {
        this.clname = clname;
    }
}