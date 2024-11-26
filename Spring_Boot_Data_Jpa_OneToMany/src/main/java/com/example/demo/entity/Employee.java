package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Employee {

	@Id
	@SequenceGenerator(name = "pid", sequenceName = "pid_generator", initialValue = 100, allocationSize = 10)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "pid")
	private Integer empId;
	private String empName;
	private String empEmail;
	private Double salary;

}
