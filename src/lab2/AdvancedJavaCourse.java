
package lab2;


/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse implements ProgrammingCourse {
    private String courseName;
    private String courseNumber;
    private double credits, creditLow = .5, creditHigh = 4.0;
    private String prerequisites;

    public AdvancedJavaCourse(String name, String num, double credits, String prereq) {
        
        this.courseName = name;
        this.courseNumber = num;
        this.credits = credits;
        this.prerequisites = prereq;

    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            msg.CourseNumErrMsg();
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if((credits%.5 != 0) || credits < creditLow || credits > creditHigh) {
            msg.CreditErrMsg();
        }
        this.credits = credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            msg.PreReqErrMsg();
        }
        this.prerequisites = prerequisites;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            msg.CourseNameErrMsg();
        }
        this.courseName = courseName;
    }

    
}
