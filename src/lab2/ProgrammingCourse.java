/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author mashit
 */
public interface ProgrammingCourse {
    
    Messages msg = new Messages();

    public String getCourseNumber();

    public void setCourseNumber(String courseNum);

    public double getCredits();

    public void setCredits(double credits);

    public String getCourseName();

    public void setCourseName(String courseName);
    
}
