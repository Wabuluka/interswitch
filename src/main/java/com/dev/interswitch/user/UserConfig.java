package com.dev.interswitch.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args ->{
            User mariam = new User(
                    "MariamD",
                    "mariam@gmail.com",
                    "Nakiboneka",
                    "Mariam",
                    "MariaDB@123"
            );

            User davies = new User(
                    "DaviesD",
                    "davies@gmail.com",
                    "Wabuluka",
                    "Davies",
                    "davies123"
            );

            userRepository.saveAll(
                    List.of(mariam, davies)
            );
        };
    }
}
