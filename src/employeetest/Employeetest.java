/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeetest;

/**
 *
 * @author SherdllStore
 */
public class Employeetest {

    public static void main(String[] args) {
      employee obj1=new employee("Sara","Barzan",1700.00);
         employee obj2=new employee("Mohammed","Barzan",3900.00);
        
        System.out.printf("NAME\t\t\tYEARLY SALARY\n");
        System.out.printf("------------------------------------------------\n");
        System.out.println(obj1.getfirstname()+" "+obj1.getlastname()+"\t\t$"+obj1.yearlysalary());
      System.out.println(obj2.getfirstname()+" "+obj2.getlastname()+"\t\t$"+obj2.yearlysalary());
        System.out.println("\n10 percent salary raised!! yoohoooooo!!\n");
        obj1.raise();
        obj2.raise();
        System.out.printf("NAME\t\t\tYEARLY SALARY\n");
        System.out.printf("------------------------------------------------\n");
     System.out.println(obj1.getfirstname()+" "+obj1.getlastname()+"\t\t$"+obj1.yearlysalary());
      System.out.println(obj2.getfirstname()+" "+obj2.getlastname()+"\t\t$"+obj2.yearlysalary());
     
    }
    
}
