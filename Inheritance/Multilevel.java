package Inheritance;

class Demo1 {
    void disp() {
        System.out.println("disp in demo class");
    }
}

class Demo2 extends Demo1 {

}

class Demo3 extends Demo2 {

}

public class Multilevel {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.disp();

    }

}
