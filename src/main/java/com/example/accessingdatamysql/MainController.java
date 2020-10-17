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
		studentInfo.setName(student.getName());
		studentRespository.save(studentInfo);
		return "Saved student";
	}

	@GetMapping(path="/students/all")
	public @ResponseBody Iterable<StudentInfo> KismatHastwoClientsSandeepPrince() {
		return studentRespository.findAll();
	}

	@DeleteMapping("/students/remove")
	public @ResponseBody String removeStudents(@RequestParam Integer id){
		studentRespository.deleteById(id);
		return "removed";
	}

	@PutMapping("/students/update/updateThroughRequestParam")
	public @ResponseBody String updateStudentsRequestParam(@RequestParam Integer id, @RequestParam Integer rollNumber, @RequestParam String name){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setRollNumber(rollNumber);
		studentInfo.setName(name);
		studentInfo.setId(id);
		studentRespository.save(studentInfo);
		return "updated";
	}

	@PutMapping("/students/update/throughRequestBody")
	public @ResponseBody String updateStudentsRequestBody(@RequestBody Student student){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setRollNumber(student.getRollNumber());
		studentInfo.setName(student.getName());
		studentInfo.setId(student.getId());
		studentRespository.save(studentInfo);
		return "updated";
	}

	/*
	HW:

	hint: inpuut

	 100 -> database - true/false
	 studentRepository

	 if (existsById(id))
	 	save
	 else
	 	return "cannot save. please give me a valid id"

	 */
}
