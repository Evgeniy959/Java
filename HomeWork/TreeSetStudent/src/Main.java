public class Main {
    public static void main(String[] args) {
        System.out.println("Сортировка имен по возрастанию");
        TreeStudents treeStudentsN = new TreeStudents();
        treeStudentsN.studentsN.add(new Student("Evgeniy", "Pilipenko", 4.8));
        treeStudentsN.studentsN.add(new Student("Alex", "Colens", 4.6));
        treeStudentsN.studentsN.add(new Student("Jon", "Travolta", 4.4));
        treeStudentsN.studentsN.add(new Student("Elena", "Heniken", 4.9));
        for (Student student: treeStudentsN.studentsN) {
            System.out.println(student.name);
        }

        System.out.println("Сортировка фамилий по убыванию");
        TreeStudents treeStudentsS = new TreeStudents();
        treeStudentsS.studentsS.add(new Student("Evgeniy", "Pilipenko", 4.8));
        treeStudentsS.studentsS.add(new Student("Alex", "Colens", 4.6));
        treeStudentsS.studentsS.add(new Student("Jon", "Travolta", 4.4));
        treeStudentsS.studentsS.add(new Student("Elena", "Heniken", 4.9));
        for (Student student: treeStudentsS.studentsS) {
            System.out.println(student.surname);
        }

        System.out.println("Сортировка среднего балла по возрастанию");
        TreeStudents treeStudentsA = new TreeStudents();
        treeStudentsS.studentsA.add(new Student("Evgeniy", "Pilipenko", 4.8));
        treeStudentsS.studentsA.add(new Student("Alex", "Colens", 4.6));
        treeStudentsS.studentsA.add(new Student("Jon", "Travolta", 4.4));
        treeStudentsS.studentsA.add(new Student("Elena", "Heniken", 4.9));
        for (Student student: treeStudentsS.studentsA) {
            System.out.println(student.averageScore);
        }
    }
}