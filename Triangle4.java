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
public class Triangle4 extends Shape4{
    private int base;
    private int height;
    
    public Triangle4(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    public String toString(){
        return "Triangle[base=" + base + ",height=" + height + ","
                +super.toString() + "]";
    }
    public double getArea(){
        return 0.5*base*height;
    }
}
