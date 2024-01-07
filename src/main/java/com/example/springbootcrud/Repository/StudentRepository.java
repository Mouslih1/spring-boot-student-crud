package com.example.springbootcrud.Repository;

import com.example.springbootcrud.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
