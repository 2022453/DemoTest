/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demotest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;

/**
 *
 * @author paulooliveira
 */
public class DatabaseReader extends Database {
    public ArrayList<Users> getAllData() throws SQLException {
            ArrayList<Users> usersList = new ArrayList<>();
            
            
 try(
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();  
        ){
 
ResultSet results = stmt.executeQuery(String.format(
                    "SELECT * FROM %s;",
                    TABLE_NAME2));
 
  while (results.next()) {
            // Create a new Patient object for each row  
            
                String first_name = results.getString("first_name");
                String surname_name = results.getString("surname_name");
                String day_of_birthday = results.getString("day_of_birthday");
                String UserName = results.getString("Username");
                int userID = results.getInt("user_id");

               Users user1 = new Users(userID, first_name, surname_name, day_of_birthday, UserName);
               
               
               usersList.add(user1);
  }
        } catch (SQLException e) {
            e.printStackTrace();
      
           
              
        }
     return usersList;
     
    }

public Users getUserByUsername(String username) throws SQLException {
        Users user = null;

        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            PreparedStatement stmt = conn.prepareStatement(
                    "SELECT * FROM " + TABLE_NAME2 + " WHERE Username = ?"
            )
        ) {
            stmt.setString(1, username);
            ResultSet results = stmt.executeQuery();

            if (results.next()) {
                int userID = results.getInt("user_id");
                String first_name = results.getString("first_name");
                String surname_name = results.getString("surname_name");
                String day_of_birthday = results.getString("day_of_birthday");
                String password = results.getString("Password"); // Adjusted to match the column name

                 user = new Users(userID, first_name, surname_name, day_of_birthday, username, password);
            }
        }

        return user;
    }

    public UserData getUserDataByUserID(int userID) throws SQLException {
        String query = "SELECT * FROM " + TABLE_NAME3 + " WHERE user_id = ?";
        try (
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(query)
        ) {
            preparedStatement.setInt(1, userID);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                double taxCredits = resultSet.getDouble("tax_credits");
                double taxOwned = resultSet.getDouble("tax_owned");
                String firstName = resultSet.getString("first_name");
                String surnameName = resultSet.getString("surname_name");
                double grossIncome = resultSet.getDouble("gross_income");

                // Create and return a new UserData object
                return new UserData(taxCredits, taxOwned, userID, firstName, surnameName, grossIncome);
            }
        }
        throw new SQLException("User data not found in the new table");
    }

    public static double getIncomeFromDatabase(String username) throws SQLException {
        String query = "SELECT gross_income FROM users WHERE username = ?";
        try (
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(query)
        ) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getDouble("gross_income");
            }
        }
        throw new SQLException("User not found in the database");
    }
}

    
    