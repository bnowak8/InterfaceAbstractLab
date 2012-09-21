
package lab2;


public class Start {
    
    public static void main(String[] args) {
    AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advanced Java","1",4,"Intro To Programming, Intro To Java");
    IntroJavaCourse introJava= new IntroJavaCourse("Intro to Java", "2",3,"Intro To Programming");
    IntroToProgrammingCourse introProgramming = new IntroToProgrammingCourse("Intro to Programming","3",2);
    
   
    
    System.out.println("Course Name: " + advJava.getCourseName() +
                "\nCourse Number: " + advJava.getCourseNumber() +
                "\nCredits: " + advJava.getCredits() +
                "\nPrerequisites: " + advJava.getPrerequisites() + "\n");
  
   
   System.out.println("Course Name: " + introJava.getCourseName() +
            "\nCourse Number: " + introJava.getCourseNumber() +
            "\nCredits: " + introJava.getCredits() +
            "\nPrerequisites: " + introJava.getPrerequisites() + "\n");

   
   System.out.println("Course Name: " + introProgramming.getCourseName() +
            "\nCourse Number: " + introProgramming.getCourseNumber() +
            "\nCredits: " + introProgramming.getCredits());

    }
}
