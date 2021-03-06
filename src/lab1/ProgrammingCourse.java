
package lab1;


public abstract class ProgrammingCourse {
   
    
    private String courseName;
    private String courseNumber;
    private double credits, creditLow = .5, creditHigh = 4.0;
    private String prerequisites;
    Messages msg = new Messages();

    public final String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }


    public final void setCredits(double credits) {

        if((credits%.5 != 0) || credits < creditLow || credits > creditHigh) {
            msg.CreditErrMsg();
        }
        this.credits = credits;
    }
    
    public final double getCredits(){
        return credits;
    }
   
    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0){
            msg.CourseNameErrMsg();
           }
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0){
            msg.CourseNumErrMsg();
        }
        this.courseNumber = courseNumber;
    }
    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            msg.PreReqErrMsg();
        }
        this.prerequisites = prerequisites;
    }
}
