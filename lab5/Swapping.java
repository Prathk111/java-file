class Swapping{
  public static void main (String[] args){
         Swapping s=new Swapping();
         s.forint(20);
         s.fordouble(50);
    }

    void forint(int a){
         System.out.println("integer: "+a);
         double b=a;
         System.out.println("Swapping with double :"+b+"\n");
    }
    void fordouble(double a){
       System.out.println("double: "+a);   
       int b=(int) a;
       System.out.println("Swapping with integer:"+b+"\n"); 
    }
}