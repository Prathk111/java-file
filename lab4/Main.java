class A
{
  void display()
  {
   System.out.println("class A : display method");

  }
}

class B extends A
{
  void show()
     {
       System.out.println("class B : show method");
     }
}

class Main
  {
   public static void main(String[] args)
      {
         A ref;
   
         ref=new B();

        ref.display();
      }
  }