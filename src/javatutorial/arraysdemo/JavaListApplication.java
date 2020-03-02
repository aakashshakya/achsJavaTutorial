/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatutorial.arraysdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aakash
 */
public class JavaListApplication {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aakash");
        names.add("Kritam");
        names.add("Nischal");
        names.add("Maria");
        
        for(String name: names){
            System.out.println(name);
        }
        
        //Example of using lambda functioon
        names.forEach(name -> System.out.println(name));
    }
}
