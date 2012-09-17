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
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse() {

    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            msg.CourseNumErrMsg();
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if((credits%.5 != 0) || credits < 0.5 || credits > 4.0) {
            msg.CreditErrMsg();
            System.exit(0);
        }
        this.credits = credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            msg.PreReqErrMsg();
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            msg.CourseNameErrMsg();
            System.exit(0);
        }
        this.courseName = courseName;
    }

    
}
