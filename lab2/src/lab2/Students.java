/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class Students {
    
    protected String firstname;
    protected String lastname;
    protected int score;
    ArrayList<String> greetings = new ArrayList<String>();
    
    public Students(String firstname, String lastname){
       //load value given to use from class list 
       this.firstname = firstname;
       this.lastname = lastname;       
    
    }
    
}
