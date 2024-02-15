package aggregation2;

import aggregation.Instructor;
import aggregation.Textbook;

/*
    Code was modified from original in package aggregation
    to include a second instructor and second textbook
 */
public class CourseDriver {
    public static void main(String[] args) {
        Instructor firstInstructor = new Instructor("Nima", "Davarpanah", "3-2636"),
                secondInstructor = new Instructor("John", "Smith", "827");
        Textbook firstTextbook = new Textbook("Clean Code", "Robert C. Martin", "Pearson"),
                secondTextbook = new Textbook("Design Patterns", "Erich Gamma", "Addison-Wesley");
        Course course = new Course("CS 4800", firstInstructor, secondInstructor, firstTextbook, secondTextbook);

        course.print();
    }
}
