/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniModules.full;
/**
 *
 * @author jsanarde
 */
public enum OfficialModules {
    CT101("Computing Systems", "CT101"),
    CT102("Algorithms and Information Systems", "CT102"),
    CT103("Programming", "CT103"),
    CT421("Artificial Intelligence", "CT421"),
    CT417("Software Engineering III", "CT421");
    
    private final String courseName;
    private final String courseCode;

    private OfficialModules(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    
    public String courseName(){return courseName; }
    public String courseCode(){return courseCode; }
    
    @Override
    public String toString(){
        return "Module: " + courseName() + "Code: " + courseCode();
    }
}
