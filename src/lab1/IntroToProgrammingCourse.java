package lab1;


/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ProgrammingCourse {
    private String prerequisites = "None";
    public IntroToProgrammingCourse(){
        
    }
    
    @Override
    public String getPrerequisites() {
        return prerequisites;
    }
    
    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = "None";
    }
    
}
