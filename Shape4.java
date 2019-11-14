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
public class Shape4 {
    private String color;
    public Shape4 (String color){
        this.color = color;
    }
    public String toString(){
        return "Shape[color=" + color + "]";
    }
    public double getArea() {
        //We need to return some value to compile the progam.
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}
