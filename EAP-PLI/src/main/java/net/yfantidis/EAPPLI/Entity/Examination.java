package net.yfantidis.EAPPLI.Entity;

import jakarta.persistence.*;

public class Examination {

    private double grade;
    private boolean isPass;

    @ManyToOne
    private Student student;
    @ManyToOne
    private Lesson lesson;
    @ManyToOne
    private Professor professor;


}
