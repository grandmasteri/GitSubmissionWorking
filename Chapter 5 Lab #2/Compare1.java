
/**
 * Write a description of class Compare1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Compare1
{
    // instance variables - replace the example below with your own
   
    /**
     * Constructor for objects of class Compare1
     */
    public Compare1()
    {
        // initialise instance variables
        
    }

    public static String largest(String s1, String s2) {
        if (s1.compareTo(s2) > 0) {
            return s1;
        }
        else {
            return s2;
        }
    }
}
