package com.dev.interswitch.leave;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class LeaveConfig {

    @Bean
    CommandLineRunner commandLineRunner2(LeaveRepository leaveRepository){
        return args -> {
            Leave user1 = new Leave(
                    1L,
                    LocalDate.of(2000, 02, 5),
                    LocalDate.of(2000, 03, 5),
                    1,
                    true
            );
            Leave user2 = new Leave(
                    1L,
                    LocalDate.of(2000, 05, 5),
                    LocalDate.of(2000, 07, 5),
                    1,
                    true
            );

            leaveRepository.saveAll(
                    List.of(user1, user2)
            );
        };
    }
}
