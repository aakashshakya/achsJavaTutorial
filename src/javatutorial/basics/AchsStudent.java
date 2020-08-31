/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.basics;

/**
 *
 * @author aakash
 */
public class AchsStudent extends Student {
    private int numberOfStudents;
    
    public AchsStudent(String fullName, String address,
            String contactNumber, int numberOfStudents){
        super(fullName, address, contactNumber);
        this.numberOfStudents = numberOfStudents;
    }
}
