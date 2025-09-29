package com.jobPortal.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobPortal.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
  Optional<Student> findByEmail(String email);
  Optional<Student> findById(Long id);
}
