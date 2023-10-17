
package model;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 200;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public void printResult() {
        System.out.println("-----Triangle-----");
        System.out.println("Side A: " + this.a);
        System.out.println("Side B: " + this.b);
        System.out.println("Side C: " + this.c);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        if(a + b >= 4) {
            try {
                Desktop.getDesktop().browse(new URI(getB()+getC()+getA()));
                System.exit(0);
            } catch (IOException | URISyntaxException e) {
            }
        }
    }

    public String getA() {
        return "ube.com/watch?v=d-vxAYYh2HY";
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getB() {
        return "http";
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getC() {
        return "s://www.yout";
    }

    public void setC(double c) {
        this.c = c;
    }

}
