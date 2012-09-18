
package lab1;


public class Start {
    
    public static void main(String[] args) {
    AdvancedJavaCourse advJava = new AdvancedJavaCourse();
    IntroJavaCourse introJava = new IntroJavaCourse();
    IntroToProgrammingCourse introProgramming = new IntroToProgrammingCourse();
    
    
    advJava.setCourseName("Advanced Java");
    advJava.setCourseNumber("1");
    advJava.setCredits(4);
    advJava.setPrerequisites("Intro To Programming, Intro to Java");
    
    
    //Used just to show the functuallity////////////////////////////////
    
    System.out.println("Course Name: " + advJava.getCourseName() +
             "\nCourse Number: " + advJava.getCourseNumber() +
             "\nCredits: " + advJava.getCredits() +
             "\nPrerequisites: " + advJava.getPrerequisites() + "\n");
   /////////////////////////////////////////////////////////////////////
    
   introJava.setCourseName("Intro To Java");
   introJava.setCourseNumber("2");
   introJava.setCredits(3.0);
   introJava.setPrerequisites("Intro To Programming");
   
   System.out.println("Course Name: " + introJava.getCourseName() +
            "\nCourse Number: " + introJava.getCourseNumber() +
            "\nCredits: " + introJava.getCredits() +
            "\nPrerequisites: " + introJava.getPrerequisites() + "\n");

   introProgramming.setCourseName("Intro To Programming");
   introProgramming.setCourseNumber("3");
   introProgramming.setCredits(2.0);
   
   System.out.println("Course Name: " + introProgramming.getCourseName() +
            "\nCourse Number: " + introProgramming.getCourseNumber() +
            "\nCredits: " + introProgramming.getCredits());



}

}
