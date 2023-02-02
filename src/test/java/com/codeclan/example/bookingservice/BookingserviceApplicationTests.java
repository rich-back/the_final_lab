package com.codeclan.example.bookingservice;

import com.codeclan.example.bookingservice.models.Booking;
import com.codeclan.example.bookingservice.models.Course;
import com.codeclan.example.bookingservice.models.Customer;
import com.codeclan.example.bookingservice.repositories.BookingRepository;
import com.codeclan.example.bookingservice.repositories.CourseRepository;
import com.codeclan.example.bookingservice.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
class BookingserviceApplicationTests {

	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	CourseRepository courseRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateBooking() {
		Customer luis = new Customer("Luis", "Madrid", 28);
		Course codeclan = new Course("PSD", "Edinburgh", 3);
		Booking booking1 = new Booking("01-10-2022", codeclan, luis);

		customerRepository.save(luis);
		courseRepository.save(codeclan);
		bookingRepository.save(booking1);

	}

}
