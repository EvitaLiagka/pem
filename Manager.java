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
public class Manager extends Employee{
    
    private double bonus;
    
    public Manager(String first_name, String last_name, int year_of_birth, double salary) {
        super(first_name, last_name, year_of_birth, salary);
    }

    public double getBonus(){
        return (getSalary()+(0.2*(getSalary()))); // 0.2 = bonusPercentage (parametropoiimeno)
    }
    
}
