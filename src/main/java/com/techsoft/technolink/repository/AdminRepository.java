package com.techsoft.technolink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techsoft.technolink.entity.AdminSignUpEntity;

@Repository
public interface AdminRepository extends JpaRepository<AdminSignUpEntity, Integer> {

}
