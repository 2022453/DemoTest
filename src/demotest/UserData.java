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
    
    private double tax_credits = 3550.00;
    private double tax_owned;

        public UserData(String first_name, String surname_name, String day_of_birthday, String address, double gross_income, String UserName, String Password, double tax_credits, double tax_owned) {
        super(first_name, surname_name, day_of_birthday, address, gross_income, UserName, Password);
        this.tax_credits = tax_credits;
        this.tax_owned = tax_owned;
    }

    public UserData(double tax_credits, double tax_owned, int userID, String first_name, String surname_name, double gross_income) {
        super(userID, first_name, surname_name, gross_income);
        this.tax_credits = tax_credits;
        this.tax_owned = tax_owned;
    }

   
    

    
    

    // Getter methods...
    public double getTax_credits() {
        return tax_credits;
    }

    public double getTax_owned() {
        return tax_owned;
    }

    // Setter methods...
    public void setTax_credits(double tax_credits) {
        this.tax_credits = tax_credits;
    }

    public void setTax_owned(double tax_owned) {
        this.tax_owned = tax_owned;
    }
}
  
//    
//    public UserData(String first_name, String surname_name, String day_of_birthday, String address, double gross_income) {
//        super(first_name, surname_name, day_of_birthday, address, gross_income);
//        this.tax_credits = tax_credits;
//        this.tax_owned = tax_owned;
//    }









//
//
//        Users user3 = dbReader.getUserByUsername(enteredUserName);
//
//        // Retrieve income from the database
//        double income = databaseReader.getIncomeFromDatabase(enteredUserName);
//
//        // Example usage of the TaxCalculator interface and IrishTaxCalculator implementation
//        TaxCalculator taxCalculator = new IrishTaxCalculator();
//
//        // Calculate income tax considering tax credit
//        double tax = taxCalculator.calculateIncomeTax(income);
//
//        // Create a new UserData object with the calculated values
//        UserData userData = new UserData(tax, 0, user.getUserID(), user.getFirst_name(), user.getSurname_name(), income);
//        
//        // Update the results in another table
//        boolean updateSuccessful = addResults(userData);
//
//        if (updateSuccessful) {
//            System.out.println("Results updated successfully!");
//        } else {
//            System.out.println("Failed to update results.");
//        }
//    } catch (SQLException e) {
//        System.out.println("Error retrieving user information or income from the database: " + e.getMessage());
//    }
//    break;