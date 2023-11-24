package net.danny.StudentProject24470.repository;


import net.danny.StudentProject24470.domain.CourseDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDefRepo extends JpaRepository<CourseDefinition,String> {
}
