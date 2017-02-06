public class Book {

    private String author;
    private int cost;

    public Book(String author, int cost)
    {
        this.author = author;
        this.cost = cost;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

public class BookAdapter {

    private Book book;

    public BookAdapter(Book book)
    {
        this.book = book;
    }

    public String getCostAndAuthorForNewOrder()
    {
        return this.getBook().getAuthor() + "'s book costs " + Integer.toString(this.getBook().getCost());
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

public class OrderOld {

    private String emailForInvoice;
    private Book book;

    public OrderOld(Book book, String emailForInvoice)
    {
        this.book = book;
        this.emailForInvoice = emailForInvoice;
    }

    public void sendInvoice()
    {
        // email to this.emailForInvoice
        // here, the old order process needed to be able to access
        // the properties author and cost seperately in
        // order to properly fulfill the invoice
    }

    public void setEmailForInvoice(String emailForInvoice) {
        this.emailForInvoice = emailForInvoice;
    }

    public String getEmailForInvoice() {
        return emailForInvoice;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}

public class OrderNew {

    private String emailForInvoice;
    private BookAdapter book;

    public OrderNew(BookAdapter book, String emailForInvoice)
    {
        this.book = book;
        this.emailForInvoice = emailForInvoice;
    }

    public void sendInvoice()
    {
        // email to this.emailForInvoice
        // here, the new order procecss requires
        // that the cost and author are accessible
        // in a single string format.
        // Instead of breaking the sOlid priniciple
        // and modifying the base class 'Book', we
        // wrap its current functionality in
        // 'BookAdapter'.
    }

    public void setEmailForInvoice(String emailForInvoice) {
        this.emailForInvoice = emailForInvoice;
    }

    public String getEmailForInvoice() {
        return emailForInvoice;
    }

    public BookAdapter getBook() {
        return this.book;
    }

    public void setBook(BookAdapter book) {
        this.book = book;
    }
}
/**
 * Created by david on 06/02/2017.
 * Why do we need an adapter?
 * Generally, this is perfect
 * for occasions for  utilising
 * a lot of old functionality
 * without modifying the class, and
 * using these methods to make
 * the class compatible with an object
 * expecting class type of 'x' with
 * defined functionality. This also conforms to
 * DRY and SOLID principles (Open to Ext.
 * Close to Mod.)
 */
