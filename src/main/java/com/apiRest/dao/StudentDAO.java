package com.apiRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiRest.model.student;

public interface StudentDAO extends JpaRepository<student, Integer> {

}
