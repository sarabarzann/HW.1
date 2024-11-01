/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeetest;

/**
 *
 * @author SherdllStore
 */
public class employee {
    private String firstname;
    private String lastname;
    private double monthlysalary;
    
    employee (String firstname,String lastname,double monthlysalary){
        this.firstname=firstname;
        this.lastname=lastname;
        if(monthlysalary>0){
        this.monthlysalary=monthlysalary;
        }
    }
    public void setfirstname(String firstname){
        this.firstname=firstname;
    }
  public String getfirstname(){
      return firstname;
  }
      public void setlastname(String lastname){
        this.lastname=lastname;
    }
  public String getlastname(){
      return lastname;
  }
      public void setmonthlysalary(double monthlysalary){
               
        this.monthlysalary=monthlysalary;  
    }
  public double getmonthlysalary(){
      return monthlysalary;
  }
  public double yearlysalary(){
      return monthlysalary*12.0;
  }
    public void raise(){
        monthlysalary+=monthlysalary*(0.1);
    }
   
}
