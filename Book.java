/*
 * Activity 2.5.7
 * Sanat Gupta, Ryan Kim, and PLTw
 * 
 * A Book class for the MediaLibrary program
 */
public class Book {
  private String title;
  private String author;
  private int rating;

  /*** Constructor ****/
  public Book(String t, String a) {
    title = t;
    author = a;
    rating = 0;
  }

  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getRating() {
    return rating;
  }

  public void adjustRating(int r) {
    rating += r;
    if (rating > 10) {
      rating = 10;
    } else if (rating < 0) {
      rating = 0;
    }
  }

  public String toString() {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    return info;
  }

  // public String getInfo()
  // {
  // return "The current book information is " + toString();
  // }

  public boolean equals(Book b) {
    return b.title.equals(this.title) && b.author.equals(this.author);
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }
}
