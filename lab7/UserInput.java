import java.util.*;
class UserInput{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=s.next();
        System.out.println("Enter age: ");
        int age=s.nextInt();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

    }
}