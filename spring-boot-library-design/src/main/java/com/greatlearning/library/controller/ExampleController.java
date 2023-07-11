package com.greatlearning.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.library.model.GreatLearning;

@RestController
public class ExampleController {

	@GetMapping("/info")
	@ResponseBody
	public GreatLearning get() {
		GreatLearning greatLearning=new GreatLearning("controller Mapping Intro","iT","shubh arora");
		
		return greatLearning;
	}
	
	@PostMapping("courseInfo")
	public GreatLearning post(String courseName,String courseType,String instructorName) {
		GreatLearning greatLearning=new GreatLearning();
		greatLearning.setCourse_Name(courseName);
		greatLearning.setCourse_Type(courseType);
		greatLearning.setInstructor_Name(instructorName);
		return greatLearning;
		
	}
}
