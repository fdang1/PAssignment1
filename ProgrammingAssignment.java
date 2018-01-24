/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgrammingAssignment {


static void getShape(){                 //This is the function where everything happens (:
    boolean isAcceptable = false;
    Scanner sc = new Scanner (System.in);
    String shape;
        
    System.out.print("What is the Shape you want? Prism, Cube, or Sphere : "); //Ask for what kind of 3D shape
    try 
    {
        shape = sc.next();
    }
    catch(InputMismatchException coop)
    {
          System.err.println("That is not a valid Shape");
                getShape();
                return;
    } 
do{
    if (shape.equalsIgnoreCase("Prism"))
       {
           Scanner pm = new Scanner (System.in);
           String npm;
           System.out.print("What kind of base prism do you want to calculate? Square, Circle, or E.Triangle?"); //asks for what kind of Prism
          
               npm = pm.next();
          
           
           if (npm.equalsIgnoreCase("square")) //solves square b prisms
           {
             Scanner sq = new Scanner (System.in); 
             Double len;
             Double hs;
             System.out.print("What is the length of your square base? :");
             len = sq.nextDouble();
             System.out.print("What is the height of your prism? :");
             hs = sq.nextDouble();
             
            Square mySquare = new Square();
            mySquare.base = len;
            Prism <Square> myPrism = new Prism();
            myPrism.base = mySquare;
            myPrism.height = hs;
            System.out.println("The volume of the Prism is : " + myPrism.getVolume() + " and the surface area is :" + myPrism.getSurfaceArea());
            return;
           }
           
           else if (npm.equalsIgnoreCase("Circle")) //solves cylinders
           {
             Scanner sq = new Scanner (System.in); 
             Double rad;
             Double hs;
             System.out.print("What is the radius of your circular base? :");
             rad = sq.nextDouble();
             System.out.print("What is the height of your prism? :");
             hs = sq.nextDouble();
             
            Circle myCircle = new Circle();
            myCircle.radius = rad;
            Prism <Circle> myPrism = new Prism();
            myPrism.base = myCircle;
            myPrism.height = hs;
            System.out.println("The volume of the Prism is : " + myPrism.getVolume() + " and the surface area is :" + myPrism.getSurfaceArea());
            return;   
           }
           //The calculations below didn't seem to work properly so I commented~
           
          /* else if (npm.equalsIgnoreCase("E.Triangle"))
           {
            Scanner sq = new Scanner (System.in); 
             Double len;
             Double hs;
             System.out.print("What is the length of your E.Triangle? :");
             len = sq.nextDouble();
             System.out.print("What is the height of your prism? :");
             hs = sq.nextDouble();
             
            Triangle myTriangle = new Triangle();
            myTriangle.base = len;
            Prism <Triangle> myPrism = new Prism();
            myPrism.base = myTriangle;
            myPrism.height = hs;
            System.out.println("The volume of the Prism is : " + myPrism.getVolume() + " and the surface area is :" + myPrism.getSurfaceArea());
            return;      
           }*/
       }  

  
    else if(shape.equalsIgnoreCase("Cube")) //Solves cubes
   { 
       Scanner lng = new Scanner (System.in);
       Double lg;
       System.out.print("What is the length of your Cube? : ");
       
       lg = lng.nextDouble();
       
       Square mySquare = new Square();
       mySquare.base = lg;
       Cube<Square> myCube = new Cube();
       myCube.base = mySquare;
       System.out.println("The volume of the Cube is : " + myCube.getVolume() + " and the surface area is :" + myCube.getSurfaceArea());
       return;
   }     
   
    else if (shape.equalsIgnoreCase("Sphere"))  //solves spheres
   {
       Scanner rad = new Scanner (System.in);
       Double rds;

       System.out.print("What is the radius of your circle?");
       rds = rad.nextDouble();
       Circle myCircle = new Circle();
        myCircle.radius = rds ;
        Sphere<Circle> mySphere = new Sphere();
        mySphere.radius = myCircle;
        System.out.println("The volume of the sphere is : " + mySphere.getVolume() + " and the surface area is :" + mySphere.getSurfaceArea());
        return;
   }
            
   else
   {
       System.err.println("Try again and give a 3D shape this time");
       getShape();
   }
   } while(!isAcceptable);
}

   
public static void main(String[] args) 
{
   getShape(); //runs the function
}     

   
   
   
   
       
      
        
        
       
    
        
        
}
