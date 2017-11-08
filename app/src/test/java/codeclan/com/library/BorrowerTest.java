package codeclan.com.library;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by user on 08/11/2017.
 */

public class BorrowerTest {

    Borrower borrower;
    Book book;
    ArrayList books;




    @Test
    public void canGetBorrowedItems() {
        book = new Book(3001, "Title", "Author");
        books = new ArrayList<Book>;
        books.add(book);
        borrower = new Borrower(40, "Bob", books);

    }
}
