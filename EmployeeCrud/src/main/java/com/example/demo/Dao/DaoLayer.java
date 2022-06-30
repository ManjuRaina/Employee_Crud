package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Employee;

@Repository
public interface DaoLayer extends JpaRepository<Employee, Integer> {

	public Employee findById(int id);
}
