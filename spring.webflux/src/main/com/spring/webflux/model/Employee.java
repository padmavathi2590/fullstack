package com.spring.webflux.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Builder
@ToString
@EqualsAndHashCode(of = {"id","name","place"})
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "registration")

public class Employee {
    @Id
    private int id;
    private String name;
    private  String place;

}
