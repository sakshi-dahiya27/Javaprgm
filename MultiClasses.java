public class MultiClasses {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="sakshi";
        s1.age=22;
        s1.display();

        Subject s2=new Subject();
        s2.sub1="Java";
        s2.sub2="C++";
        s2.srm();


        
    }
    static class Student {
        String name;
        int age;
        void display()
        {
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
        }
    
        
    }
    static class Subject {
        String sub1,sub2;
        void srm()
        {
            System.out.println("Subject 1: "+sub1);
            System.out.println("Subject 2: "+sub2);
        }
    
        
    }
}