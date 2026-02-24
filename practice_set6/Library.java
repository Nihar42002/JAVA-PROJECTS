package practice_set6;

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

public class Library {

    private int available;
    void availableBooks(int available){
        this.available = available;
    }
    
    void issueBook(int count) throws BookNotAvailableException {
        try{
           if(count < available){
            available -= count;
        }
        else{
            throw new BookNotAvailableException("Requested number of books not available. Issue denied.");  
        }
    }
        catch(BookNotAvailableException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Current available books: " + available);
            System.out.println("------------------------------");
        }
    } 

    public static void main(String[] args) throws BookNotAvailableException{

        Library library = new Library();
        library.availableBooks(3);
        System.out.println("Initial available books: " + library.available);
        System.out.println("------------------------------");

        library.issueBook(2);
        library.issueBook(2);
    }
}
