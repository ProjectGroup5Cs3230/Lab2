/*
 * Lab 2 - Create an application with 'Student' and 'Group' objects based on the CS 3230 Summer 2015 class. This project
 * should populate a conversation between all of the students in a group and should run through (once) each group's
 * conversations.  Each student has five conversation greetings. Each student takes a turn outputing a greeting to the
 * console until each of the student's five greetings have been written to the console.
 *
 * Created By - Mat Brewer and Tyler Cazier
 * 5/26/15
 */

import java.util.*;



public class WorkGroup {

    private String groupName;
    ArrayList<Student> studentGroup;
    private int numOfGreetings = 0;

    // Constructor
    public WorkGroup (String groupName)
    {
        this.groupName = groupName;
        studentGroup = new ArrayList<>();
        numOfGreetings = 0;
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
     * smallest number of greetings has printed all greetings to the console.
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

            System.out.println();
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
            // Set numOfGreetings to the size of the first students greetings array.
            numOfGreetings = studentGroup.get(0).greetings.size();

            // If there is a student with fewer greetings, update the size of numOfGreetings
            for (Student student : this.studentGroup)
            {
                if (numOfGreetings > student.greetings.size())
                    numOfGreetings = student.greetings.size();
            }
        }
    }
}




