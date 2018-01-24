/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.assignment;

/**
 *
 * @author Franklin
 */
public class Square implements Shape2D {
    public double base;
   
    public double getArea() {
        return base * base;
    }
    public double getPerimeter() {
        return base + base;
    }
    
}
