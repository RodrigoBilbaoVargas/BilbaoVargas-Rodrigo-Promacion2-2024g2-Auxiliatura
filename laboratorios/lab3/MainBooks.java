package books;

public class MainBooks {
    public static void main(String[] args) {
        // Ebook
        EBook myEBook = new EBook("Digital Fortress", "Dan Brown", 1998, 2.5, "PDF");
        myEBook.displayInfo();
        
        // Printed Book
        PrintedBook myPrintedBook = new PrintedBook("The Da Vinci Code", "Dan Brown", 2003, 689, 1.5);
        myPrintedBook.displayInfo();
        
        // Audiobook
        Audiobook myAudiobook = new Audiobook("Angels and Demons", "Dan Brown", 2000, 18.5, "Richard Poe");
        myAudiobook.displayInfo();
    }
}