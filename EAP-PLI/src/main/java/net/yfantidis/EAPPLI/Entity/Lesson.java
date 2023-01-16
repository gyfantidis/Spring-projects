package net.yfantidis.EAPPLI.Entity;


import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String abbreviation;
    private String year;
    private int numberOfAssignments;
    private boolean isElective;
    private double grade;

    @OneToOne
    private Examination examination;

    @OneToMany
    private Set<Assignment> assignmentSet = new HashSet<>();



}
