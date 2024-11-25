import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", "Ivt_1", 3, Map.of("Math", 4, "English", 5, "History", 3)));
        students.add(new Student("Denis", "Ivt_2", 2, Map.of("Math", 5, "English", 4, "History", 5)));
        students.add(new Student("Alice", "Ivt_3", 2, Map.of("Math", 4, "English", 4, "History", 3)));
        students.add(new Student("Pavel", "Ivt_spice", 2, Map.of("Math", 2, "English", 3, "History", 2)));

        students.removeIf(student -> {
            if (student.getAverageGrade() < 3) {
                return true;
            } else {
                student.setCourse(student.getCourse() + 1);
                return false;
            }
        });

        printStudents(students, 3);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты перешедшие на " + course + " курс:");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + ", группа: " + student.getGroup());
            }
        }
    }
}
