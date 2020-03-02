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
public class InterfaceMainApplication {
    public static void main(String[] args) {
        PersonImplementor person = new PersonImplementor();
        
        person.fullName = "Aakash Raj Shakya";
        person.address = "Lagan Tole, Kathmandu";
        
        System.out.println(person.getPersonalInfo());
        
        
        EmployeeImplementor employee = 
                new EmployeeImplementor();
        
        employee.fullName = "Prarup Gurung";
        employee.address = "Jomsom, Mustang";
        employee.salary = 100000.0;
        
        
        System.out.println(PersonImplementor.PI);
        
        System.out.println(employee.getPersonalInfo());
        
        PersonInterface secondPerson = new PersonImplementor();
        
        PersonInterface secondEmployee = new EmployeeImplementor();
    }
}
