import java.util.Comparator;
import java.util.TreeSet;

public class TreeStudents {
    TreeSet<Student> studentsN = new TreeSet<>(
            (Student student1,
             Student student2) -> student1.name.compareTo(student2.name));

    TreeSet<Student> studentsS = new TreeSet<>(
            (Student student1,
             Student student2) -> -(student1.surname).compareTo(student2.surname));

    TreeSet<Student> studentsA = new TreeSet<>(new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            if(student1.averageScore > student2.averageScore)
                return 1;
            else if(student1.averageScore < student2.averageScore)
                return -1;
            else
                return 0;
        }
    });
}
