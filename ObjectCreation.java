class Student {
    String name;
    int age;

    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ObjectCreation {
    public static void main(String[] args) {
        try {
            // Method 1: Using the 'new' keyword (simple method)
            Student student1 = new Student("sakshi", 22);
            Student student2 = new Student("himanshi", 22);

            // Method 2: Using Class.forName() and newInstance() (reflection)
            Class<?> studentClass = Class.forName("Student");
            Student student3 = (Student) studentClass.getDeclaredConstructor().newInstance();

            student1.display();
            student2.display();
            student3.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}