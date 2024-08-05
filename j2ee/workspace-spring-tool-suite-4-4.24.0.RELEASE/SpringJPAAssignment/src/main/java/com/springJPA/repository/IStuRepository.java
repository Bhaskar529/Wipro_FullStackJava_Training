package com.springJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springJPA.data.Student;

public interface IStuRepository extends JpaRepository<Student,Integer>{

}
