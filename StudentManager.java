package StudentRecordManager;

import java.util.ArrayList;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    public void add(Student s) {
        students.add(s);
        System.out.println("Succefully added");
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println(" No students to display.");
        }
        System.out.println(" All Students:");
        for (Student s : students) {
            s.display();
        }
    }

    public Student findById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

}
