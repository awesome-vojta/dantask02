package com.dantask01;

import static org.junit.Assert.*;

import com.dantask01.entities.Employee;
import com.dantask01.marsh.ParseInstance;
import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InstantiateTest {

    //
    @Test
    public void test() throws ParseException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2009-10-12");

        Employee e = ParseInstance.instantiate();

        assertEquals("Joe",e.getFirstName());
        assertEquals("Smith",e.getLastName());
        assertEquals("Developer",e.getTitle());
        assertEquals(75000,e.getSalary());
        assertEquals(date,e.getHireDate());
    }
}
