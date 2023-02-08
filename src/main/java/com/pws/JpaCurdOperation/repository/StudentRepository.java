package com.pws.JpaCurdOperation.repository;

import com.pws.JpaCurdOperation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
