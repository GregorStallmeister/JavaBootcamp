package list;

import java.util.ArrayList;
import java.util.List;

public class School {
    protected List<Student> students;

    public School() {
        students = new ArrayList<Student>();
    }

    public void addStudent(Student pStudent) {
        students.add(pStudent);
    }

    public Student findStudent(int id) {
        return students.get(id);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public String toString() {
        StringBuilder returnStringBuilder = new StringBuilder();

        returnStringBuilder.append("School{students=\n");

        for (Student currentStudent : students) {
            returnStringBuilder.append(currentStudent.toString());
            returnStringBuilder.append("\n");
        }

        returnStringBuilder.append("}");

        return returnStringBuilder.toString();
    }
}
