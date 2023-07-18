package Inheritance;

class Human {
    int age;

    void sleep() {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human {

}

public class Inheritance1 {
    public static void main(String[] args) {
        Student st = new Student();
        st.sleep();

    }

}
