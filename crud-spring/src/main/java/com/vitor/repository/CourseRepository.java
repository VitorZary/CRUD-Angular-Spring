package com.vitor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
