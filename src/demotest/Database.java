/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demotest;

/**
 *
 * @author paulooliveira
 */
public abstract class  Database {
    
    protected final static String DB_BASE_URL = "jdbc:mysql://localhost";
    protected final static String USER = "ooc2024";
    protected final static String PASSWORD = "ooc2024";
    protected final static String DB_NAME = "demo";
    protected final static String TABLE_NAME1 = "admin";
    protected final static String TABLE_NAME2 = "users";
    protected final static String TABLE_NAME3 = "taxResults";
   // jdbc:mysql://localhost/hospital
    protected final static String DB_URL = DB_BASE_URL + "/" + DB_NAME;
    
}


