package net.aminkan.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.aminkan.sms.entity.Student;
import net.aminkan.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1 = new Student("Ant", "Ant", "Ant-Ant@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Captain", "america", "Captain-america@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Iron ", "Man", "Iron-Man@gmail.com");
		 * studentRepository.save(student3);
		 */
		
	}

}
