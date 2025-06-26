// Area of traingle

/*class AreaOfTriangle
{
  public static void main(String[] args)
   {
    short b=10;
    short h=20;

    System.out.println("Area of Triangle is " + 1/2.0*b*h);
   }

}*/

//using input statement

import java.util.Scanner;

class AreaOfTriangle
{
  public static void main(String[] args)
   {
     Scanner myobj = new Scanner(System.in); //get the breadth from the user

     System.out.println("Enter the breadth of the triangle: ");

     int breadth = myobj.nextInt(); //wait for the user to enter numbers
     
     System.out.println("Enter the height of the triangle: ");

     int height = myobj.nextInt(); //wait for the user to enter numbers

     System.out.println("Area of triangle is "  +  1.0/2*breadth*height);
    
    }

}
