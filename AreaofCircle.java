// Area of circle

/*class AreaOfCircle
{
  public static void main(String[] args)
   {
    int r=10;
    System.out.println("Area of Circle is "  +  Math.PI*r*r);
   }

}*/

//using input statement

import java.util.Scanner;

class AreaOfCircle
{
  public static void main(String[] args)
   {
     Scanner myobj = new Scanner(System.in); //get the radius from the user

     System.out.println("Enter the radius of the circle: ");


     float radius = myobj.nextFloat	(); //wait for the user to enter numbers

     System.out.println("Area of Circle is "  +  Math.PI*radius*radius);
    
    }

}

