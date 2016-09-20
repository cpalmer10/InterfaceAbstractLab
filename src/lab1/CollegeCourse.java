/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Chris
 */
public interface CollegeCourse {
    public String getCourseNumber();
    public void setCourseNumber(String courseNumber);
    public String getPrerequisites();
    public void setPrerequisites(String prerequisites);
    public void setCredits(double credits);
    public double getCredits();
    
}
