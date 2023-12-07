/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demotest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author paulooliveira
 */
public class DatabaseWriter extends Database {
    public boolean addAdmin(Admin admin) throws SQLException {
        try(
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();  
        ){
            String sql = String.format("INSERT INTO " + TABLE_NAME1 + " VALUES ("
                    + "%d ,'%s', '%s', '%s', '%s' );",
                   admin.getAdminID(), admin.getFirst_name(), admin.getSurname_name(), admin.getDay_of_birthday(), admin.getAddress());
            stmt.execute(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
            public boolean addUser(Users users) throws SQLException {
        try(
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();  
        ){
            String sql = String.format("INSERT INTO " + TABLE_NAME2 + " VALUES ("
                    + "%d, '%s', '%s','%s', '%s', %f );",
                   users.getUserID(), users.getFirst_name(), users.getSurname_name(), users.getDay_of_birthday(), users.getAddress(), users.getGross_income());
            stmt.execute(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    
    }
            
               public boolean addResults(UserData userData) throws SQLException {
        try(
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();  
        ){
            String sql = String.format("INSERT INTO " + TABLE_NAME3 + " VALUES ("
                    + "%d ,'%s', '%s' , %f, %f, %f);",
                   userData.getUserID(), userData.getFirst_name(), userData.getSurname_name(), userData.getGross_income(), userData.getTax_credits(), userData.getTax_owned());
            stmt.execute(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        
    }
}
    
    
//    public boolean addAllPatients(List<Patient> patientList) {
//        return true;
//    }
//}
