package com.techsoft.technolink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techsoft.technolink.entity.StudentSignUpEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentSignUpEntity, Integer> {

}
