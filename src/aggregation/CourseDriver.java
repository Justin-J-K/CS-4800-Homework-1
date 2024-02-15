package aggregation;

public class CourseDriver {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Pearson");
        Course course = new Course("CS 4800", instructor, textbook);

        course.print();
    }
}
