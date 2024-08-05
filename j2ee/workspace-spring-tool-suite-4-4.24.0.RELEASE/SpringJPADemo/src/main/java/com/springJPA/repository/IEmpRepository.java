package com.springJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springJPA.data.Employee;

public interface IEmpRepository extends JpaRepository<Employee,Integer> {

}
