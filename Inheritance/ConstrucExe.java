package Inheritance;

class Demo3 {
    int a, b;

    public Demo3() {
        System.out.println("parent class constructor");
    }

    public Demo3(int x, int y) {
        System.out.println("parameterized parent class constructor");
        a = x;
        b = y;
    }
}

class Demo4 extends Demo3 {
    int m, n;

    public Demo4() {
        super(10, 20);
        System.out.println("child class constructor");

    }

    public Demo4(int x, int y) {
        System.out.println("parameterized child class constructor");
        m = x;
        n = y;
    }
}

public class ConstrucExe {
    public static void main(String[] args) {
        Demo4 de = new Demo4();

        // Demo4 d2 = new Demo4(10, 20);

    }

}
