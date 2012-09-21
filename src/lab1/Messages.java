
package lab1;

import javax.swing.JOptionPane;


public class Messages {
    private double creditLow = .5, creditHigh = 4.0;
    
    
    public final void PreReqErrMsg(){
    JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
    System.exit(0);
}
    public final void CreditErrMsg(){
    JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range " + creditLow + " to " 
                    + creditHigh);
    System.exit(0);
    }
    
    public final void CourseNameErrMsg(){
    JOptionPane.showMessageDialog(null,
                    "Error: Course Name cannot be null of empty string");
    System.exit(0);
    }
    
    public final void CourseNumErrMsg(){
    JOptionPane.showMessageDialog(null,
                    "Error: Course Number cannot be null of empty string");
    System.exit(0);
    }
    
}
