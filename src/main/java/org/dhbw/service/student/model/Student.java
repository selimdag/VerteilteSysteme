package org.dhbw.service.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data // Lombok hinzufügt automatisch die Getter und Setter Methoden an die Klasse Student
@AllArgsConstructor // Damit wird automatisch ein Konstruktor erstellt, der ALLE Klassenvariablen als Parameter erwartet.
@RequiredArgsConstructor // Damit wird automatisch ein Konstruktor erstellt, eine Klassenvariable als Parameter erwartet.
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String studentNumber;
}