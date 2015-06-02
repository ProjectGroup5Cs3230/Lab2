/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Cs3230Students {
    
    protected List<Students> students;
    protected String[] names;
    
    public Cs3230Students(){
        //construct list of cs3230 students
        this.names = new String[]{"Clint Fowler","Mat Brewer","Tyler Cazier","Chris Strickland"};
        Set<String> classNames = new HashSet<String>(Arrays.asList(this.names));
        //set hash to make values unique
        for (String name: classNames){
        
            String[] splitname = name.split(" ");
            Students newStudent = new Students(splitname[0],splitname[1]);
            students.add(newStudent);
        }
            

}
    
    
    
}
