package edu.gatech.sad.project4.entities;
// Generated Nov 26, 2015 12:46:12 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Studentpreferencestable generated by hbm2java
 */
public class Studentpreferencestable  implements java.io.Serializable {


     private Integer preferenceId;
     private Date date;
     private int studentId;
     private String courses;
     private int numCoursesDesired;
     private Integer processingStatusId;

    public Studentpreferencestable() {
    }

	
    public Studentpreferencestable(Date date, int studentId, String courses, int numCoursesDesired) {
        this.date = date;
        this.studentId = studentId;
        this.courses = courses;
        this.numCoursesDesired = numCoursesDesired;
    }
    public Studentpreferencestable(Date date, int studentId, String courses, int numCoursesDesired, Integer processingStatusId) {
       this.date = date;
       this.studentId = studentId;
       this.courses = courses;
       this.numCoursesDesired = numCoursesDesired;
       this.processingStatusId = processingStatusId;
    }
   
    public Integer getPreferenceId() {
        return this.preferenceId;
    }
    
    public void setPreferenceId(Integer preferenceId) {
        this.preferenceId = preferenceId;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public int getStudentId() {
        return this.studentId;
    }
    
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getCourses() {
        return this.courses;
    }
    
    public void setCourses(String courses) {
        this.courses = courses;
    }
    public int getNumCoursesDesired() {
        return this.numCoursesDesired;
    }
    
    public void setNumCoursesDesired(int numCoursesDesired) {
        this.numCoursesDesired = numCoursesDesired;
    }
    public Integer getProcessingStatusId() {
        return this.processingStatusId;
    }
    
    public void setProcessingStatusId(Integer processingStatusId) {
        this.processingStatusId = processingStatusId;
    }




}


