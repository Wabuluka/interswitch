package com.dev.interswitch.leave;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Leave {
    @Id
    @SequenceGenerator(
            name = "leave_sequence",
            sequenceName = "leave_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "leave_sequence"
    )
    private Long id;
    private Long user;
    private LocalDate startdate;
    private LocalDate endtime;
    private int period;
    private boolean status;

    public Leave(){}

    public Leave(Long id, Long user, LocalDate startdate, LocalDate endtime, int period, boolean status) {
        this.id = id;
        this.user = user;
        this.startdate = startdate;
        this.endtime = endtime;
        this.period = period;
        this.status = status;
    }

    public Leave(Long user, LocalDate startdate, LocalDate endtime, int period, boolean status) {
        this.user = user;
        this.startdate = startdate;
        this.endtime = endtime;
        this.period = period;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Long getUser() {
        return user;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public LocalDate getEndtime() {
        return endtime;
    }

    public int getPeriod() {
        return period;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public void setEndtime(LocalDate endtime) {
        this.endtime = endtime;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "id=" + id +
                ", user=" + user +
                ", startdate=" + startdate +
                ", endtime=" + endtime +
                ", period=" + period +
                ", status=" + status +
                '}';
    }
}

