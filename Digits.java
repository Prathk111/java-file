public class Digits
{
   public static void main(String args[])
   {
     int number = 495,sum=0,remainder;
     
     while(number > 0 )
     {
          remainder = number % 10;
          sum  = sum + remainder;
          number = number/10;
     }
     System.out.printf("sum of digits is %d",sum);
   }
}

/*

sum of digits is 18

*/