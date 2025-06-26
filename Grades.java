//To find grades
/*class Grades
{
 public static void main(String[] args)
  {
   int mark=100;
   if(mark>=90 && mark<=100) // and operator has to be used instead of (90 <= mark >= 100)- unlike math operator
    {
     System.out.println("The Grade of the student is S");
    }
    
   else if(mark>=80 && mark<=89)
    {
     System.out.println("The Grade of the student is A");
    }
   else if(mark>=70 && mark<=79)
    {
     System.out.println("The Grade of the student is B");
    }

   else if(mark>=60 && mark<=69)
    {
     System.out.println("The Grade of the student is C");
    }
 }
}*/

import java.util.Scanner;

class Grades
{
  public static void main(String[] args)
 {

  Scanner myobj = new Scanner(System.in);//get the mark from the user

  System.out.println("Enter the mark of the student");

  int mark = myobj.nextInt(); //wait for the user to enter to enter marks

  if(mark>=90 && mark<=100)
   {
    System.out.println("The Grade of the student is S");
   }
  
  else if(mark>=80 && mark<=89)
   {
    System.out.println("The Grade of the student is A");
   }

  else if(mark>=70 && mark<=79)
   {
    System.out.println("The Grade of the student is B");
   }
 
  else if(mark>=70 && mark<=79)
   {
    System.out.println("The Grade of the student is C");
   }

  }
}  

