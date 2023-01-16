package net.yfantidis.EAPPLI.Entity;

import jakarta.persistence.Entity;

@Entity
public class Lesson {

    private String name;
    private String abbreviation;
    private String year;
    private int numberOfAssignments;
    private boolean isElective;
    private double grade;



}
