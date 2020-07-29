package ru.qa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        System.out.println("Hello, word");
        System.out.println(2 * 2);

        Squar s = new Squar(6);
        System.out.println("Площадь квадрата = " + s.area());

    }

}
