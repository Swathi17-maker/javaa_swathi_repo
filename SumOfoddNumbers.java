/*class SumOfOddNumbers //Find the sum of odd numbers between 1 to 100 using while
{
 public static void main(String[] args)
  {
   int a=1;
   int sum=0;
   while(a<=100)
    {
     if(a%2==1)
     sum=sum+a;
     a++;
    }
   System.out.println(sum);
 }
}*/

/*class SumOfOddNumbers //Find the sum of odd numbers between 1 to 100 using do/while
{
  public static void main(String[] args)
  {
   int a=1;
   int sum=0;
   do
     {
      if(a%2==1)
      sum=sum+a;
      a++;
     }
   while(a<=100);
   System.out.println(sum);
  }
}*/

class SumOfOddNumbers //Find the sum of odd numbers between 1 to 100 using for loop
{
  public static void main(String[] args)
  {
   int sum=0;
   for(int a=1;a<=100;a++)
   {
    if(a%2==1)
    sum=sum+a;
   }
   System.out.println(sum);
  }
}
    

     
     
   