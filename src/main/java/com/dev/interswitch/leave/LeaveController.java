package com.dev.interswitch.leave;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/leave")
public class LeaveController {

    private final LeaveService leaveService;

    @Autowired
    public LeaveController(LeaveService leaveService) {
        this.leaveService = leaveService;
    }

    @GetMapping
    public List<Leave> getLeaves(){
        return leaveService.getLeaves();
    }

    @PostMapping
    public void reqisterNewLeave(@RequestBody Leave leave){
        leaveService.addNewLeave(leave);
    }

}
