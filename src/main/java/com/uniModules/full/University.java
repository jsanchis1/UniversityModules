package com.uniModules.full;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 *
 * @author jsanarde
 */
public class University {
    public static void main(String[] args){
        //studentName, int age, Date DOB, String username, String password
    	// DateTime date = new DateTime(2017, 1, 15, 0, 0, 0, 0);
    	DateTime moduleStartDate = new DateTime(2017, 1, 1, 9, 0, 0, 0);
    	DateTime moduleEnd = new DateTime(2018, 5, 30, 14, 0, 0, 0);
        Modules computing = new Modules("Computing Systems", "CT101", moduleStartDate, moduleEnd);
        Modules algorithms = new Modules("Algorithms and Information Systems", "CT102", moduleStartDate, moduleEnd);

		Student john = new Student("John Doe", 19, DateTime.parse("12/09/1995",  DateTimeFormat.forPattern("dd/MM/yyyy")), "JD" , "JD");
        Student jif = new Student("jif sulliban", 19, DateTime.parse("11/11/1995",  DateTimeFormat.forPattern("dd/MM/yyyy")), "JS" , "JS");
        
        computing.addStudent(john);
        algorithms.addStudent(john);
        john.addModule("CT101");
        john.addModule("CT102");
        
        computing.addStudent(jif);
        algorithms.addStudent(jif);
        jif.addModule("CT101");
        jif.addModule("CT102");
        
        
        System.out.println(computing.toString());
        System.out.println("\r\n\r\n");
        System.out.println(algorithms.toString());
        
    }
}
