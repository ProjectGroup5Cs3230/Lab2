import java.util.ArrayList;

/**
 * Created by Owner on 5/28/2015.
 */
public class students
{


    protected String FirstName;
    protected String Lastname;
    protected int Score;
    ArrayList<String> Greetings = new ArrayList<String>();

    public students (String FirstName, String LastName, int Score)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Score = Score;
        Greetings = new ArrayList<String>();
    }

    //Creates file object for user's choice.
    File inputFile;
    inputFile = chooser.getSelectedFile();





}
}
