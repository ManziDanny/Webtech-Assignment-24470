package net.danny.StudentProject24470.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
@Table(name= "student")
public class Student {
    @Id
    @Column(name = "registration_number")
    private String registrationNumber;
    private String firstName;
    private String dateOfBirth;

    @OneToMany(mappedBy = "student")
    @JsonBackReference
    private List<StudentRegistration> registrations;

    public Student() {
    }

    public Student(String registrationNumber, String firstName, String dateOfBirth, List<StudentRegistration> registrations) {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.registrations = registrations;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setRegistrations(List<StudentRegistration> registrations) {
        this.registrations = registrations;
    }
}