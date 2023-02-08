package com.pws.JpaCurdOperation.controller;

import com.pws.JpaCurdOperation.entity.Student;
import com.pws.JpaCurdOperation.repository.StudentRepository;
import com.pws.JpaCurdOperation.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/saveStudent")
    public ResponseEntity<Object> saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return new ResponseEntity<>("Student Details saved", HttpStatus.OK);
    }

    @GetMapping("/fetchAllStudent")
    public List<Student> getAllStudent(){
       return studentService.getAllStudent();
    }
    @GetMapping ("/getStudentById")
    public Optional<Student> getStudentById(@RequestParam Integer id){
        return studentService.getStudentById(id);
    }
    @PutMapping("/updateStudent")
    public String updateStudent(@RequestParam Integer id,@RequestBody Student student){
        studentService.updateStudent(student);
        return "student details updated ";
    }
    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudentById(@PathVariable("id")  Integer id){
        return studentService.deleteStudentById(id);
    }
}
