package com.dev.interswitch.bank;

import javax.persistence.*;

@Entity
@Table
public class Bank {
    @javax.persistence.Id
    @SequenceGenerator(
            name = "bank_sequence",
            sequenceName = "bank_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "leave_sequence"
    )
    private Long Id;
    private Long branchcode;
    private String branchname;

    public Bank() {
    }

    public Bank(Long id, Long branchcode, String branchname) {
        Id = id;
        this.branchcode = branchcode;
        this.branchname = branchname;
    }

    public Bank(Long branchcode, String branchname) {
        this.branchcode = branchcode;
        this.branchname = branchname;
    }

    public Long getId() {
        return Id;
    }

    public Long getBranchcode() {
        return branchcode;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setBranchcode(Long branchcode) {
        this.branchcode = branchcode;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "Id=" + Id +
                ", branchcode=" + branchcode +
                ", branchname='" + branchname + '\'' +
                '}';
    }
}
