package se.lexicon.model;


import java.time.LocalDate;
import java.util.Locale;
import java.util.UUID;

public class Book {
    // field
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;
    // constractor

   public Book(String title, String author, Person borrower) {
        setTitle(title);
        setAuthor(author);
        this.borrower = borrower;
        setId(id);
        this.available = true;

    }



    public Book(String title, String author) {
        // this.title=title;
        // this.author=author;
        setTitle(title);
        setAuthor(author);
        setId(id);
        this.available = true;
    }

    // method
    public void setTitle(String title) {

        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException(" no title");
        }
        this.title = title;

    }

    public void setId(String id) {
        this.id = UUID.randomUUID().toString().substring(0,7).toUpperCase();
    }

    public void setAuthor(String author) {

        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException(" no Auther");
        }
        this.author = author;
    }
    public String getTitle() {
        return this.title;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void setBorrower(Person borrower) {
        if (borrower == null) throw new IllegalArgumentException("Borrower should not be null");

        this.borrower = borrower;

    }


    public String getAuthor() {
        return author;
    }

    public String getId() {
        return id;
    }

    public boolean getAvailable() {
        return available;
    }



    public String getBookInfo() {
        String info= "Book inrformation " + "id =" + id + ", title= " + title + ", Author= " + author + ", Available= " + available ;
        return info;
      /*  if (borrower != null)
            return "Borrower Name" + borrower.getFirstName();

    else {
        return "Borrower is null ";
    }*/

    }



   /*public void setBorrower(Person borrower) {
       if (borrower != null) this.available = false;

       this.borrower = borrower;
   }*/

    public Person getBorrower() {
        return this. borrower;
    }
}




   //::::::::::::::::::::::::::::::::::::::::::::::::.


