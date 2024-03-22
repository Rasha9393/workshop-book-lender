package se.lexicon.model;

import java.util.Arrays;
import java.util.UUID;

public class Person {
    private int squescer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private Book book;
    private Book[] booksBorrowed;


    // constractor


    public Person(String firstName, String lastName) {
        // setId();
        setFirstName(firstName);
        setLastName(lastName);

        this.booksBorrowed =new Book[0];
    }


    public void setSquescer(int squescer) {
        this.squescer = squescer;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getSquescer() {
        return squescer;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public String getpersoninformaition() {

        String info= ("squescer:" + squescer + ",id :" + id + ",FirstName:" + firstName + ",LastName :" + lastName );
         return info;
    }
     public void loanBook(Book book){
        if (book.getAvailable()){
        booksBorrowed =  Arrays.copyOf(booksBorrowed,booksBorrowed.length +1);

        booksBorrowed[booksBorrowed.length-1]=book;
         book.setAvailable(false);
        } else {
            throw new IllegalArgumentException("Book is borrowered");
        }
     }

     public void returnBook(Book book){
        if ( !book.getAvailable()){
            Book[] tempBooksborrower=Arrays.copyOf(booksBorrowed,booksBorrowed.length);
            int i=0;
            for (Book books:booksBorrowed){
                if (!books.getTitle().equalsIgnoreCase(book.getTitle())){
                    tempBooksborrower[i]=books;
                    i++;
                }
            }
            booksBorrowed=tempBooksborrower;
        }
     }
}





