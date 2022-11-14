/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thepr
 */
public class UserModelTest {
    
    public UserModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class UserModel.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        UserModel instance = new UserModel(1, "pepe", "pepe", "pepe");
        int expResult = 0;
        int result = instance.getId();
        assertNotNull(instance);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setId method, of class UserModel.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        UserModel instance = new UserModel(1, "pepe", "pepe", "pepe");
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance);
    }

    /**
     * Test of getEmail method, of class UserModel.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        UserModel instance = new UserModel(1, "pepe", "pepe", "pepe");
        String expResult = "";
        String result = instance.getEmail();
        // TODO review the generated test code and remove the default call to fail.
         assertNotNull(instance);
    }

    /**
     * Test of setEmail method, of class UserModel.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        UserModel instance = new UserModel(1, "pepe", "pepe", "pepe");
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance);
    }

    /**
     * Test of getUser method, of class UserModel.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        UserModel instance = new UserModel(1, "pepe", "pepe", "pepe");
        String expResult = "";
        String result = instance.getUser();
       
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance);
    }

    /**
     * Test of setUser method, of class UserModel.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String user = "";
        UserModel instance = new UserModel(1, "pepe", "pepe", "pepe");
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance);
    }

    /**
     * Test of getPassword method, of class UserModel.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        UserModel instance = new UserModel(1, "pepe", "pepe", "pepe");
        String expResult = "";
        String result = instance.getPassword();
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance);
    }

    /**
     * Test of setPassword method, of class UserModel.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        UserModel instance = new UserModel(1, "pepe", "pepe", "pepe");
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance);
    }

    /**
     * Test of toString method, of class UserModel.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UserModel instance = new UserModel(1, "pepe", "pepe", "pepe");
        String expResult = "";
        String result = instance.toString();
 assertNotNull(instance);        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
