package codeclan.com.library;

import java.util.ArrayList;

/**
 * Created by user on 08/11/2017.
// */
//
public class Borrower<T> {
    private int id;
    private String name;
    private ArrayList<T> borrowedItems;

    public Borrower(int id, String name, ArrayList<T>){
        this.id = id;
        this.name = name;
        this.borrowedItems = new ArrayList<T>();
    }


}
