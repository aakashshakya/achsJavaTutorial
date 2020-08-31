/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.basics;

import javatutorial.basics.javainterface.EmployeeImplementor;
import javatutorial.basics.javainterface.PersonImplementor;

/**
 *
 * @author aakash
 */
public class JavaTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Hello world.");
//        
//        Person person = new Person("Aakash Raj Shakya", 
//                "Lagan Tole",
//                "9860706065");
//        person.fullName = "Aakash Raj Shakya";
//        person.address = "Lagan Tole";
//        person.contactNumber = "9860706065";
        
//        System.out.println(person.fullName);
        
/*person.getInformation(); 
        
        Student student = new Student("Akash Rana",
        "Kapoor Dhara", "9843552211");
//        student.fullName = "Akash Rana";
//        student.address = "Kapoor Dhara";
//        student.contactNumber = "9843552211";
        student.faculty = "CSIT";
        
        student.getInformation();
        student.getFacultyInformation();
        
        /*Person secondPerson = new Student();
        secondPerson.faculty = "";*/
        
        /*AchsStudent achsStudent =
                new AchsStudent("Surakhsya Banjade",
        "Kamal Pokhari", "9847552232", 41);
//        achsStudent.fullName = "Surakhsya Banjade";
//        achsStudent.address = "Kamal Pokhari";
//        achsStudent.contactNumber = "9847552232";
        achsStudent.faculty = "B.Sc CSIT";
//        achsStudent.numberOfStudents = 41;
        
        achsStudent.getInformation();
        achsStudent.getFacultyInformation();*/
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
       //Abstract example
        /*System.out.println("============Abstract example starts from here=============");
        Lion lion = new Lion();
        lion.eats();
        lion.sound();
        
        Dog dog = new Dog();
        dog.eats();
        dog.sound();
        
        AbstractAnimal dogAbstractAnimal = new Dog();
        dogAbstractAnimal.eats();
        dogAbstractAnimal.sound();*/

        PersonImplementor person = new PersonImplementor();
        person.fullName = "Aakash Raj Shakya";
        person.address = "Lagan Tole, Kathmandu";
        System.out.println(person.getPersonalInfo());

        EmployeeImplementor employee = new EmployeeImplementor();
        employee.fullName = "Prarup Gurung";
        employee.address = "Jomsom, Mustang";
        employee.salary = 100000.0;
        System.out.println(employee.getPersonalInfo());
        System.out.println(employee.getSalary());


//        secondEmployee.get    }


    }
    
}
