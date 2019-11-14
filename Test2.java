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
public class Test2 {
    public static void main(String[] args) {
        Line2 lt = new Line2(5,10,10,20);
        System.out.println(lt.getLength());
        System.out.println(lt.isGreater(lt,lt));
        System.out.println(lt.isLess(lt,lt));
        System.out.println(lt.isEqual(lt,lt));
    }
}
