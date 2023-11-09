/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;

  private static int numEntries = 0;
  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;
  public static String owner = "PLTW";

  public void addBook(Book b)
  {
    if (book == null)
    {
      book = b;
      numEntries++;
      numBooks++;
    }
    else 
    {
      System.out.println("You cannot add more than one book to the library.");
    }
  }

  public void addMovie(Movie m) {
    if (movie == null)
    {
      movie = m;
      numEntries++;
      numMovies++;
    }
    else
    {
      System.out.println("You cannot add more than one movie to the library.");
    }
  }

  public void addSong(Song s) {
    if (movie == null)
    {
      song = s;
      numEntries++;
      numSongs++;
    }
    else
    {
      System.out.println("You cannot add more than one song to the library.");
    }
  }

  public String toString() 
  {
    String info = "";

    info = book.toString();
    if (movie != null) {
      info += "\n" + movie.toString();
    }
    if (song != null) {
      info += "\n" + song.toString();
    }

    return info;
  }

  public static String getOwner()
  {
    return owner;
  }

  public static void changeOwner(String o)
  {
    owner = o;
  }

  public static int getNumEntries() 
  {
    System.out.println("Test: Owner is " + owner);
    return numEntries;
  }

  public static void getIndividualEntries() 
  {
    System.out.println("You have " + numBooks + " books, " + numMovies + " movies, and " + numSongs + " songs.");
  }
}