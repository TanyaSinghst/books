package main;
import java.util.*;
import java.lang.String;

public class Bstore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        if (n == 0) {
            System.out.println("N/A");
        } else {
            for (int i = 0; i < n; i++) {
                String bookname = sc.nextLine().trim();
                String authorname = sc.nextLine().trim();
                long isbn = sc.nextLong();

                book b = new book(bookname, authorname, isbn);

                System.out.println(b);
            }
        }
    }
}
class book {
    private String bookname;
    private String authorname;

    private long isbn;

    public String getBookname() {
        return bookname;
    }

    public String getAuthorname() {
        return authorname;
    }


    public long getIsbn() {
        return isbn;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }


    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public book(String bookname, String authorname, long isbn) {
        this.bookname = bookname;
        this.authorname = authorname;
        this.isbn = isbn;
    }
    public String toString() {

            return  ("book name:\t"+getBookname()+ "\nauhtor name:\t"+getAuthorname()+"\nisbn:\t"+ getIsbn());

    }
}


