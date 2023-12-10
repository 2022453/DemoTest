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
import java.sql.PreparedStatement;
/**
 *
 * @author paulooliveira
 */
public class DatabaseWriter extends Database {
//    public boolean addAdmin(Admin admin) throws SQLException {
//        try(
//            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
//            Statement stmt = conn.createStatement();  
//        ){
//            String sql = String.format("INSERT INTO " + TABLE_NAME1 + " VALUES ("
//                    + "%d ,'%s', '%s', '%s', '%s' );",
//                   admin.getAdminID(), admin.getFirst_name(), admin.getSurname_name(), admin.getDay_of_birthday(), admin.getAddress());
//            stmt.execute(sql);
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//        
//    }
            public boolean addUser(Users users) throws SQLException {
        try(
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();  
        ){
            String sql = String.format("INSERT INTO " + TABLE_NAME2 + " VALUES ("
                    + "%d, '%s', '%s','%s', '%s', %f, '%s', '%s');",
                   users.getUserID(), users.getFirst_name(), users.getSurname_name(), users.getDay_of_birthday(), users.getAddress(), users.getGross_income(), 
                   users.getUserName(), users.getPassword());
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
               
                   public boolean updateUser(Users user) {
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(
                    "UPDATE " + TABLE_NAME2 + " SET first_name = ?, surname_name = ?, day_of_birthday = ? WHERE user_id = ?"
            )
        ) {
            stmt.setString(1, user.getFirst_name());
            stmt.setString(2, user.getSurname_name());
            stmt.setString(3, user.getDay_of_birthday());
            stmt.setInt(4, user.getUserID());

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0; // If rowsAffected is greater than 0, the update was successful
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Update failed
        }
    }
                   
    
    // Other methods...

    public boolean removeUser(String username) {
        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(
                    "DELETE FROM " + TABLE_NAME2 + " WHERE Username = ?"
            )
        ) {
            stmt.setString(1, username);

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0; // If rowsAffected is greater than 0, the deletion was successful
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Deletion failed
        }
    }
    
    
    public boolean addAllUser(List<Users> userstList) {
        return true;
    }

                   }

