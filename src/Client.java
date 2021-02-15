public class Client extends Person {
    private Book[] list_of_borrowed_books;
    private int max_questions;
    private boolean subscription_is_valid;
    private int year_of_mass_issuance;
    private int pos=0;

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public Client(String name, String lastName , int max_questions, boolean subscription_is_valid, int year_of_mass_issuance) {
        super(name, lastName);
        this.list_of_borrowed_books = new Book[pos];
        this.max_questions = max_questions;
        this.subscription_is_valid = subscription_is_valid;
        this.year_of_mass_issuance = year_of_mass_issuance;
    }

    public Book[] getList_of_borrowed_books() {
        return list_of_borrowed_books;
    }

    public void setList_of_borrowed_books(Book[] list_of_borrowed_books) {

        this.list_of_borrowed_books = list_of_borrowed_books;
    }

    public int getMax_questions() {
        return max_questions;
    }

    public void setMax_questions(int max_questions) {
        max_questions = 10;
        this.max_questions = max_questions;
    }

    public boolean isSubscription_is_valid() {
        return subscription_is_valid;
    }

    public boolean setSubscription_is_valid(boolean subscription_is_valid) {
        int year_of_validty = year_of_mass_issuance+1;
        if (year_of_validty >= 2021){
            return true;
        }
        else{
            return false;
        }
    }

    public int getYear_of_mass_issuance() {
        return year_of_mass_issuance;
    }

    public void setYear_of_mass_issuance(int year_of_mass_issuance) {
        this.year_of_mass_issuance = year_of_mass_issuance;
    }



    public boolean burBook(Book book) {
        if (!(subscription_is_valid == true)) {
            return false;
        }
        if (max_questions <= 0) {
            return false;
        }
        if (book.getNumber_of_copies_in_libery() < 1)
            return false;
        for (int i = 0; i < list_of_borrowed_books.length; i++) {
            list_of_borrowed_books[i] = book;
            this.setPos(i++);
            book.setNumber_of_copies(book.getNumber_of_copies_in_libery()-1);

        }
        return true;
    }
public void ahzara(Book book){
    for (int i = 0; i < list_of_borrowed_books.length; i++) {
       if(list_of_borrowed_books[i].getName_book()==book.getName_book()){

           for (int j=i;j< list_of_borrowed_books.length;j++)
               list_of_borrowed_books[j]=list_of_borrowed_books[j+1];


           this.setPos(getPos()-1);
           book.setNumber_of_copies(book.getNumber_of_copies_in_libery()+1);

       }
       }
    }

}