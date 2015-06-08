/*
 * Lab 2 - Create an application with 'Student' and 'Group' objects based on the CS 3230 Summer 2015 class. This project
 * should populate a conversation between all of the students in a group and should run through (once) each group's
 * conversations.  Each student has five conversation greetings. Each student takes a turn outputing a greeting to the
 * console until each of the student's five greetings have been written to the console.
 *
 * Lab 3 - Build a JFrame with a scrollable text field, a scrollable input field, and a 'Send' button. Outputs now go
 * to a JFrame text field.
 *
 * Created By - Mat Brewer and Tyler Cazier
 * 6/7/15
 */

import java.util.*;


/**
 * Allows the creation of a 'WorkGroup' Object.  Each 'WorkGroup' has a group name, an array of students, and an integer
 * that signifies how many student responses should be printed when call the groupChat method.  There is a function
 * that calculates this number and another function that simulates a chat conversation between all 'Student' objects
 * in the group's set.  There is cap of 100 responses from each student.
 *
 * @author Owners - Mat Brewer and Tyler Cazier
 * 5/26/15
 */
public class WorkGroup {

    private String groupName;
    HashSet<Student> studentGroup;
    private int numOfGreetings;

    // Constructor
    public WorkGroup (String groupName)
    {
        this.groupName = groupName;
        studentGroup = new HashSet<>();
        numOfGreetings = 100; // Put a cap on the number greetings each 'Student' will output to the console.
    }

    /**
     * Returns a String that describes this WorkGroup object.
     *
     * @return String - describes this object.
     */
    public String toString ()
    {
        return groupName;
    }


    /* Accessor Methods */

    /**
     * Returns the name of this student item as a String.
     *
     * @return String - the name of this item
     */
    public String getGroupName ()
    {
        return groupName;
    }

    /* Mutator Methods */

    /**
     * Sets the group Name of this student.
     *
     * @param groupName - the new first name of the object.
     */
    public void setGroupName (String groupName)
    {
        this.groupName = groupName;
    }

    /* Main methods */

    /**
     * Prints the first greeting of each 'Student' in the list, then the second, and so on until the 'Student' with the
     * smallest number of greetings has printed all greetings to the console. There is a cap of 100 greetings per
     * student.
     */
    public void groupChat ()
    {
        // Calculate the number of greetings to print.
        findGreetingsNumber();

        // Print group name.
        System.out.println(groupName + "\n");

        // Print the first greeting of each student in the list, then the second, and so on.
        for (int i = 0; i < numOfGreetings; i++)
        {
            for (Student student : this.studentGroup)
            {
                System.out.println(student.getName() + ": " + student.greetings.get(i));
            }
        }

        System.out.println();
    }

    /**
     * Find student in group with the smallest number greetings to prevent array bounds error during groupChat().
     */
    private void findGreetingsNumber ()
    {
        if (studentGroup.size() > 0)
        {
            // If there is a student with fewer greetings, update the size of numOfGreetings
            for (Student student : this.studentGroup)
            {
                if (numOfGreetings > student.greetings.size())
                    numOfGreetings = student.greetings.size();
            }
        }
    }
}




