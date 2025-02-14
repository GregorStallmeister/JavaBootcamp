package exceptions;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceTest {

    @Test
    public void getStudentByIDExpectReturnOfStudentWhenOneWasAdded() {
        // given
        Student student = new Student("only_placeholder", "Felix", "Ev. Theologie");
        StudentService studentService = new StudentService();
        studentService.addNewStudent(student);
        String id = studentService.getAllStudents().getFirst().id();

        // when
        Student actual = studentService.getStudentByID(id);

        // then
        assertNotNull(actual);
    }

    @Test
    public void  getStudentByIDExpectedNoSuchElementExceptionWhenNotFound() {
        // given
        String id = "no_such_student";
        StudentService studentService = new StudentService();

        // then
        assertThrows(NoSuchElementException.class, () -> {studentService.getStudentByID(id);});
    }
}
