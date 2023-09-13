/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class SQLSeverDataProvider {

    Connection connection = null;

    public void open() {
         String strServer ="DESKTOP-KNLDAST\\SQLEXPRESS";
         String strDatabase ="QLVPP_" ; 
         String strUser ="sa";
         String strPass="123";
        try {
            
            String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(driver);
            String connectURL = "jdbc:sqlserver://"+strServer
                +":1433;databaseName="+strDatabase
                +";user="+strUser
                +";password="+strPass
                + ";encrypt=true;trustServerCertificate=true";
              connection = DriverManager.getConnection(connectURL);
            if(connection!=null)
            {
                  System.out.println("ket noi thanh cong");
            }
            else
            {
                  System.out.println("ket noi khong thanh cong");
            }
        } catch (Exception e) {
            e.getMessage();
        }

   }

    public void close() {
        try {
            this.connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLSeverDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet executeQuery(String sql) {
        ResultSet resultSet = null;
        Statement statement;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SQLSeverDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;
    }

    public int executeUpdate(String sql) {
        int n = -1;
        try {
            Statement statement = connection.createStatement();
            n = statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SQLSeverDataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;

    }
   

}
