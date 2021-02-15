public class Book {
    private String name_book;
    private Author author;
    private int publishing_year;
    private int number_of_copies_in_libery;
    private int number_of_sales;
    private boolean multi_sales;

    public Book(String name_book, Author author, int publishing_year, int number_of_copies_in_libery, int number_of_sales, boolean multi_sales) {
        this.name_book = name_book;
        this.author = author;
        this.publishing_year = publishing_year;
        this.number_of_copies_in_libery = number_of_copies_in_libery;
        this.number_of_sales = number_of_sales;
        this.multi_sales = multi_sales;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublishing_year() {
        return publishing_year;
    }

    public void setPublishing_year(int publishing_year) {
        this.publishing_year = publishing_year;
    }

    public int getNumber_of_copies_in_libery() {
        return number_of_copies_in_libery;
    }

    public void setNumber_of_copies(int number_of_copies_in_libery) {
        this.number_of_copies_in_libery = number_of_copies_in_libery;
    }

    public int getNumber_of_sales_in_libery() {
        return number_of_sales;
    }

    public void setNumber_of_sales_in_libery(int number_of_sales) {
        this.number_of_sales = number_of_sales;
    }

    public boolean isMulti_sales() {
        return multi_sales;
    }

    public boolean setMulti_sales(boolean multi_sales) {
        if (number_of_sales >= 30 && number_of_copies_in_libery >= 45) {
            System.out.println("the book is multi sales");
            return true;
        } else {
            System.out.println("the book is no multi sales");
            return false;
        }
    }
}
