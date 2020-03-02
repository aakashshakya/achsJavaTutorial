/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.javainterface;

/**
 *
 * @author aakash
 */
public class EmployeeImplementor implements PersonInterface {
    public String fullName;
    public String address;
    public double salary;
    
    @Override
    public String getPersonalInfo() {
        return "The name of student is " + fullName 
                + " and address is "+ address 
                + " and salary is " + salary;
    }

    @Override
    public String getFullName() {
        return this.fullName;
    }

    @Override
    public String getAddress() {
        return this.address;
    }
    
    public double getSalary(){
        return this.salary;
    }
    
}
