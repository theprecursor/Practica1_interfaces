/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelos.UserModel;
/**
 *
 * @author thepr
 */
public class UserController {
    
    private static String COLUMNA_ID_USUARIO = "id";
    private static String COLUMNA_USUARIO = "user";
    private static String COLUMNA_EMAIL_USUARIO = "email";
    private static String COLUMNA_CONTRASEÑA_USUARIO = "password";
    
    public boolean LogIn(String user, String pass){ 
        boolean logIn = true;   
        
        Connection c = new Conector().abrirConexion();
        String sql = "SELECT * FROM USERS WHERE USER = '"+ user +"' AND PASSWORD = '"+ pass +"'";
        List<UserModel> users = new ArrayList<>(); 
        try{
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
               UserModel usm = new UserModel(rs.getInt(COLUMNA_ID_USUARIO), rs.getString(COLUMNA_EMAIL_USUARIO), rs.getString(COLUMNA_USUARIO), rs.getString(COLUMNA_CONTRASEÑA_USUARIO));
               users.add(usm);
            }
            new Conector().cerrarConexion(c);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        if(users.isEmpty()){
            logIn = false;
        }
        
        return logIn;
        
    }
    
    public UserModel searchuser(String user){
        Connection c = new Conector().abrirConexion();
        String sql = "SELECT * FROM USERS WHERE USER = '"+ user+"'";
        UserModel usm = new UserModel(0, null, null, null);
        try{
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
               usm.setId(rs.getInt(COLUMNA_ID_USUARIO));
               usm.setEmail(rs.getString(COLUMNA_EMAIL_USUARIO));
               usm.setUser(rs.getString(COLUMNA_USUARIO));
               usm.setPassword(rs.getString(COLUMNA_CONTRASEÑA_USUARIO));
            }
            new Conector().cerrarConexion(c);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return usm;
    }
    
    public int cantidadUsers(){
        
        int users = 1;
        Connection c = new Conector().abrirConexion();
        String sql = "SELECT * FROM USERS";
        try{
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
               users++;
            }
            new Conector().cerrarConexion(c);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return users;
    }
    
    public boolean accountExist(String email, String user){
        boolean exist = false;
        Connection c = new Conector().abrirConexion();
        String sql = "SELECT * FROM USERS WHERE USER = '"+ user +"' OR EMAIL = '"+ email +"'";
        List<UserModel> users = new ArrayList<>(); 
        try{
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
               UserModel usm = new UserModel(rs.getInt(COLUMNA_ID_USUARIO), rs.getString(COLUMNA_EMAIL_USUARIO), rs.getString(COLUMNA_USUARIO), rs.getString(COLUMNA_CONTRASEÑA_USUARIO));
               users.add(usm);
            }
            for (UserModel user1 : users) {
                if(user1.getEmail().equals(email) || user1.getUser().equals(user)){
                    exist = true;
                }
            }
            new Conector().cerrarConexion(c);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        
        return exist;
    }
    
    public boolean SignIn(String email, String user, String pass) {
        boolean SignIn = true;
        
        Connection c  = new Conector().abrirConexion();
        int users = cantidadUsers();
        UserModel usm = new UserModel(users, email, user, pass);
        System.out.println(users +"\n"+ email +"\n" + user +"\n" + pass);
        String sql = "INSERT INTO USERS VALUES( '" + usm.getId() + "', '" + usm.getEmail() + "', '" + usm.getUser() + "', '" + usm.getPassword() + "')";
        try {
            Statement stmt = c.createStatement();
            stmt.executeUpdate(sql);
            new Conector().cerrarConexion(c);
        } catch (SQLException ex) {
            System.out.println("Error al insertar datos " + ex.getMessage());
            SignIn = false;
        }
        
        return SignIn;
        
    }
}
