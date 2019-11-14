/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author grand
 */
public class Rectangle4 extends Shape4{
    private int length;
    private int width;

    public Rectangle4(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    
    }
    public String toString(){
        return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
    }
    public double getArea(){
        return length*width;
    }
}
