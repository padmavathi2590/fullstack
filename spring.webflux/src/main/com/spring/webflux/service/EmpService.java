package com.spring.webflux.service;

import com.spring.webflux.model.Employee;
import com.spring.webflux.repository.EmpRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;

import javax.management.Query;

//import javax.transaction.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class EmpService {
   // private final ReactiveMongoTemplate reactiveMongoTemplate;
    private final EmpRepository empRepository;

    public Flux<Employee> getAllEmployee(){
        return empRepository.findAll();
    }

}
