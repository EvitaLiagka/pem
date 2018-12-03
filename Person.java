/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmain;

import java.util.Scanner;

/**
 *
 * @author Evita
 */
public abstract class Person {
    
    String firstname;
    String lastname;
    int dateofbirth;

    public Person(String firstname, String lastname, int dateofbirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = dateofbirth;
    }
   
    private int age(){
    int currentage = 2018;
    return (currentage - dateofbirth);}

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getDateofbirth() {
        return dateofbirth;
    }

   
}

   