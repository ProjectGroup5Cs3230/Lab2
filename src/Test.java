import java.util.ArrayList;

/**
 * Created by Tyler on 6/7/2015.
 */
public class Test
{
    public static void main(String[] args)
    {
        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("Hi");
        testArray.add("Coolness!");
        testArray.add("Sweetness!");
        testArray.add("Okay");
        testArray.add("Goodbye!");

        WorkGroup testGroup = new WorkGroup("tester");

        Student test1 = new Student();
        Student test2 = new Student("Larry", "Johnson", 0, testArray);

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

        testGroup.studentGroup.add(test1);
        testGroup.studentGroup.add(test2);

        System.out.println(testGroup + " " + testGroup.getGroupName());
        testGroup.setGroupName ("testGroup");

        testGroup.groupChat();
    }
}
