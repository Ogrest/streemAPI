import java.util.ArrayList;
import java.util.List;

public class Book {
     String nameBook;
     double price;
    List <Otziv> otzivList = new ArrayList<>();

    public Book(String nameBook, double price, List<Otziv> otzivList) {
        this.nameBook = nameBook;
        this.price = price;
        this.otzivList = otzivList;

    }


}
