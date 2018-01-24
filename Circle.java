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
public class Circle implements Shape2D{
   public double radius;
    
    public double getArea()
    {
        return radius * radius * Math.PI;
    }

    
    public double getPerimeter() 
    {
        return radius * Math.PI * 2;
    }
    
}
