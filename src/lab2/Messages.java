/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author mashit
 */
public class Messages {
    private double creditLow = .5, creditHigh = 4.0;
    
    public void PreReqErrMsg(){
    JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
    System.exit(0);
}
    public void CreditErrMsg(){
    JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range " + creditLow + " to " 
                    + creditHigh);
    System.exit(0);
    }
    
    public void CourseNameErrMsg(){
    JOptionPane.showMessageDialog(null,
                    "Error: Course Name cannot be null of empty string");
    System.exit(0);
    }
    
    public void CourseNumErrMsg(){
    JOptionPane.showMessageDialog(null,
                    "Error: Course Number cannot be null of empty string");
    System.exit(0);
    }
    
}
