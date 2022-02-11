/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package courses;

/**
 *
 * @author ajay
 */
public class Course {
    
    private int courseID;
    private String courseTitle;
    private int creditHrs;

    public Course(int courseID, String courseTitle, int creditHrs) {
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.creditHrs = creditHrs;
    }
    
    public Course(int courseID, String courseTitle){
        this.courseID = courseID;
        this.courseTitle = courseTitle;
        this.creditHrs = 3;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCreditHrs() {
        return creditHrs;
    }

    public void setCreditHrs(int creditHrs) {
        this.creditHrs = creditHrs;
    }

    @Override
    public String toString() {
        return "Course{" + "courseID=" + courseID + ", courseTitle=" + courseTitle + ", creditHrs=" + creditHrs + '}';
    }
    
    
    
    
}
