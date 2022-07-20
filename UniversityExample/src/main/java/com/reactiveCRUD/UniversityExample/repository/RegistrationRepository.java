package com.reactiveCRUD.UniversityExample.repository;

import com.reactiveCRUD.UniversityExample.model.Student;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends ReactiveMongoRepository<Student,String> {
}
