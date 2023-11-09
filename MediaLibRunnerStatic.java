public class MediaLibRunnerStatic {
    public static void main (String[] args)
    {
        MediaLib.changeOwner("Crazy");

        System.out.println(MediaLib.getOwner() + "'s Library");
    }
}
