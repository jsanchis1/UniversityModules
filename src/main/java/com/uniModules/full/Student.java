package com.uniModules.full;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 *
 * @author jsanarde
 */
public class Student {
    private int MAX_studenModules = 10;
    private String studentName;
    private int age;
    private DateTime DOB;
    private String username;
    private String password;
    
    private List<String> moduleList = new ArrayList<String>(MAX_studenModules);

    //private studentModules modules
    
    public Student(String studentName, int age, DateTime DOB, String username, String password){
        this.studentName = studentName;
        this.age = age;
        this.DOB = DOB;
        this.username = username;
        this.password = password;
        
        //TODO: validate date
        //TODO: implement dataChecks
    }
    
    public void addModule(String courseCode){
    	boolean isValid = false;
        for (OfficialModules module : OfficialModules.values()){
            if (module.courseCode() == courseCode) {
                isValid = true;
                break;
            }
        }
        if (!isValid || moduleList.size() >= MAX_studenModules ) {
            System.out.println("Unable to add module, not a valid code");;
        } else {
        	this.moduleList.add(courseCode);
        }
    }
        
    public int getAge(){
        return this.age;
    }
    
    public DateTime getDOB(){
        return this.DOB;
    }
    
    public String getUsername(){
        return this.studentName + " " + this.age;
    }

    public String toString(){
        return "Student: " + this.studentName + "\r\nUsername: " +
                this.username + " passwrod: " + this.password +
                "\r\nDOB: " + this.DOB.toString();
    }
    
    public List<String> getModuleList(){
        return this.moduleList;
    }
    
}
