
package com.uniModules.full;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

// Joda Time classes

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jsanarde
 */
public class Modules {
    private String courseName;
    private String courseCode;
    private List<Student> registeredStudents = new ArrayList<Student>();
    private DateTime startDate = new DateTime();
    private DateTime endDate = new DateTime();
    
    public Modules(String courseName, String courseCode, DateTime startDate, DateTime endDate) {
        //TODO: check with official modules
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    public void addStudent(Student student){
        this.registeredStudents.add(student);
    }
    
    public List<Student> getRegisteredStudents(){
        return this.registeredStudents;
    }

    @Override
    public String toString(){
        return "Course: " + courseName + "ID: " + courseCode +
               "\r\nStart date: " + this.startDate.toString() +
               "\r\nEnd date: " + this.endDate.toString() +
               "\r\nList of enrolled students:\r\n" + getRegisteredStudents().toString();
    }
}
