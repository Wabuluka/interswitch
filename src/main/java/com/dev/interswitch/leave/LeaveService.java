package com.dev.interswitch.leave;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeaveService {

    private final LeaveRepository leaveRepository;

    @Autowired
    public LeaveService(LeaveRepository leaveRepository) {
        this.leaveRepository = leaveRepository;
    }

    public List<Leave> getLeaves(){ return leaveRepository.findAll(); }

    public void addNewLeave(Leave leave) {
        /*
        Optional<Leave> leaveByUser = leaveRepository
                .findLeaveByUser(leave.getUser());
        if(leaveByUser.isPresent()){
            throw  new IllegalStateException("User Already on leave hence can not be on double leave");
        }*/
        leaveRepository.save(leave);
    }
}
