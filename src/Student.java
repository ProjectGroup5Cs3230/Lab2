/*
 * Lab 2 - Create an application with 'Student' and 'Group' objects based on the CS 3230 Summer 2015 class. This project
 * should populate a conversation between all of the students in a group and should run through (once) each group's
 * conversations.  Each student has five conversation greetings. Each student takes a turn outputing a greeting to the
 * console until each of the student's five greetings have been written to the console.
 *
 * Created By - Mat Brewer and Tyler Cazier
 * 5/26/15
 */

import java.util.ArrayList;

/**
 * Allows the creation of a 'Student' Object.  Each 'Student' has a first name, last name, score, and a list of greetings.
 * These are used in the creation of a chat application.  Besides the 'greetings' ArrayList, student fields can only be
 * accessed via mutator/accessor methods.  Use ArrayList methods to manipulate 'greetings' data.
 *
 * @author Owners - Mat Brewer and Tyler Cazier
 * 5/26/15
 */
public class Student {

    // Student fields.  Each student will have a first name, last name, score, and a set of greetings.
    private String firstName;
    private String lastName;
    private int score;
    ArrayList<String> greetings;


    // Default Constructor - Namely for testing purposes.
    public Student()
    {
       this.firstName = "Sample";
       this.lastName = "Student";
       this.score = 0;
       this.greetings = new ArrayList<>();

        // Add default list values
            this.greetings.add("Hi!");
            this.greetings.add("It's a Beautiful Day!");
            this.greetings.add("Fancy seeing you here!");
            this.greetings.add("Hopscotch");
            this.greetings.add("Goodbye!");
    }

    // Allows the user to create a student and manually enter data.
    public Student(String firstName, String lastName, int score, ArrayList<String> greetings)
    {
       //load value given to use from class list 
       this.firstName = firstName;
       this.lastName = lastName;
       this.score = 0;
       this.greetings = greetings;
    
    }

    /**
     * Returns a String that describes this Student object.
     *
     * @return String - describes this object.
     */
    public String toString ()
    {
        return "Student: " + firstName + " " + lastName;
    }

    /* Accessor Methods */

    /**
     * Returns the first name of this student item as a String.
     *
     * @return String - the first name of this item
     */
    public String getFirstName ()
    {
        return firstName;
    }

    /**
     * Returns the last name of this item as a String.
     *
     * @return String - the last name of this item
     */
    public String getLastName ()
    {
        return lastName;
    }

     /**
     * Returns the full name of this item as a String.
     *
     * @return String - the first and last name of this item
     */
    public String getName ()
    {
        return firstName + " " + lastName;
    }

    /**
     * Returns the score of this item as a String.
     *
     * @return int - the scorename of this item
     */
    public int getScore ()
    {
        return score;
    }

     /* Mutator Methods */

    /**
     * Sets the first name of this student.
     *
     * @param firstName - the new first name of the object.
     */
    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    /**
     * Sets the last name of this Student.
     *
     * @param lastName - the new last name of the object.
     */
    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    /**
     * Sets the score of this Student.
     *
     * @param score - the new score of the object.
     */
    public void setScore (int score)
    {
        this.score = score;
    }

    /* Main methods */

    /**
     * Prints all user greetings.  Each greeting is on a new line.
     */
    public void printGreetings ()
    {
        for (String greeting: this.greetings)
        {
            System.out.println(greeting);
        }
    }


}
