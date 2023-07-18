package Inheritance;

import java.util.*;

abstract class shape {
    float area;

    abstract public void input();

    abstract public void compute();

    public void disp() {
        System.out.println("The area is : " + area);
    }
}

class Rectangle1 extends shape {
    float lenght;
    float breadth;

    public void input() {
        System.out.println("Calculation of rectangle app");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of rectangle");
        lenght = sc.nextFloat();
        System.out.println("Please enter the breadth of rectangle");
        breadth = sc.nextFloat();
    }

    public void compute() {
        area = lenght * breadth;
    }

}

class Square1 extends shape {
    float lenght;

    public void input() {
        System.out.println("Calculation of square app");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of rectangle");
        lenght = sc.nextFloat();
    }

    public void compute() {
        area = lenght * lenght;
    }

}

class Circle1 extends shape {
    float radius;

    public void input() {
        System.out.println("Calculation of circle app");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius of circle");
        radius = sc.nextFloat();
    }

    public void compute() {
        area = 3.14f * radius * radius;
    }
}

class Geometry {
    public void poly(shape ref) {
        ref.input();
        ref.compute();
        ref.disp();

    }
}

public class LaunchEffApp {
    public static void main(String[] args) {

        Rectangle1 rec = new Rectangle1();
        Square1 sq = new Square1();
        Circle1 cir = new Circle1();

        Geometry g = new Geometry();
        g.poly(rec);
        g.poly(sq);
        g.poly(cir);

    }

}
