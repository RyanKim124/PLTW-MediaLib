/**
 * Activity 2.5.7
 * Sanat Gupta, Ryan Kim, and PLTw
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib {
  private Book book;
  private Movie movie;
  private Song song;

  private String time;

  private static int numEntries = 0;
  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;
  public static String owner = "PLTW";

  public MediaLib() {
    time = DateLib.getTime();
  }

  public void addBook(Book b) {
    if (book == null) {
      book = b;
      numEntries++;
      numBooks++;
    } else {
      System.out.println("You cannot add more than one book to the library.");
    }

    time = DateLib.getTime();
  }

  public void addMovie(Movie m) {
    if (movie == null) {
      movie = m;
      numEntries++;
      numMovies++;
    } else {
      System.out.println("You cannot add more than one movie to the library.");
    }

    time = DateLib.getTime(); // updating time
  }

  public void addSong(Song s) {
    if (movie == null) {
      song = s;
      numEntries++;
      numSongs++;
    } else {
      System.out.println("You cannot add more than one song to the library.");
    }

    time = DateLib.getTime(); // updating time
  }

  public String toString() {
    String info = "Time Last Updated: " + time + " ";
    if (book != null) {
      info += book.toString();
    }

    if (movie != null) {
      info += "\n" + movie.toString();
    }

    if (song != null) {
      info += "\n" + song.toString();
    }

    return info;
  }

  public static String getOwner() {
    return owner;
  }

  public static void changeOwner(String o) {
    owner = o;
  }

  public static int getNumEntries() {
    System.out.println("Test: Owner is " + owner);
    return numEntries;
  }

  public static void getIndividualEntries() {
    System.out.println("You have " + numBooks + " books, " + numMovies + " movies, and " + numSongs + " songs.");
  }
}