package com.example.springbootcrud.Service;

import com.example.springbootcrud.Model.Student;
import com.example.springbootcrud.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> listAll()
    {
        return studentRepository.findAll();
    }

    public void save(Student student)
    {
        studentRepository.save(student);
    }

    public Student get(Integer id)
    {
        return studentRepository.findById(id).get();
    }

    public void delete(Integer id)
    {
        studentRepository.deleteById(id);
    }
}
