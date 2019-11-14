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
public class RectTest {
    public static void main(String[] args) {
        Rect test1 = new Rect(1, 1, 4, 4);
        Rect test2 = new Rect(2, 3, 5, 6);
        Rect punten = test1.union(test2);
        Rect yamanta = test1.intersection(test2);
        
        if (punten.isInside(test2.x1, test2.y1))
            System.out.println("(" + test2.x1 + "," + test2.y1 +") is Inside the union");
        
        System.out.println(test1 +" union " + test2 + " = " + punten);
        System.out.println(test1 +" intersect " + test2 + " = " + yamanta);
    }
}
