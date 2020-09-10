package javatutorial.basics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aakash
 */
public class Person {
    private String fullName;
    private String address;
    private String contactNumber;
    
    //No argument constructor
    public Person() {
        
    }
    
    //Parameterized constructor
    public Person(String fullName, String address, String contactNumber){
        this.fullName = fullName;
        this.address = address;
        this.contactNumber = contactNumber;
    }
    
    //Const
    public Person(String fullName, String address){
        this.fullName = fullName;
        this.address = address;
    }
    
    public void getInformation(){
        System.out.println("The person name is " + fullName 
                + ", address is "+ address + " and contact number "
                        + "is " + contactNumber);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
