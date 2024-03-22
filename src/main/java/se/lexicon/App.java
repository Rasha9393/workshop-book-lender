package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        // Create a book instance
        Book book=new Book("joun in lebanon","joni123");

        // Display book information
        String dpbook=book.getBookInfo();
        System.out.println("dpBook"+dpbook);

        // Create a person instance
        Person person= new Person("rasha","aldarwish");

        // Display person information
        String dpPerson =person.getpersoninformaition();
        System.out.println("desplayPerson "+dpPerson);

        // Loan a book to the person
        person.loanBook(book);

        // Display person information after borrowing a book
        String dppersonloan= person.getpersoninformaition();
        System.out.println("desplaypersonloan"+dppersonloan);

        // Display book information after borrowing a book
        String dpbookloan =book.getBookInfo();
        System.out.println("desplayBookloan"+dpbookloan);

        // Return the borrowed book
        person.returnBook(book);

        // Display person information after returning the book
        String dppersonreture=person.getpersoninformaition();
        System.out.println("dasplay person reture book"+dppersonreture);

        // Display book information after borrowing a book
        String dpbookreture=book.getBookInfo();
        System.out.println("desplay book reture"+dpbookreture);

    }

}
