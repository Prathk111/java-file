class Employee
{
   int id;
   String name;
   String salary;
   String area;
   
   Employee(int id)
   {
    this.id=id;
   }
  
   Employee(int id, String name)
   {
    this.id=id;
    this.name=name;
   }
 
   Employee(int id, String name, String salary)
   {
    this.id=id;
    this.name=name;
    this.salary=salary;
   }
   
   Employee(int id, String name, String salary, String area)
   {
    this.id=id;
    this.name=name;
    this.salary=salary;
    this.area=area;
   }
  
   void displayData()
   {
    System.out.println(id +" " + name + " " + "salary" + " " + "area");  
   }
   
   public static void main(String[] args)
   {
    Employee e1 = new Employee(1212,"Pratham","40000","kalyan");
    Employee e2 = new Employee(2231,"Soham", "40000", "dombivali");
    Employee e3 = new Employee(8363,"Avishkar","44000","virar");

    e1.displayData();e2.displayData();e3.displayData();
   }
}

/*

1212 Pratham salary area
2231 Soham salary area
8363 Avishkar salary area

*/