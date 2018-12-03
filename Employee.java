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
    
    double salary;
    
    public Employee (String firstname, String lastname, int dateofbirth, double salary){
    super(firstname, lastname, dateofbirth);}

    public double getSalary() {
        return salary;
    }
}
