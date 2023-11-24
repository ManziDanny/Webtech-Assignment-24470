package net.danny.StudentProject24470.repository;


import net.danny.StudentProject24470.domain.AcademicUnit;
import net.danny.StudentProject24470.domain.Course;
import net.danny.StudentProject24470.domain.CourseDefinition;
import net.danny.StudentProject24470.domain.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
    boolean existsByDepartmentAndSemester(AcademicUnit department, Semester semester);
    public boolean existsByCourseDefinition(CourseDefinition courseDefinition);
    List<Course> findByDepartmentAndSemester(AcademicUnit department, Semester semester);

}
