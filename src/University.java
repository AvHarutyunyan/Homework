public class University {
    private Professor professor;

    University() {
        this.professor = new Professor();
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    void inUniversity() {
        Course course = new Course();
        course.setCourseNumber(2);

        professor.professorIsTeaching(course);
    }

    public static void main(String[] args) {
        University university = new University();
        university.inUniversity();
    }
}


class Professor {
    public void professorIsTeaching(Course course) {
        System.out.println("Professor is teaching course number: " + course.getCourseNumber());
        course.getSyllabus().showTopics();
    }
}


class Course {
    private int courseNumber;
    private Syllabus syllabus;

    Course() {
        this.syllabus = new Syllabus();
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Syllabus getSyllabus() {
        return syllabus;
    }
}

class Syllabus {
    void showTopics() {
        System.out.println("Syllabus includes: Java, OOP, Data Structures.");
    }
}
