package exceptions;

import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);

        String id = "no_such_student";
        try {
            Student student = studentService.getStudentByID(id);
            System.out.println(student);
        } catch (NoSuchElementException e) {
            System.out.println("Error: " + e.toString());
        }
    }
}