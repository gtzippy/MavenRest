package edu.gatech.sad.project4.entities;
// Generated Nov 26, 2015 12:46:12 AM by Hibernate Tools 4.3.1



/**
 * Studentcourseassignmenttable generated by hbm2java
 */
public class Studentcourseassignmenttable  implements java.io.Serializable {


     private StudentcourseassignmenttableId id;
     private String courseCode;

    public Studentcourseassignmenttable() {
    }

	
    public Studentcourseassignmenttable(StudentcourseassignmenttableId id) {
        this.id = id;
    }
    public Studentcourseassignmenttable(StudentcourseassignmenttableId id, String courseCode) {
       this.id = id;
       this.courseCode = courseCode;
    }
   
    public StudentcourseassignmenttableId getId() {
        return this.id;
    }
    
    public void setId(StudentcourseassignmenttableId id) {
        this.id = id;
    }
    public String getCourseCode() {
        return this.courseCode;
    }
    
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }




}


