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
public class Cube <Base extends Shape2D> implements Shape3D
{
    public Base base;
    
    
    
    public double getSurfaceArea() 
    {
      return 6* Math.pow(base.getArea(), 2);
    }

    
    public double getVolume()
    {
        return Math.pow(base.getArea(), 3);
    }
    
}
