/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*;



public class Cs3230Students {
    
    protected List<Students> students;
    protected String[] group1;
    protected String[] group2;
    protected String[] group3;
    protected String[] group4;
    protected String[] group5;
    protected String[] group6;
    
    public Cs3230Students()
    {
        //construct list of cs3230 students
        this.group1 = new String[]{"Aaron Calder","Jarad Elzinga"};
        this.group2 = new String[]{"Justin Walker","Michael Brown"};
        this.group3 = new String[]{"Christopher Strickland","unknown student"};
        this.group4 = new String[]{"Clint Fowler","Kenneth Adair"};
        this.group5 = new String[]{"Mat Brewer","Tyler Cazier"};
        this.group6 = new String[]{"Andrew Gray","Moselle Bair"};
        
    }    
    public void giveNames()
        {
            Set<String> classNames = new HashSet<String>(Arrays.asList(this.group5));
        //set hash to make values unique
            for (String names: classNames)
            {
        
                String[] splitname = names.split(" ");
                //Students newStudent1 = new Students(this.group5[0]);
                //students.add(newStudent1);
                //Students newStudent2 = new Students();
                //students.add(newStudent2);
            }
            
        }
       
}
    
    
    

