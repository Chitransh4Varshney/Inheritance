package Inheritance;

import java.util.*;

class Rectangle {
    float lenght;
    float breadth;
    float area;

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

    public void disp() {
        System.out.println("The area of rectangle is : " + area);
    }

}

class Square {
    float lenght;
    float area;

    public void input() {
        System.out.println("Calculation of square app");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the length of rectangle");
        lenght = sc.nextFloat();
    }

    public void compute() {
        area = lenght * lenght;
    }

    public void disp() {
        System.out.println("The area of square is : " + area);
    }

}

class Circle {
    float radius;
    float area;

    public void input() {
        System.out.println("Calculation of circle app");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the radius of circle");
        radius = sc.nextFloat();
    }

    public void compute() {
        area = 3.14f * radius *
                radius;
    }

    public void disp() {
        System.out.println("The area of circle is : " + area);
    }

}

public class LaunchApp {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.input();
        rec.compute();
        rec.disp();

        Square sq = new Square();
        sq.input();
        sq.compute();
        sq.disp();

        Circle cir = new Circle();
        cir.input();
        cir.compute();
        cir.disp();

    }

}
