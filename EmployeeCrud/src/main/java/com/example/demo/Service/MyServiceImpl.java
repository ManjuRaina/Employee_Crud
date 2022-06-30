package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.DaoLayer;
import com.example.demo.Model.Employee;

@Service
public class MyServiceImpl implements MyService{
	
	@Autowired
	private DaoLayer dao;

	@Override
	public Employee add(Employee emp) {
		if (emp != null) {
			return dao.save(emp);
		}
		throw new RuntimeException("the emp is null");
	}

	@Override
	public Employee res(int id) {
		if (id != 0) {
			return dao.findById(id);
		}
		throw new RuntimeException("the id is null");
		
	}

	@Override
	public void remove(int id) {
	
		Employee findById = dao.findById(id);
		dao.delete(findById);
	}

	@Override
	public Employee replace(Employee emp) {
		
		if(emp!=null) {
			return dao.save(emp);
		}else {
			throw new RuntimeException("the emp is null");
		}
	}

}
