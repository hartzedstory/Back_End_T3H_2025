package buoi7.onClassEx;

import buoi7.onClassEx.model.*;
import buoi7.onClassEx.model.Shape;

import java.awt.*;

public class OnClassEx {
    public static void main(String[] args) {
        // Khoi tao array cha
        Shape[] shapeList = new Shape[6];

        // Khoi tao tung hinh mot va them vao mang
        Shape shape = new Shape(0, "Da giac");
        shapeList[0] = shape;

        Poygonal polygonal = new Poygonal(0, "Da giac", 2);
        shapeList[1] = polygonal;

        Circle circle = new Circle(0, "Hinh tron");
        shapeList[2] = circle;

        Retangle rectangle = new Retangle(4, "Hinh chu nhat", 4, "Do");
        shapeList[3] = rectangle;

        Triangle triangle = new Triangle(4, "Hinh tam giac", 3, "Xam");
        shapeList[4] = triangle;

        Square square = new Square(4,"Hinh vuong",4, "Xam", 4);
        shapeList[5] = square;


        for ( int i = 0; i < shapeList.length; i++ ) {
            System.out.println("---------------------------------------");
            shapeList[i].hienThiThongTin();
            System.out.println("---------------------------------------");
        }
    }
}
