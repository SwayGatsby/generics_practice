package codeclan.com.library;

import java.util.ArrayList;

/**
 * Created by user on 08/11/2017.
 */

public class Book {

    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }
}

