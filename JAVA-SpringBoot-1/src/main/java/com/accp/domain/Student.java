package com.accp.domain;

public class Student {
    private Integer stuid;

    private String stuname;

    private Integer stuage;

    private Integer clid;
    private Clazz clz;
    public Clazz getClz() {
		return clz;
	}

	public void setClz(Clazz clz) {
		this.clz = clz;
	}

	public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Integer getStuage() {
        return stuage;
    }

    public void setStuage(Integer stuage) {
        this.stuage = stuage;
    }

    public Integer getClid() {
        return clid;
    }

    public void setClid(Integer clid) {
        this.clid = clid;
    }
}