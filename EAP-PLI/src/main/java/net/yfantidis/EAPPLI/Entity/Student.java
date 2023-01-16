package net.yfantidis.EAPPLI.Entity;

import jakarta.persistence.*;


@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String fatherName;
    private String motherName;
    private String city;
    private String phoneNumber;


}
