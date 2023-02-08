package com.pws.JpaCurdOperation.service;

import com.pws.JpaCurdOperation.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public void saveStudent(Student student);

    public List<Student> getAllStudent();

    public Optional<Student> getStudentById(Integer id);

    public void updateStudent(Student student);

    public String deleteStudentById(Integer id);
}
