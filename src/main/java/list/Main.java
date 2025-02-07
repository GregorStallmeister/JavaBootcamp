package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Max", "Mustermann", 0));
        students.add(new Student("Maxi", "Musterfrau", 1));
        students.add(new Student("Egon", "Hinterseher", 2));

        School school = new School();

        for (Student currentStudent : students)
            school.addStudent(currentStudent);

        System.out.println(school);

        System.out.println();
        System.out.println("find student 0");
        System.out.println(school.findStudent(0));
    }
}
