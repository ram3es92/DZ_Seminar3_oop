// Создать класс Студент
// � Создать класс УчебнаяГруппа
// � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// � Реализовать его контракты (включая удаление)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Примеры использования Student и StudentGroup
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Алексей", 1));
        students.add(new Student("Борис", 2));
        students.add(new Student("Виктория", 3));
        students.add(new Student("Галина", 4));
        students.add(new Student("Дмитрий", 5));

        Collections.sort(students);

        System.out.println("Студенты, отсортированные по длине имени:");
        for (Student s : students) {
            System.out.println(s);
        }

        StudentGroup group1 = new StudentGroup();
        group1.addStudent(new Student("Елена", 6));
        group1.addStudent(new Student("Зоя", 7));
        group1.addStudent(new Student("Иван", 8));

        StudentGroup group2 = new StudentGroup();
        group2.addStudent(new Student("Кирилл", 9));
        group2.addStudent(new Student("Людмила", 10));

        StudentGroup group3 = new StudentGroup();
        group3.addStudent(new Student("Мария", 11));
        group3.addStudent(new Student("Николай", 12));
        group3.addStudent(new Student("Ольга", 13));
        group3.addStudent(new Student("Петр", 14));

        StreamGroup stream1 = new StreamGroup();
        stream1.addGroup(group1);

        StreamGroup stream2 = new StreamGroup();
        stream2.addGroup(group1);
        stream2.addGroup(group2);

        StreamGroup stream3 = new StreamGroup();
        stream3.addGroup(group1);
        stream3.addGroup(group2);
        stream3.addGroup(group3);

        List<StreamGroup> streams = new ArrayList<>();
        streams.add(stream3);
        streams.add(stream1);
        streams.add(stream2);

        StreamService streamService = new StreamService();
        streamService.sortStreams(streams);

        System.out.println("Потоки, отсортированные по количеству групп:");
        for (StreamGroup sg : streams) {
            System.out.println("Поток с " + sg.getGroups().size() + " группами");
        }
    }
}