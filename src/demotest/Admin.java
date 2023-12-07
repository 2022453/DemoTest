/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demotest;

/**
 *
 * @author paulooliveira
 */
public class Admin {
    
    
    private static int admin_id = 1;
    private int adminID;
    private String first_name;
    private String surname_name;
    private String day_of_birthday;
    private String address;

    public Admin(String first_name, String surname_name, String day_of_birthday, String address) {
        this.first_name = first_name;
        this.surname_name = surname_name;
        this.day_of_birthday = day_of_birthday;
        this.address = address;
        this.adminID = adminID;
        adminID = admin_id++;
        
    }

    public static int getAdmin_id() {
        return admin_id;
    }

    public static void setAdmin_id(int admin_id) {
        Admin.admin_id = admin_id;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname_name() {
        return surname_name;
    }

    public void setSurname_name(String surname_name) {
        this.surname_name = surname_name;
    }

    public String getDay_of_birthday() {
        return day_of_birthday;
    }

    public void setDay_of_birthday(String day_of_birthday) {
        this.day_of_birthday = day_of_birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
  
}
