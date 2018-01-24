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
public class Prism <Base extends Shape2D> implements Shape3D
{
    public Base base;
    
    public double height;
    
    public double getSurfaceArea() 
    {
        return 2*base.getArea()+base.getPerimeter()*height;
    }

    
    public double getVolume()
    {
        return base.getArea()*height;
    }
    
}
