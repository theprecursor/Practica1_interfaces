/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author thepr
 */
public class UserModel {
    
    private int id;
    private String email;
    private String user;
    private String password;

    public UserModel(int id, String email, String user, String password) {
        this.id = id;
        this.email = email;
        this.user = user;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
        
    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + ", email=" + email + ", user=" + user + ", password=" + password + '}';
    }

}
