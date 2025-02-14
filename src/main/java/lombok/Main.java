package lombok;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("S01", "Fred", "Teststraße 1, 12345 Teststadt", 9.5);
        System.out.println(student1);

        Student student2 = new Student("002", "Maxi", "The High Street 23", 2.1);
        Student student3 = new Student("003", "Maurice", "Vanderstraat 42", 4.3);

        Teacher teacher1 = new Teacher("001", "Karl", "Math");
        Teacher teacher2 = new Teacher("002", "Charly", "Physics");

        ArrayList<Student> studCourse1 = new ArrayList<>();
        studCourse1.add(student1);
        studCourse1.add(student2);
        Course course1 = new Course("001", "Math 1", teacher1, studCourse1);

        System.out.println(course1);

        ArrayList<Student> studCourse2 = new ArrayList<>();
        studCourse2.add(student1);
        studCourse2.add(student3);
        Course course2 = new Course("002", "Physics 1", teacher2, studCourse2);
        System.out.println(course2);

//        course2.setName("Physics 2"); // is not provided anymore, cause to @Value in class Course
        System.out.println(course2);

        Student student4 = Student
                .builder()
                .id("004")
                .build();

        System.out.println(student4);

        Teacher teacher3 = teacher1.withId("003").withName("Mini Mouse");

        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(teacher3);
    }
}
