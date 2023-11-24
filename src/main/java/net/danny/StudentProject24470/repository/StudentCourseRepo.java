package net.danny.StudentProject24470.repository;


import net.danny.StudentProject24470.domain.Course;
import net.danny.StudentProject24470.domain.StudentCourse;
import net.danny.StudentProject24470.domain.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentCourseRepo extends JpaRepository<StudentCourse, Integer> {
    boolean existsByCourse(Course course);
    List<StudentCourse> findByStudentRegistration(StudentRegistration studentRegistration);
    List<StudentCourse> findByCourseAndStudentRegistration(Course course, StudentRegistration studentRegistration);
}
