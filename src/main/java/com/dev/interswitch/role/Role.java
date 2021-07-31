package com.dev.interswitch.role;

import javax.persistence.*;

@Entity
@Table
public class Role {
    @Id
    @SequenceGenerator(
            name = "role_sequence",
            sequenceName = "role_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "leave_sequence"
    )

    private Long Id;
    private  Long rolecode;
    private String roledescription;

    public Role() {
    }

    public Role(Long id, Long rolecode, String roledescription) {
        Id = id;
        this.rolecode = rolecode;
        this.roledescription = roledescription;
    }

    public Role(Long rolecode, String roledescription) {
        this.rolecode = rolecode;
        this.roledescription = roledescription;
    }

    public Long getId() {
        return Id;
    }

    public Long getRolecode() {
        return rolecode;
    }

    public String getRoledescription() {
        return roledescription;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setRolecode(Long rolecode) {
        this.rolecode = rolecode;
    }

    public void setRoledescription(String roledescription) {
        this.roledescription = roledescription;
    }

    @Override
    public String toString() {
        return "Role{" +
                "Id=" + Id +
                ", rolecode=" + rolecode +
                ", roledescription='" + roledescription + '\'' +
                '}';
    }
}
