package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    protected Map<Integer, Student> students;
    protected List<Course> courses;

    public School() {
        students = new HashMap <Integer, Student>();
        courses = new ArrayList<Course>();
    }

    public void addStudent(Student student) {
        students.put(student.getStudentID(), student);
    }

    public Student findStudent(int id) {
        return students.get(id);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course findCourse(int id) {
        return courses.get(id);
    }

    public List<Course> findCoursesOfStudent(int id) {
        return students.get(id).getCourses();
    }

    @Override
    public String toString() {
        StringBuilder returnStringBuilder = new StringBuilder();

        returnStringBuilder.append("School{students=\n");

        for (Student currentStudent : students.values()) {
            returnStringBuilder.append(currentStudent.toString());
            returnStringBuilder.append("\n");
        }

        returnStringBuilder.append("}");

        returnStringBuilder.append("{courses=\n");

        for (Course currentCourse : courses) {
            returnStringBuilder.append(currentCourse.toString());
            returnStringBuilder.append("\n");
        }

        returnStringBuilder.append("}");

        return returnStringBuilder.toString();
    }
}
