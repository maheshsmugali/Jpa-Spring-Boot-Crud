package com.pws.JpaCurdOperation.service;

import com.pws.JpaCurdOperation.entity.Student;
import com.pws.JpaCurdOperation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public void updateStudent(Student student) {
      Optional<Student> pts=studentRepository.findById(student.getId());
      if(pts.isPresent()){
          studentRepository.save(student);

      }
      else{
          throw new RuntimeException("Id not found");
      }
    }

    @Override
    public String deleteStudentById(Integer id) {
         studentRepository.deleteById(id);
        return id+" Id is deleted";
    }
}
