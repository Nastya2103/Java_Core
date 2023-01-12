import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Course course1 = new CourseNew("Тестирование");
        Course course2 = new CourseNew("Программирование");
        Course course3 = new CourseNew("Аналитика");
        Course course4 = new CourseNew("Веб-дизайн");
        Course course5 = new CourseNew("Компьютерные сети");

        List<Student> students = Arrays.asList(
                new StudentNew("Иванова Мария", Arrays.asList(course1, course2, course4)),
                new StudentNew("Петров Иван", Arrays.asList(course1, course4)),
                new StudentNew("Федоров Дмитрий", Arrays.asList(course3)),
                new StudentNew("Сидорова Елена", Arrays.asList(course1, course2, course3, course4, course5)),
                new StudentNew("Кукушкин Роман", Arrays.asList(course2))

        );

        System.out.println(getUniqueCourses(students));
        System.out.println(getCuriosityStudents(students));
        System.out.println(getStudentsAndCourses(students, course4));

    }

    public static List<Course> getUniqueCourses(List<Student> students) {
        students = students == null ? new ArrayList<>() : students;

        return students.stream()
                .filter(Objects:: nonNull)
                .map(Student::getAllCourses)
                .filter(Objects::nonNull)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Student> getCuriosityStudents(List<Student>students){
        students = students == null ? new ArrayList<>() : students;

        return students.stream()
                .filter(Objects::nonNull)
                .sorted((student1,student2) -> student1.getAllCourses().size() - student2.getAllCourses().size()).limit(3).collect(Collectors.toList());

    }

    public static List<Student> getStudentsAndCourses(List<Student> students, Course course){
        if (course == null) {
            return new ArrayList<>();
        }
        students = students == null ? new ArrayList<>() : students;

        return students.stream()
                .filter(Objects::nonNull)
                .filter(student -> {
                    List<Course> courses = student.getAllCourses();
                    courses = courses == null ? Collections.emptyList() : courses;
                    return courses.contains(course);
                })
                .collect(Collectors.toList());
    }
}

