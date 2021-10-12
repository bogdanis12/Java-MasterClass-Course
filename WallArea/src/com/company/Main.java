package com.company;

public class Main {

    public static void main(String[] args) {
        Wall area = new Wall(5,4);
        System.out.println("The width is: " + area.getWidth());
        System.out.println("The height is: " + area.getHeight());
        System.out.println("The area of the wall is: " + area.getArea());
        System.out.println("************");

        area.setHeight(-1.5);

        System.out.println("The width is: " + area.getWidth());
        System.out.println("The height is: " + area.getHeight());
        System.out.println("The area of the wall is: " + area.getArea());
        System.out.println("************");
        area.setWidth(-1.2);
        area.setHeight(-1.5);
        System.out.println("The width is: " + area.getWidth());
        System.out.println("The height is: " + area.getHeight());
        System.out.println("The area of the wall is: " + area.getArea());

    }
}
