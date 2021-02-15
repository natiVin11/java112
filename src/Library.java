public class Library {
    private Book[] Bbooks;
    private Client[] clint;
    private int pos;

    public Library(Book[] bbooks, Client[] clint, int pos) {
        Bbooks = bbooks;
        this.clint = clint;
        this.pos = pos;
    }

    public Book[] getBbooks() {
        return Bbooks;
    }

    public void setBbooks(Book[] bbooks) {
        for (int i = 0; i < bbooks.length; i++) {
            bbooks[i]=
        }

            Bbooks = bbooks;
    }

    public Client[] getClint() {
        return clint;
    }

    public void setClint(Client[] clint) {
        this.clint = clint;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}