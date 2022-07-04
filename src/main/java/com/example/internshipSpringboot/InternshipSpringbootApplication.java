package com.example.internshipSpringboot;

import com.example.internshipSpringboot.Entity.Booking;
import com.example.internshipSpringboot.Entity.Flight;
import com.example.internshipSpringboot.Entity.User;
import com.example.internshipSpringboot.Entity.userDetails;
import com.example.internshipSpringboot.Repository.BookingRepo;
import com.example.internshipSpringboot.Repository.FlightRepository;
import com.example.internshipSpringboot.Repository.Impl.userDetailsRepository;
import com.example.internshipSpringboot.Repository.userRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class InternshipSpringbootApplication {

	public static void main(String[] args) {

		SpringApplication.run(InternshipSpringbootApplication.class, args);
	}

    @Bean
	CommandLineRunner commandLineRunner(userRepository userRepository){
		return args -> {
			User test = new User(1,"Test","Test","Test");
		User klea= new User(2,"klea","test","admin");
          userRepository.save(test);
		  userRepository.save(klea);
		 userRepository.delete(test);
		};
	}

    @Bean
	CommandLineRunner commandLineRunner1(userDetailsRepository userDetailsRepository){
		return args -> {
			userDetails userDetailsTest = new userDetails(1,"Klea","Prifti","test@prifti.al","747372");
			userDetailsRepository.save(userDetailsTest);
			userDetails userDetailsTest2 = new userDetails(1,"Test1","Prifti","test1@prifti.al","744347372");
			userDetailsRepository.save(userDetailsTest2);
		//	userDetailsRepository.delete();
		};
	}

	@Bean
	CommandLineRunner commandLineRunner2 (BookingRepo bookingRepo){
		return args -> {

			Booking booking1 = new Booking(1,new Date(2021,12,3),"pending");
			bookingRepo.save(booking1);

			Booking booking2 = new Booking(1,new Date(2021,12,3),"pending");
			bookingRepo.save(booking2);
			bookingRepo.delete(booking1);

		};
	}
	@Bean
	CommandLineRunner commandLineRunner3 (FlightRepository flightRepository){
		return args -> {
			Flight flight1 = new Flight(1,"Test","Test1","Test","307",new Date(2022,07,04),new Date(2022,07,13),"arrived");
			flightRepository.save(flight1);

			Flight flight2 = new Flight(1,"Test","Test1","Test","307",new Date(2022,07,04),new Date(2022,07,13),"arrived");
			flightRepository.save(flight2);

			flightRepository.delete(flight1);

		};
	}
}
