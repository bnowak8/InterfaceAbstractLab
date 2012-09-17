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
    
    public void PreReqErrMsg(){
    JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
    System.exit(0);
}
    public void CreditErrMsg(){
    JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
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
