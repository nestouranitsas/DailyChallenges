//this program prints what books from a given library have been read or not read.

//import HashMap
import java.util.HashMap;

//create Library class
public class Library {
  //create class constructor
    public Library() {
  }
  
  //method for checking whether or not a book has been read
  public void checkBookStatus(HashMap<String, Boolean> library) {
    //makes sure hash map is not empty before checking for books
    if (library.size() < 1) {
      System.out.println("Error! The Library you are searching for is empty.");
    } 
    //enumerates through the books and checks for finished (true) or unfinished (fasle) books then prints them
    else {
        //finds finished books
        for (String book : library.keySet()) {
      	if (library.get(book) == true) {
        	System.out.println("The following Book has been read: " + book);
       }
     }
      //finds unfinished books
      for (String book : library.keySet()) {
        if (library.get(book) == false) {
          System.out.println("The following book hasn't been read: " + book);
        }
      }
   }
    
  } 
  
  //main method for library class
  public static void main(String[] args) {
    //creates a new hash map object called myBooks
    HashMap<String, Boolean> myBooks = new HashMap<String, Boolean>();
    //adding books to the hash map
    myBooks.put("Road Down The Funnel",true);
    myBooks.put("Rat: A Biology",false);
    myBooks.put("TimeIn",true);
    myBooks.put("3D Food Printing",false);
    
    //creates a new library object called myLibrary
    Library myLibrary = new Library();
    //calls the checkbookstatus method on my library using the mybooks object as its parameter.
    myLibrary.checkBookStatus(myBooks);
  }
  
}