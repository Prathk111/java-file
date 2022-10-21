class Labq1 extends Thread{
   public void run(){
     System.out.println("Thread started");
  }
   public static void main(String[] args){
    Labq1 obj=new Labql();
    Labq1 obj1=new Labq1();

    System.out.println("name of first thread:"+obj.getName());
    System.out.println("name of second thread:"+obj1.getName());

    obj.start();
     obj1.start();

    obj.setNmae("pratham");
    System.out.println("name of first thread:"+obj.getName());
  }
}