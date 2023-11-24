package net.danny.StudentProject24470.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Entity
public class StudentCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int credits;
    private BigDecimal results;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentRegistration studentRegistration;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public StudentCourse() {
    }

    public StudentCourse(int id, int credits, BigDecimal results, StudentRegistration studentRegistration, Course course) {
        this.id = id;
        this.credits = credits;
        this.results = results;
        this.studentRegistration = studentRegistration;
        this.course = course;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setResults(BigDecimal results) {
        this.results = results;
    }

    public void setStudentRegistration(StudentRegistration studentRegistration) {
        this.studentRegistration = studentRegistration;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
