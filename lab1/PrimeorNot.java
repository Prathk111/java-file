import java.util.Scanner;
class PrimeorNot
{
       public static void main(String args[])
       {
           Scanner s=new Scanner(System.in);

           System.out.println("Enter the number: ");
           int no=s.nextInt();
           int var=0;
           for(int i=2;i<=no-1;i++)
           {
                 if(no%i==0)
                 {
                        var=var+1;                
                 }
           }
           if(var==0)
           {
                System.out.println(no+"is prime no");
           }
           else
           {
                System.out.println(no+"is no a prime no");
           }
       } 
}

/*
Enter the number:
7
7is prime no
/*