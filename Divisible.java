/*class Divisible //Find the number between 100 to 1000 which is divisible by 8 using while loop
{
 public static void main(String[] args)
  {
    int a=100;
    while(a<=1000)
    {
      if(a%8==0) //divisible by 8 is the main condition so keep in if condition
      System.out.println(a);
      a++;
    }
  }
}*/



/*class Divisible  //Find the number between 100 to 1000 which is divisible by 8 using for loop
{
  public static void main(String[] args)
  {
   for(int a=100;a<=1000;)
    {
     if(a%8==0)
     System.out.println(a);
     a++;
    }
  }
}*/

class Divisible // Find the number between 100 to 1000 which is divisible by 8 using do while loop
{
 public static void main(String[] args)
  {
   int a=100;
   do
    {
      if(a%8==0)
      System.out.println(a);
      a++;
    }
   while(a<=1000);
  }
}



