/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demotest;

/**
 *
 * @author paulooliveira
 */
public class UserData extends Users {
    
    private double tax_credits;
    private double tax_owned;

    public UserData(String first_name, String surname_name, String day_of_birthday, String address, double gross_income, String UserName, String Password) {
        super(first_name, surname_name, day_of_birthday, address, gross_income, UserName, Password);
    }
    
    

    public double getTax_credits() {
        return tax_credits;
    }

    public double getTax_owned() {
        return tax_owned;
    }

  
//    
//    public UserData(String first_name, String surname_name, String day_of_birthday, String address, double gross_income) {
//        super(first_name, surname_name, day_of_birthday, address, gross_income);
//        this.tax_credits = tax_credits;
//        this.tax_owned = tax_owned;
//    }
}
