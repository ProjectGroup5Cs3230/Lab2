/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*;

/**
 *
 * @author Owner
 */
public class Students {
    
    protected String firstname;
    protected String lastname;
    protected int score;
    ArrayList<String> group1Greetings = new ArrayList<String>(Arrays.asList("hello","hi","how are you?","not bad. you?","not bad","nice day today"));
    
    public Students()
    {
    
        firstname = "";
        lastname = "";
        score = 0;
        
    
    }
    
    public Students(String firstname, String lastname)
    {
       //load value given to use from class list 
       this.firstname = firstname;
       this.lastname = lastname;  
       this.group1Greetings = group1Greetings;
    
    }
    
    public void talk()
    {
    
        for (int i = 0; i < group1Greetings.size(); i++)
        {
            System.out.println(group1Greetings.get(i));
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                
            }
        
        }
    
    
    }
    
}
