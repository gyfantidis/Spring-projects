package net.yfantidis.EAPPLI.entity;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
public class Examination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double grade;
    private boolean isPass;


    @OneToOne
    private Lesson lesson;

    public Examination() {
    }

    public Examination(double grade, boolean isPass, Lesson lesson) {
        this.grade = grade;
        this.isPass = isPass;
        this.lesson = lesson;
    }

    public Examination(double grade, boolean isPass) {
        this.grade = grade;
        this.isPass = isPass;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Examination{" +
                "id=" + id +
                ", grade=" + grade +
                ", isPass=" + isPass +
                ", lesson=" + lesson +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Examination that = (Examination) o;

        if (Double.compare(that.grade, grade) != 0) return false;
        if (isPass != that.isPass) return false;
        if (!Objects.equals(id, that.id)) return false;
        return Objects.equals(lesson, that.lesson);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        temp = Double.doubleToLongBits(grade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isPass ? 1 : 0);
        result = 31 * result + (lesson != null ? lesson.hashCode() : 0);
        return result;
    }
}
