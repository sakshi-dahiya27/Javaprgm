class Person {
    String name = "Unknown";

    void displayPerson() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String studentId = "S1001";

    void displayStudent() {
        System.out.println("Student ID: " + studentId);
    }
}

class GraduateStudent extends Student {
    String degree = "B.Tech";

    void displayGraduateStudent() {
        System.out.println("Degree: " + degree);
    }
}

class PostGraduateStudent extends GraduateStudent {
    String specialization = "Computer Science";

    void displayPostGraduateStudent() {
        System.out.println("Specialization: " + specialization);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        PostGraduateStudent pgStudent = new PostGraduateStudent();

        pgStudent.name = "Alice";
        pgStudent.studentId = "PG123";
        pgStudent.degree = "MCA";
        pgStudent.specialization = "AI & ML";

        System.out.println("----- Student Details -----");
        pgStudent.displayPerson();
        pgStudent.displayStudent();
        pgStudent.displayGraduateStudent();
        pgStudent.displayPostGraduateStudent();
    }
}