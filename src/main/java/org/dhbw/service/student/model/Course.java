package org.dhbw.service.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data // Lombok hinzufügt automatisch die Getter und Setter Methoden an die Klasse Student
//@AllArgsConstructor // Hinzufügt automatisch die Getter und Setter Methoden an die Klasse Student
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
}