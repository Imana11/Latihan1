
package university;
import java.util.Scanner;
class Employee extends Person {
    double salary;
    String desg;
    String dept;
    
    public void getDetail(){
       super.getDetail();
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the Profesional Details");
       System.out.println("Enter the Department");
       dept = input.nextLine();
       System.out.println("Enter the Designation");
       dept = input.nextLine();
       System.out.println("Enter the Salary");
       salary = input.nextInt();
       showDetail();
    }
    public void showDetail(){
        System.out.println("The details entered are :   \n");
        System.out.println("First Name : " + super.firstName);
        System.out.println("Last Name : " + super.lastName);
        System.out.println("Age : " + super.age);
        System.out.println("Department : " + dept);
        System.out.println("Designation : " + desg);
        System.out.println("Salary : " + salary);
    }
}
