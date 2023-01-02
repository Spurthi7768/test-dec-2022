package com.example.testcontainers.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.example.testcontainers.AbstractContainerBaseTest;
import com.example.testcontainers.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.junit.jupiter.api.Assertions;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class StudentRepositoryTest extends AbstractContainerBaseTest {

    @Autowired
    private StudentRepository studentRepository;

  
    @Test
    public void givenStudentObject_whenSave_thenReturnSavedStudent(){

        
    	Student student = new Student("Rakesh","Patil","rakesh@gmail.com");

       
        Student savedStudent = studentRepository.save(student);

     
        Assertions.assertNotNull(savedStudent);
        Assertions.assertNotNull(savedStudent.getId());

    }

 
    @Test
    public void givenStudentId_whenfindbyId_thenReturnSavedStudent(){

    
    	Student student = new Student("Rakesh","Patil","rakesh@gmail.com");
        Student savedStudent = studentRepository.save(student);

        Student studentDB = studentRepository.findById(student.getId()).get();

      
        Assertions.assertNotNull(studentDB);
    }

}
