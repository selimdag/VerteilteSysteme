package org.dhbw.service.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Lombok hinzufügt automatisch die Getter und Setter Methoden an die Klasse Student
@AllArgsConstructor // Hinzufügt automatisch die Getter und Setter Methoden an die Klasse Student
public class Student {

    private Long id;
    private String firstName;
    private String lastName;
    private String studentNumber;
}