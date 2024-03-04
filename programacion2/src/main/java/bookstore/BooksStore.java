
package bookstore;
import book.Book;
/**
 *
 * @author SCIS2PC25
 */
public class BooksStore {
    public static void main(){
        Book book1 = new Book("Harry Potter",5,25,"Fantasía");
        Book book2 = new Book("El nombre del viento", 1, 28, "Fantasía");
        //Presto el libro
        book1.lendBook();
        System.out.println(book1.isAvailable());
        
    }
        
}
