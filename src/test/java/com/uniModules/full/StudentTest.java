package com.uniModules.full;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Test;

import junit.framework.TestCase;

public class StudentTest extends TestCase{
	
	@Test
	public void testAddValidModule() {
		Student maryAdam = new Student("Mary Adam", 22, DateTime.parse("12/09/1995",  DateTimeFormat.forPattern("dd/MM/yyyy")), "maryAdam", "1234");
		maryAdam.addModule("CT101");
		assertTrue(maryAdam.getModuleList().contains("CT101"));
	}
	
	@Test
	public void testAddInvalidModule() {
		Student seniorCash = new Student("Johnny Cash", 22, DateTime.parse("12/09/1995",  DateTimeFormat.forPattern("dd/MM/yyyy")), "mrCash", "1234");
		seniorCash.addModule("CT10100");
		assertFalse(seniorCash.getModuleList().contains("CT10100"));
	}
	
	@Test
	public void testGetUsername() {
		Student lchino = new Student("El Tigre Chino", 22, DateTime.parse("12/09/1995",  DateTimeFormat.forPattern("dd/MM/yyyy")), "mrLion", "1234");
		String getterValue = lchino.getUsername();
		assertEquals(getterValue, "El Tigre Chino 22");
	}

}
