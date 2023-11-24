package net.danny.StudentProject24470.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class AcademicUnit {
    @Id
    private String code;
    private String name;

    @Enumerated(EnumType.STRING)
    private EAcademicUnit unitType;

    @ManyToOne
    @JoinColumn(name = "parent_unit_code")
    private AcademicUnit parentUnit;

    public AcademicUnit() {
    }

    public AcademicUnit(String code, String name, EAcademicUnit unitType, AcademicUnit parentUnit) {
        this.code = code;
        this.name = name;
        this.unitType = unitType;
        this.parentUnit = parentUnit;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitType(EAcademicUnit unitType) {
        this.unitType = unitType;
    }

    public void setParentUnit(AcademicUnit parentUnit) {
        this.parentUnit = parentUnit;
    }
}
