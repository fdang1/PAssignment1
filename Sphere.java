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
public class Sphere <Base extends Shape2D> implements Shape3D {
    public Base radius;
   
    public double getSurfaceArea() {
        return radius.getArea() *4*Math.PI;
    }

    
    public double getVolume() {
      return ( 4/3*Math.PI*Math.pow(radius.getArea(), 3));
    }
    
}
