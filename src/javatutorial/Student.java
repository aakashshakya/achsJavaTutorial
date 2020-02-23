/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial;

/**
 *
 * @author aakash
 */
public class Student extends Person {
    
    public Student(String fullName, String address, String contactNumber){
        //This calls the parent constructor
        super(fullName, address, contactNumber);
    }
    
    public String faculty;
    
    public void getFacultyInformation(){
        System.out.println("The faculty of the student is " + faculty);
    }
}
