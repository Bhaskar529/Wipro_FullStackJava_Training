

package com.wipro.model;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
public class PersonTest1 {
	@Test
	void testGetName() {
		Person person = new Person();
		person.setName("Clarke");
		assertEquals("Clarke",person.getName());
	}
	@Test
	void testSetName() {
		Person person = new Person();
		person.setName("Clarke");
		assertEquals("Clarke",person.getName());
	}
	@Test
	void testGetGender() {
		Person person = new Person();
		person.setGender(GenderTyp.MALE);
		assertEquals(GenderTyp.MALE,person.getGender());
	}
	@Test
	void testSetGender() {
		Person person = new Person();
		person.setGender(GenderTyp.MALE);
		assertEquals(GenderTyp.MALE,person.getGender());
	}
	@Test
	void testGetBirthdate() {
		Person person = new Person(987676767891L,"Smith",GenderTyp.MALE,LocalDate.of(1998, 10,10),"Hyderabad",8767543255L);
		assertEquals(LocalDate.of(1998, 1, 10), person.getBirthdate());
	}
	@Test
	void testSetBirthdate() {
		Person person = new Person(987676767891L,"Smith",GenderTyp.MALE,LocalDate.of(1998, 10,10),"Hyderabad",8767543255L);
		person.setBirthdate(LocalDate.of(2001, 1,1));
		assertEquals(LocalDate.of(2001, 1, 1), person.getBirthdate());
	}
	
}
