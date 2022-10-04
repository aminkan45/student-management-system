package net.aminkan.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.aminkan.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
