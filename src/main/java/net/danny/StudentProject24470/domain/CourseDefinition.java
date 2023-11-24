package net.danny.StudentProject24470.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class CourseDefinition {
    @Id
    private String code;
    private String name;
    private String description;

    public CourseDefinition() {
    }

    public CourseDefinition(String code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
