package com.grayMatter.beans;

import java.util.HashSet;

public class Course {
	
	private String courseName;
	private int duration;
	

	public Course() {
		super();
	}


	public Course(String courseName, int duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", duration=" + duration + "]";
	}

	
	
	
	

}
