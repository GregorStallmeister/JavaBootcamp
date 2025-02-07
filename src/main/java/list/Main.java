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
        Student foundStudent = school.findStudent(0);
        System.out.println(foundStudent);
        System.out.println("remove this Student");
        school.removeStudent(foundStudent);
        System.out.println("School is now:");
        System.out.println(school);

        System.out.println("");
        System.out.println("Now create some courses in the school");
        school.addCourse(new Course("Java 1", "Florian", 0));
        school.addCourse(new Course("Java 2", "Florian", 0));
        school.addCourse(new Course("React 1", "Dominic", 1));
        school.addCourse(new Course("Java 2", "Dominic", 1));
        school.addCourse(new Course("HTML", "Marcell", 0));
        System.out.println("School is now:");
        System.out.println(school);

        System.out.println("");
        System.out.println("Now add courses to students");
        school.findStudent(0).addCourse(school.findCourse(1));
        school.findStudent(0).addCourse(school.findCourse(3));
        school.findStudent(0).addCourse(school.findCourse(4));
        school.findStudent(1).addCourse(school.findCourse(0));
        school.findStudent(1).addCourse(school.findCourse(4));
        System.out.println("School is now:");
        System.out.println(school);

        System.out.println("");
        System.out.println("Student 0 particpates in following courses:");
        System.out.println(school.findCoursesOfStudent(0));

        Pharmacy pharmacy = new Pharmacy();

        System.out.println();
        System.out.println("Now about the pharmacy and its medications:");
        System.out.println();
        System.out.println("Pharmacy medications:");
        pharmacy.printAllMedications();
        System.out.println("Number of medications: " + pharmacy.getCount());

        System.out.println();
        System.out.println("Add medications");
        pharmacy.save(new Medication("Ibu 400", 3.26, true));
        pharmacy.save(new Medication("Ibu 600", 6.25, false));
        pharmacy.save(new Medication("Aspirin 200", 2.65, true));
        System.out.println("Pharmacy medications:");
        pharmacy.printAllMedications();
        System.out.println("Number of medications: " + pharmacy.getCount());

        System.out.println();
        System.out.println("Find Medication Ibu 600");
        System.out.println(pharmacy.find("Ibu 600"));

        System.out.println();
        System.out.println("Delete Medication Ibu 600");
        pharmacy.delete("Ibu 600");
        System.out.println("Find Medication Ibu 600");
        System.out.println(pharmacy.find("Ibu 600"));

        System.out.println();
        System.out.println("Pharmacy medications:");
        pharmacy.printAllMedications();
        System.out.println("Number of medications: " + pharmacy.getCount());
    }
}
