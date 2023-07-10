package com.greatlearning.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GreatLearning {
	private String Course_Name;
	private String Course_Type;
	private String Instructor_Name;

//	public GreatLearning() {
//
//	}
//
//	public String getCourse_Name() {
//		return Course_Name;
//	}
//
//	public void setCourse_Name(String course_Name) {
//		Course_Name = course_Name;
//	}
//
//	public String getCourse_Type() {
//		return Course_Type;
//	}
//
//	public void setCourse_Type(String course_Type) {
//		Course_Type = course_Type;
//	}
//
//	public String getInstructor_Name() {
//		return Instructor_Name;
//	}
//
//	public void setInstructor_Name(String instructor_Name) {
//		Instructor_Name = instructor_Name;
//	}
//
//	@Override
//	public String toString() {
//		return "GreatLearning [Course_Name=" + Course_Name + ", Course_Type=" + Course_Type + ", Instructor_Name="
//				+ Instructor_Name + "]";
//	}
//
//	public GreatLearning(String course_Name, String course_Type, String instructor_Name) {
//		super();
//		Course_Name = course_Name;
//		Course_Type = course_Type;
//		Instructor_Name = instructor_Name;
//	}

}
