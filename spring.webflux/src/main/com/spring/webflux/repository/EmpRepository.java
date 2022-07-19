package com.spring.webflux.repository;

import com.spring.webflux.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends ReactiveMongoRepository<Employee, Integer>{

}
