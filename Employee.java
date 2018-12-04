/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personmain;

/**
 *
 * @author Evita
 */
public class Employee extends Person {
    
    private double salary;
    
    public Employee (String first_name, String last_name, int year_of_birth, double salary){
    super(first_name, last_name, year_of_birth);}

    public double getSalary() {
        return salary;
    }
}
