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
public class TestShape4 {
    public static void main(String[] args){
        Shape4 s1 = new Rectangle4("red", 4, 5);
        System.out.println(s1);
        System.out.println("Area is "+ s1.getArea());
        
        Shape4 s2 = new Triangle4("blue",4 ,5);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());
       
    }
}
