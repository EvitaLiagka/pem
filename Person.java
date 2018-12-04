/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmain;

import java.util.Scanner;
import java.Time.Year;

/**
 *
 * @author Evita
 */
public abstract class Person {
    
    private String first_name;
    private String last_name;
    private int year_of_birth;

    public Person(String first_name, String last_name, int year_of_birth) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.year_of_birth = year_of_birth;
    }
   
    public int getAge(){
    return int age = (Year.now().getValue() - year_of_birth);}

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

   
}

   