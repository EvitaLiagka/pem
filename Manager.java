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
public abstract class Manager extends Employee{
    
    double bonus;
    
    public Manager(String firstname, String lastname, int dateofbirth, double salary) {
        super(firstname, lastname, dateofbirth, salary);
    }

    public double getBonus() {
        return bonus;
    }
    
}
