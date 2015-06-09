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

import java.io.IOException;
import java.util.ArrayList;

/**
 * This class was used for testing the Student and WorkGroup classes of this package.
 *
 * @author Owners - Mat Brewer and Tyler Cazier
 * 5/26/15
 */
public class Test
{
    public static void main(String[] args) throws IOException
    {
        // Creat an array of greetings for a new student.
        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("Hi");
        testArray.add("Coolness!");
        testArray.add("Sweetness!");
        testArray.add("Okay");
        testArray.add("Goodbye!");

        // Create student default and custom.
        Student test1 = new Student();
        Student test2 = new Student("Larry", "Johnson", 0, testArray);

        // Create a work group to add test students.
        WorkGroup testGroup = new WorkGroup("tester");

        // Test 'Student' functions.
        System.out.println(test1 + " " + test1.getName() + " " + test1.getFirstName() + " " + test1.getLastName()
                + " " + test1.getScore() + " " );
        test1.printGreetings();

        System.out.println(test2 + " " + test2.getName() + " " + test2.getFirstName() + " " + test2.getLastName()
                + " " + test2.getScore() + " " );
        test2.printGreetings();

        test2.setFirstName("George");
        test2.setLastName("Sorenson");
        test2.setScore(10);

        System.out.println(test2 + " " + test2.getName() + " " + test2.getFirstName() + " " + test2.getLastName()
                + " " + test2.getScore() + " " );

        // Test work group.
        testGroup.studentGroup.add(test1);
        testGroup.studentGroup.add(test2);
        testGroup.studentGroup.add(new Student());

        System.out.println(testGroup + " " + testGroup.getGroupName());
        testGroup.setGroupName ("testGroup");

        testGroup.groupChat();

        System.out.println(testGroup.studentGroup);
    }
}
