package com.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.model.Employee;
import com.jpa.model.Tache;
import com.jpa.repositories.EmployeeRepository;
import com.jpa.repositories.TacheRepository;

@SpringBootApplication
public class Webmvcjpaj2Application implements CommandLineRunner {

	@Autowired
	//dependency injection
	EmployeeRepository employeeRepository;
	@Autowired
	TacheRepository tacheRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Webmvcjpaj2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee em1=new Employee(null, "test1", 26,"user@gmail.com","password1");
		employeeRepository.save(em1);
		Tache t1=new Tache(0,"visite médicale");
		tacheRepository.save(t1);
		// TODO Auto-generated method stub
		//System.out.println("it is working");
		/*
		 * Employee em1=new Employee(null, "test1", 26);
		Employee em2=new Employee(null, "test2", 56);
		Employee em3=new Employee(null, "khalil", 33);

		employeeRepository.save(em1);
		employeeRepository.save(em2);
		employeeRepository.save(em3);
		System.out.println("---liste compléte---");
		employeeRepository.findByAgeLessThan(30).forEach(em->{
			System.out.println(em.toString());
		});
		
		System.out.println("---recherhce par nom---");
		employeeRepository.findByName("khalil").forEach(em->{
			System.out.println(em.toString());
		});
		*/
	}

}
