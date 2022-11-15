/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.dao.conx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnS {

    private static volatile ConnS instance;
    private static volatile Connection connection;

    private ConnS() {

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnS.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
        if (connection != null) {
            throw new RuntimeException("Use getConnection() method to create ");
        }
    }

    public static ConnS getInstance() {
        if (instance == null) { synchronized (ConnS.class) {
                if (instance == null) {
                    instance = new ConnS();
                    System.out.println("Primera Instancia!!");
                }
            }
        }
        return instance;
    }

    public Connection getConnection() {
        if (connection == null) { synchronized (ConnS.class) {
                if (connection == null) {
                    try {
                        String dbUrl= "jdbc:sqlite:data/db_ventas.db?foreign_keys=on;";
                        connection = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }

}
