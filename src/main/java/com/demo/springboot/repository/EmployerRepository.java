package com.demo.springboot.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.demo.springboot.domain.Employer;

@Repository
@Transactional
public interface EmployerRepository extends JpaRepositoryImplementation<Employer, Long> {


}
