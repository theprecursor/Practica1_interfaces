/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thepr
 */
public class Conector {
    
    Connection conexion;
   
    
    public Connection abrirConexion(){
        String cc="jdbc:mysql://localhost:3306/users";
        
        try {
            conexion = DriverManager.getConnection(cc, "root", "");
        } catch (SQLException ex) {
            System.out.println("Error al abri conexion "+ex.getMessage());
        }
        return conexion;
    }
    
    
    
    public void cerrarConexion(Connection conexion){
        if(conexion != null){
            try {
                conexion.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar la conexion bbdd "+ex.getMessage());
            }
        }
    }
}
