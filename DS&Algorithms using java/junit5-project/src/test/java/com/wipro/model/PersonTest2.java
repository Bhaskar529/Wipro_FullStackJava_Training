package com.wipro.model;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
public class PersonTest2 {
	@Test
	void testGetAddress() {
		Person person = new Person(987676767891L,"Smith",GenderTyp.MALE,LocalDate.of(1998, 10,10),"Hyderabad",8767543255L);
		assertEquals("Hyderabad", person.getAddress());
	}
	@Test
	void testSetAddress() {
		Person person = new Person(987676767891L,"Smith",GenderTyp.MALE,LocalDate.of(1998, 10,10),"Hyderabad",8767543255L);
		person.setAddress("Chennai");
		assertEquals("Chennai", person.getAddress());
	}
	@Test
	void testGetMobile() {
		Person person= new Person();
		person.setMobile(8767898999L);
		assertNotEquals(9878999989L,person.getMobile());
	}
	@Test
	void testSetMobile() {
		Person person = new Person(987676767891L,"Smith",GenderTyp.MALE,LocalDate.of(1998, 10,10),"Hyderabad",8767543255L);
		person.setMobile(9759871239L);
		assertEquals(9759871239L,person.getMobile());
	}
}
