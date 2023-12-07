/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demotest;

import java.sql.SQLException;

/**
 *
 * @author paulooliveira
 */
public class DemoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        
        Users user1 = new Users("Diogo", "Lemos", "1988-06-17", "Bow Street, 105" , 2000.90);
        
        
          //Adding p1 to the database
        DatabaseWriter dbw = new DatabaseWriter();
        if (dbw.addUser(user1)) {
            System.out.println("user1 added");
            
            Users user2 = new Users("Paulo", "Machado", "1997-08-07", "North Circular", 2000.90);
            
             DatabaseWriter dbw1 = new DatabaseWriter();
        if (dbw1.addUser(user2)) {
            System.out.println("user2 added");
        }
        }
    }
        
}
