/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("Book Created: " + myBook);

    int myRating = 5;
    myBook.adjustRating(myRating);

    myLib.addBook(myBook);
    System.out.println("Library: " + myLib);
    
    // System.out.println(newBook2.title); (shows an error)

    Movie myMovie1 = new Movie("Interstellar", 3.0);
    Movie myMovie2 = new Movie("Interstellar", 3.0);

    System.out.println(myMovie1);

    System.out.println(myMovie1.equals(myMovie2));

    Song mySong1 = new Song("Never Gonna Give You Up");
    Song mySong2 = new Song("Never Gonna Give You Up");

    System.out.println(mySong1);

    System.out.println(mySong1.equals(mySong2));
  }
}