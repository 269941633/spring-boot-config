package com.fei.springboot.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("classConfig")
@ConfigurationProperties(prefix="class")
public class ClassConfig {

	private String schoolName;
	
	private String className;
	
	private List<StudentConfig> students = new ArrayList<StudentConfig>();

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setStudents(List<StudentConfig> students) {
		this.students = students;
	}

	public String getClassName() {
		return className;
	}

	public List<StudentConfig> getStudents() {
		return students;
	}
	
	
}
