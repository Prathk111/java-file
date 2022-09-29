class AndroidPhone{
    String name;
    int ram;
    String color;
    
    AndroidPhone(String name,int ram,String color){
       
       
       this.name=name;
       this.ram=ram;
       this.color=color;
       Ram();Color();
   }
 
    void Ram(){
         System.out.println(name+","+ram+"Specification");
   }

    void Color(){
         System.out.println(name+","+color+"Specification\n");
   }
}
class AndroidPhone_main{
     public static void main(String[] args){
          AndroidPhone[] arr=new AndroidPhone[3];
          arr[0]=new AndroidPhone("Samsung",6,"Black");
          arr[1]=new AndroidPhone("Redmi",8,"Grey");
          arr[2]=new AndroidPhone("OnePlus",8,"White");
   }
}