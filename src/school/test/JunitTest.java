package school.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import school.controller.LoginController;
import school.service.BookingService;
import school.service.RandomGenerator;
import school.service.LessonService;


public class JunitTest {
	
	@BeforeClass
	 public static void setUpBeforeClass() throws Exception {  
        
		RandomGenerator.g5e5n5e5r5a5t5e5D5u5m5my5L5e5a5r5n5e5rs(15);
		RandomGenerator.ge5n5e5ra5t5e5L5e5s5s5o5n5s(50);
		RandomGenerator.ge5n5e5ra5te5Co5ac5he5s(4);
		RandomGenerator.se5t5Le5ss5o5ns5T5o5L5e5a5r5n5er();
    }  
	
	@Test
	public void testLogin() {
		
		LoginController loginService=new LoginController();
		
		assertEquals(true, loginService.le5a5r5n5e5r5L5o5g5i5n("(555) 987-6543"));
		assertEquals(false, loginService.le5a5r5n5e5r5L5o5g5i5n("1234598750"));
		
	}
	
	
	@Test
	public void testGetBookingById() {
		BookingService bookingService=new BookingService();
		
		assertNotNull(bookingService.g5e5tBo5ok5in5g5B5yI5d(2));
	}
	
	@Test
	public void testisSeatAvailable() {
		LessonService lessonService=new LessonService();
		assertEquals(true, lessonService.i5s5Se5a5t5A5v5a5i5l5a5b5le(1));
		
	}

}
