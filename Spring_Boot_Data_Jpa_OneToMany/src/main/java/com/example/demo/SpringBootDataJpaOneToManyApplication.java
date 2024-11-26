package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Employee;
import com.example.demo.repositry.EmployeeRepo;

@SpringBootApplication
public class SpringBootDataJpaOneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpaOneToManyApplication.class,
				args);

		
		Employee emp1 = new Employee();
		emp1.setEmpName("Ujjawal1");
		emp1.setEmpEmail("ujjawal@mail.com");
		emp1.setSalary(85858.336);
		
		
		/*
		 * Address add1 = new Address(); add1.setStreet("Chor bazar");
		 * add1.setState("Uttar Pradesd"); add1.setPhoneNumber("7983623425");
		 * add1.setPincode(251314); //add1.setEmp(emp1);
		 * 
		 * Address add2 = new Address(); add2.setStreet("Valik bazar");
		 * add2.setState("Uttar Pradesd"); add2.setPhoneNumber("79833425");
		 * add2.setPincode(251314); //add2.setEmp(emp1);
		 * 
		 * List<Address> addresses = Arrays.asList(add1, add2); // //
		 * emp1.setAddresses(addresses);
		 * 
		 * EmployeeRepo empRepo = context.getBean(EmployeeRepo.class);
		 * 
		 * System.out.println(empRepo.getClass().getSimpleName());
		 * 
		 * Field[] declaredFields = empRepo.getClass().getDeclaredFields();
		 * 
		 * for (Field ff : declaredFields) { System.out.println(ff.getName()); }
		 * 
		 * // System.out.println(empRepo.save(emp1)); AddressRepositry adRepo =
		 * context.getBean(AddressRepositry.class); //
		 * System.out.println(adRepo.save(add1)); //
		 * System.out.println(adRepo.save(add2));
		 * 
		 * System.out.println("*****************");
		 * 
		 * System.out.println(empRepo.findById(4));
		 * 
		 * System.out.println(adRepo.saveAll(addresses));
		 * 
		 * System.out.println("finding the Employee from the Address");
		 * System.err.println("************"); Optional<Address> addd =
		 * adRepo.findById(4); if (addd.isPresent()) {
		 * System.out.println(addd.get().getEmp()); }
		 */

		EmployeeRepo repo = context.getBean(EmployeeRepo.class);

		// repo.save(emp1);
		/*
		 * System.out.println(repo.getAllStudent());
		 * 
		 * System.err.println("HQL QUERY....***********");
		 * 
		 * System.out.println(repo.getAllStudentsHQL());
		 */

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter Page Number"); int pageNo = scanner.nextInt(); int
		 * pageSize = 3;
		 * 
		 * // pagination PageRequest of = PageRequest.of(pageNo - 1, pageSize);
		 * Page<Employee> all = repo.findAll(of); List<Employee> list =
		 * all.getContent(); list.forEach(System.out::println);
		 * 
		 * // sorting
		 * 
		 * System.err.println("Sorting Texhniques"); Sort sort = Sort.by("empName");
		 * List<Employee> all2 = repo.findAll(sort); all2.forEach(System.out::println);
		 * 
		 * // sorting in asc/desc
		 * 
		 * Sort sort1 = Sort.by("empName").ascending(); List<Employee> all3 =
		 * repo.findAll(sort1); all3.forEach(System.out::println);
		 * 
		 * // Query By Example
		 * 
		 * Employee emp2 = new Employee(); emp2.setEmpName("Ujjawal");
		 */

		repo.save(emp1);

	}

}
