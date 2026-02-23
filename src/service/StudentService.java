package service;

import model.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        students.add(new Student(1, "Anna", 3.8));
        students.add(new Student(2, "Boris", 1.9));
        students.add(new Student(3, "Victor", 4.0));
        students.add(new Student(4, "Galina", 2.5));
        students.add(new Student(5, "Dmitry", 1.5));
    }

    public void removeLowGPA() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getGpa() < 2.0) {
                iterator.remove();
            }
        }
    }

    public void findHighestGPA() {
        if (!students.isEmpty()) {
            Student top = Collections.max(students, Comparator.comparingDouble(Student::getGpa));
            System.out.println("Highest GPA: " + top);
        }
    }

    public void insertAtIndex() {
        students.add(2, new Student(6, "Elena", 3.5));
    }

    public void printStudents() {
        for (Iterator<Student> it = students.iterator(); it.hasNext(); ) {
            System.out.println("  • " + it.next());
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
