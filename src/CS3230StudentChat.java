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

import java.util.ArrayList;


/**
 * This class is used to create arrays of responses, students, and groups and to initiate group chats.
 *
 * @author Owners - Mat Brewer and Tyler Cazier
 * 5/26/15
 */
public class CS3230StudentChat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Create Window Frame
        MainWindowFrame chatWindow = new MainWindowFrame();

        // Create Groups
        WorkGroup projectGroup1 = new WorkGroup("ProjectGroup1");
        WorkGroup projectGroup2 = new WorkGroup("ProjectGroup2");
        WorkGroup projectGroup3 = new WorkGroup("ProjectGroup3");
        WorkGroup projectGroup4 = new WorkGroup("ProjectGroup4");
        WorkGroup projectGroup5 = new WorkGroup("ProjectGroup5");
        WorkGroup projectGroup6 = new WorkGroup("ProjectGroup6");

        // Create Response Arrays
        ArrayList<String> jaredEResponses= new ArrayList<>();
            jaredEResponses.add("Hi!");
            jaredEResponses.add("A predecessor fasts across a turning infant.");
            jaredEResponses.add("The twentieth bishop acts past the pedestrian.");
            jaredEResponses.add("The incorporate electron overlaps over the justified art.");
            jaredEResponses.add("Goodbye!");
        ArrayList<String> justinWResponses= new ArrayList<>();
            justinWResponses.add("Hello!");
            justinWResponses.add("A presented panel instructs each well against the owed liver.");
            justinWResponses.add("A land universal peers.");
            justinWResponses.add("Her am consumer bringings any situated exhaust.");
            justinWResponses.add("Bye!");
        ArrayList<String> michaelBResponses= new ArrayList<>();
            michaelBResponses.add("Howdy!");
            michaelBResponses.add("How can the desktop despair?");
            michaelBResponses.add("A tail gladdens the result throughout the damp wrist.");
            michaelBResponses.add("The sundry reflects!");
            michaelBResponses.add("See ya!");
        ArrayList<String> aaronCResponses= new ArrayList<>();
            aaronCResponses.add("Hey!");
            aaronCResponses.add("Hey!");
            aaronCResponses.add("Hey!");
            aaronCResponses.add("Hey!");
            aaronCResponses.add("Fairwell!");
        ArrayList<String> chrisSResponses= new ArrayList<>();
            chrisSResponses.add("Bonjour!");
            chrisSResponses.add("The pole jumps after the movie!");
            chrisSResponses.add("The class waves!");
            chrisSResponses.add("The beforehand league foams around the meaningful baby.");
            chrisSResponses.add("Bye, Bye!");
        ArrayList<String> clintonFResponses= new ArrayList<>();
            clintonFResponses.add("Hola!");
            clintonFResponses.add("An oar confines the caffeine.");
            clintonFResponses.add("The entire jazz accustoms a unauthorized oil.");
            clintonFResponses.add("Another secular geology faints into the porter.");
            clintonFResponses.add("Later!");
        ArrayList<String> kennethAResponses= new ArrayList<>();
            kennethAResponses.add("Greetings!");
            kennethAResponses.add("Greetings!");
            kennethAResponses.add("Greetings!");
            kennethAResponses.add("Greetings!");
            kennethAResponses.add("So long!");
        ArrayList<String> mathewBResponses= new ArrayList<>();
            mathewBResponses.add("Ciao!");
            mathewBResponses.add("An enlarged bell finishes.");
            mathewBResponses.add("The phoenix maximizes the intolerance.");
            mathewBResponses.add("A model bows!");
            mathewBResponses.add("Have a good one!");
        ArrayList<String> tylerCResponses= new ArrayList<>();
            tylerCResponses.add("Kon'nichiwa!");
            tylerCResponses.add("An inquiring device sickens below the swallow.");
            tylerCResponses.add("On top of the ray advertises a condemned monopoly.");
            tylerCResponses.add("The plate volunteers a fossil.");
            tylerCResponses.add("Later!");
        ArrayList<String> andrewGResponses= new ArrayList<>();
            andrewGResponses.add("How!");
            andrewGResponses.add("The timer sings beside a flaw.");
            andrewGResponses.add("The headache publishes my rival world.");
            andrewGResponses.add("A commercial moderate bolts across the salesman.");
            andrewGResponses.add("Peace!");
        ArrayList<String> moselleBResponses= new ArrayList<>();
            moselleBResponses.add("Ni Hao!");
            moselleBResponses.add("A picked hazard buffers a traded outcome.");
            moselleBResponses.add("The swamp excuses a round diary within the victim.");
            moselleBResponses.add("The scream toes the line!");
            moselleBResponses.add("Adios!");

        // Create Students
        Student jaredElzinga = new Student("Jared", "Elzinga", 0, jaredEResponses);
        Student justinWalker = new Student("Justin", "Walker", 0, justinWResponses);
        Student michaelBrown = new Student("Michael", "Brown", 0, michaelBResponses);
        Student aaronCalder = new Student("Aaron", "Calder", 0, aaronCResponses);
        Student christopherStrickland = new Student("Christopher", "Strickland", 0, chrisSResponses);
        Student clintonFowler = new Student("Clinton", "Fowler", 0, clintonFResponses);
        Student kennethAdair = new Student("Kenneth", "Adair", 0, kennethAResponses);
        Student mathewBrewer = new Student("Mathew", "Brewer", 0, mathewBResponses);
        Student tylerCazier = new Student("Tyler", "Cazier", 0, tylerCResponses);
        Student andrewGray = new Student("Andrew", "Gray", 0, andrewGResponses);
        Student moselleBair = new Student("Moselle", "Bair", 0, moselleBResponses);

        // Add Students to Groups
        projectGroup1.studentGroup.add(jaredElzinga);
        projectGroup2.studentGroup.add(justinWalker);
        projectGroup2.studentGroup.add(michaelBrown);
        projectGroup3.studentGroup.add(aaronCalder);
        projectGroup3.studentGroup.add(christopherStrickland);
        projectGroup4.studentGroup.add(clintonFowler);
        projectGroup4.studentGroup.add(kennethAdair);
        projectGroup5.studentGroup.add(mathewBrewer);
        projectGroup5.studentGroup.add(tylerCazier);
        projectGroup6.studentGroup.add(andrewGray);
        projectGroup6.studentGroup.add(moselleBair);

        // Start Chats

        projectGroup1.groupChat();
        projectGroup2.groupChat();
        projectGroup3.groupChat();
        projectGroup4.groupChat();
        projectGroup5.groupChat();
        projectGroup6.groupChat();

    }
    
}
