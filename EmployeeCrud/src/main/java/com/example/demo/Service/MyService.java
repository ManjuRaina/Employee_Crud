package com.example.demo.Service;

import com.example.demo.Model.Employee;

public interface MyService {

	public Employee add(Employee emp);

	public Employee res(int id);

	public void remove(int id);

	public Employee replace(Employee emp);

}
