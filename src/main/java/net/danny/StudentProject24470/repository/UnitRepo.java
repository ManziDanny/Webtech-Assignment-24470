package net.danny.StudentProject24470.repository;


import net.danny.StudentProject24470.domain.AcademicUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepo extends JpaRepository<AcademicUnit,String> {
}
