import java.util.ArrayList;
import java.util.List;

public class Author {
         String authorName;
         List<Book> listBook = new ArrayList<>();

    public Author(String authorName, List<Book> listBook) {
        this.authorName = authorName;
        this.listBook = listBook;
    }
    public String getAuthorName (){
        return authorName;
    }
}
