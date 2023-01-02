package com.example.testcontainers.repository;

import com.example.testcontainers.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}