package com.dev.interswitch;

import com.dev.interswitch.leave.Leave;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class InterswitchApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterswitchApplication.class, args);
	}



}
