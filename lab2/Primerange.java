import java.util.Scanner;
class Primerange
{
   public static void main(String[] args)
   {
    int x,y,i,j;
    System.out.print("Enter two numbers ");
    Scanner s = new Scanner(System.in);
    x=s.nextInt();
    y=s.nextInt();
   
    {
     for(i=x;i<=y;i++)
       {
         for(j=2;j<=i;j++)
         {
          if(i%j==0)
              break;
         }
         if(i==j)
          System.out.println(j);
       }
    }
   }
}

/*
 
Enter two numbers 40 80
41
43
47
53
59
61
67
71
73
79

*/