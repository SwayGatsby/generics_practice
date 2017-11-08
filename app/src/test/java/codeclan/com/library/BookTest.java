package codeclan.com.library;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 08/11/2017.
 */

public class BookTest {

    Book book;

    @Test
    public void canGetBookId(){
    book = new Book(3001, "Title", "Author");
        assertEquals(3001, book.getId());
    }


}
