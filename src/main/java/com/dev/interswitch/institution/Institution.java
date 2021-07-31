package com.dev.interswitch.institution;

import javax.persistence.*;

@Entity
@Table
public class Institution {

    @Id
    @SequenceGenerator(
            name = "institution_sequence",
            sequenceName = "institution_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "leave_sequence"
    )
    private Long Id;
    private Long institutioncode;
    private String institutionname;

    public Institution() {
    }

    public Institution(Long id, Long institutioncode, String institutionname) {
        Id = id;
        this.institutioncode = institutioncode;
        this.institutionname = institutionname;
    }

    public Institution(Long institutioncode, String institutionname) {
        this.institutioncode = institutioncode;
        this.institutionname = institutionname;
    }

    public Long getId() {
        return Id;
    }

    public Long getInstitutioncode() {
        return institutioncode;
    }

    public String getInstitutionname() {
        return institutionname;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setInstitutioncode(Long institutioncode) {
        this.institutioncode = institutioncode;
    }

    public void setInstitutionname(String institutionname) {
        this.institutionname = institutionname;
    }

    @Override
    public String toString() {
        return "Institution{" +
                "Id=" + Id +
                ", institutioncode=" + institutioncode +
                ", institutionname='" + institutionname + '\'' +
                '}';
    }
}
