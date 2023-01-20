package net.yfantidis.EAPPLI.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "admin_lesson")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String abbreviation;
    private String yearL;
    private int numberOfAssignments;
    private boolean isElective;
    private double grade;


    @OneToOne
    private Examination examination;

    @OneToOne
    private Coordinator coordinator;

    @OneToOne
    private Professor professor;

    @OneToMany
    @JoinColumn(name = "lesson_id")
    private Set<Assignment> assignment = new HashSet<>();


    @ManyToMany
    private Set<Student> students = new HashSet<>();

    public Lesson() {
    }

    public Lesson(String name, String abbreviation, String year, int numberOfAssignments, boolean isElective) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.yearL = year;
        this.numberOfAssignments = numberOfAssignments;
        this.isElective = isElective;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getYear() {
        return yearL;
    }

    public void setYear(String year) {
        this.yearL = year;
    }

    public int getNumberOfAssignments() {
        return numberOfAssignments;
    }

    public void setNumberOfAssignments(int numberOfAssignments) {
        this.numberOfAssignments = numberOfAssignments;
    }

    public boolean isElective() {
        return isElective;
    }

    public void setElective(boolean elective) {
        isElective = elective;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Examination getExamination() {
        return examination;
    }

    public void setExamination(Examination examination) {
        this.examination = examination;
    }

    public Coordinator getCoordinator() {
        return coordinator;
    }

    public void setCoordinator(Coordinator coordinator) {
        this.coordinator = coordinator;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Set<Assignment> getAssignmentSet() {
        return assignment;
    }

    public void setAssignmentSet(Set<Assignment> assignmentSet) {
        this.assignment = assignmentSet;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }


    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", year='" + yearL + '\'' +
                ", numberOfAssignments=" + numberOfAssignments +
                ", isElective=" + isElective +
                ", grade=" + grade +
                ", examination=" + examination +
                ", coordinator=" + coordinator +
                ", professor=" + professor +
                ", assignmentSet=" + assignment +
                ", students=" + students +
                '}';
    }
}
