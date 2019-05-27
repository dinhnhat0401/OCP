import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Book {
    String title;
    String author;
    double price;
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String toString() {
        return "{" + title + "," + author + "," + price + "}";
    }
}

public class GroupingBy {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book ("Head First Java", "Kathy Sierra", 24.5),
                new Book ("OCP", "Udayan Khattry", 20.99),
                new Book ("OCA", "Udayan Khattry", 14.99));
        books.stream().collect(Collectors.groupingBy(Book::getAuthor))
                .forEach((a,b) -> System.out.println(a));
    }
}

