/*// To find odd or even

class OddOrEven
{
  public static void main(String[] args)
   {
    short a=10;
    int b=a%2;
    if(b==1)
     { 
      System.out.println("The number is Odd");
     }
    else
     {
      System.out.println("The number is Even");
     }
   }
}*/


//using input statement

import java.util.Scanner;

class OddOrEven
 {
  public static void main(String[] args)
   {
     Scanner myobj = new Scanner(System.in); //get the number from the user

     System.out.println("Enter the number: ");

     long num = myobj.nextLong(); //wait for the user to enter numbers
     
     long n=num%2;
     
     if(n==0)
       {
         System.out.println("The number is Even");
       }
      
     else
       {
         System.out.println("The number is Odd");
       }
  }

 }
