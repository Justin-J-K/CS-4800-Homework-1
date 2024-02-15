package aggregation2;

import aggregation.Instructor;
import aggregation.Textbook;

/*
    Code was modified from original in package aggregation
    to include a second instructor and second textbook
 */
public class Course {
    private String name;
    private Instructor firstInstructor, secondInstructor;
    private Textbook firstTextbook, secondTextbook;

    public Course(String name, Instructor firstInstructor, Instructor secondInstructor,
                  Textbook firstTextbook, Textbook secondTextbook) {
        this.name = name;
        this.firstInstructor = firstInstructor;
        this.secondInstructor = secondInstructor;
        this.firstTextbook = firstTextbook;
        this.secondTextbook = secondTextbook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getFirstInstructor() {
        return firstInstructor;
    }

    public void setFirstInstructor(Instructor firstInstructor) {
        this.firstInstructor = firstInstructor;
    }

    public Instructor getSecondInstructor() {
        return secondInstructor;
    }

    public void setSecondInstructor(Instructor secondInstructor) {
        this.secondInstructor = secondInstructor;
    }

    public Textbook getFirstTextbook() {
        return firstTextbook;
    }

    public void setFirstTextbook(Textbook firstTextbook) {
        this.firstTextbook = firstTextbook;
    }

    public Textbook getSecondTextbook() {
        return secondTextbook;
    }

    public void setSecondTextbook(Textbook secondTextbook) {
        this.secondTextbook = secondTextbook;
    }

    public void print() {
        System.out.printf("Course %s instructed by %s %s and %s %s has the textbooks %s by %s and %s by %s\n",
                name, firstInstructor.getFirstName(), firstInstructor.getLastName(), secondInstructor.getFirstName(),
                secondInstructor.getLastName(), firstTextbook.getTitle(), firstTextbook.getAuthor(), secondTextbook.getTitle(),
                secondTextbook.getAuthor());
    }
}
