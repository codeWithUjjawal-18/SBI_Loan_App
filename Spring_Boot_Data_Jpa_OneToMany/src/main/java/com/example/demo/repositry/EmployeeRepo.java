package com.example.demo.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query(value = "select * from employee", nativeQuery = true)
	public List<Employee> getAllStudent();

	@Query(value = "from Employee")
	public List<Employee> getAllStudentsHQL();

	@Query(value = "delete from Employee where empId = :sid")
	@Modifying
	@Transactional
	public void deleteEmployees(Integer sid);

}
