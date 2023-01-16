package net.yfantidis.EAPPLI.entity;

import jakarta.persistence.*;

@Entity
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int assignmentsSeries;
    private double grade;

    @ManyToOne
    private Lesson lesson;

    public Assignment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAssignmentsSeries() {
        return assignmentsSeries;
    }

    public void setAssignmentsSeries(int assignmentsSeries) {
        this.assignmentsSeries = assignmentsSeries;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }
}
