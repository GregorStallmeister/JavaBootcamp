package exceptions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

    public Student getStudentByID(String id) throws NoSuchElementException {
//        return repo.findStudentById(id).get(); // quite funny: It throws exactly that exception I thought of in case it does not find a student: NoSuchElementException

        Optional<Student> student = repo.findStudentById(id);

        if (student.isPresent())
            return student.get();

        throw new NoSuchElementException("No student with ID \"" + id + "\" found!");
    }
}