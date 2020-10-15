package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private StudentRespository studentRespository;

	public MainController(UserRepository userRepository, StudentRespository studentRespository) {
		this.userRepository = userRepository;
		this.studentRespository = studentRespository;
	}

	@PostMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestBody PersonalInfo personalInfo) {
		User n = new User();
		n.setName(personalInfo.getName());
		n.setEmail(personalInfo.getEmail());
		userRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();

	}

	@PostMapping("/students")
	public String addStudents(@RequestBody Student student ){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setRollNumber(student.getRollNumber());
		student.setName(student.getName());
		studentRespository.save(studentInfo);
		return "Saved student";
	}

	@GetMapping(path="/students/all")
	public @ResponseBody Iterable<StudentInfo> getAllStudents() {
		return studentRespository.findAll();

	}

}
