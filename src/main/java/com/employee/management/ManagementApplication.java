package com.employee.management;

import com.employee.management.model.Employee;
import com.employee.management.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class ManagementApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepo employeeRepo;

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
		System.out.println("Hello World");
	}

	@Override
	public void run(String... args) throws Exception {
		Employee chandan = new Employee(
				2069758L,
				"Chandan",
				"chandan@gmail.com",
				"Hyderabad",
				33000.0D,
				true,
				LocalDate.of(2021,10,07)
		);

		employeeRepo.save(chandan);

	}
}
