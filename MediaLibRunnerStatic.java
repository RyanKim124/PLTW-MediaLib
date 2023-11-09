/**
 * Activity 2.5.7
 * Sanat Gupta and Ryan Kim
 * 
 * A static runner for the MediaLibrary program.
 */
public class MediaLibRunnerStatic {
    public static void main (String[] args)
    {
        MediaLib.changeOwner("Crazy");

        System.out.println(MediaLib.getOwner() + "'s Library");
    }
}
