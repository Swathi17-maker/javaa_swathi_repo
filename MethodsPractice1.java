import java.util.Scanner;

class MethodsPractice                       //Write a java program that should have 3 methods To find average of 3 numbers
{


 public void average(int a,int b,int c)
 {
  float d=(a+b+c)/3f;
  System.out.println("The average is " + d);
 }


 public void oddoreven(int a,int b,int c)
 {
  if(a%2==1)
  System.out.println(a + " is odd");
  else
  System.out.println(a + " is even");

  if(b%2==1)
  System.out.println(b + " is odd");
  else
  System.out.println(b + " is even");

  if(c%2==1)
  System.out.println(c + " is odd");
  else
  System.out.println(c + " is even");
  
 }




 public void range(int a,int b,int c)
 {
  int start=a;
  int end =b;
  int d = 2;
  System.out.println("The range between:" + a + "-" + b);
  for(int i = start;i<=end;i=i+d)
  {
    System.out.println(i);                    // the range between 10-20 is 
  }
 }


  
public static void main(String[] args)
 {
  Scanner myobj = new Scanner(System.in);       //to get input from the user
  System.out.println("Enter 3 numbers");
  int a = myobj.nextInt();
  int b = myobj.nextInt();
  int c = myobj.nextInt();
  
  MethodsPractice demo = new MethodsPractice();     // classname methodsname = new classname
  demo.average(a,b,c);                               // methodname.method
  demo.oddoreven(a,b,c);                             // to call oddorevenmethod
  demo.range(a,b,c); 
 }
}

