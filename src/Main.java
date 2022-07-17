import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Author> authorList = List.of(
                new Author("Автор Виталий", List.of(
                        new Book("Ромашка", 71.5, List.of(
                                new Otziv("Толя", "Толе понравилось", 8.3),
                                new Otziv("Лера", "Лере не понравилось", 2.3))
                        ),
                        new Book("Василёк", 43.3, List.of(
                                new Otziv("Оля", "Оле понравилось", 7.2),
                                new Otziv("Вера", "Вере не понравилось", 3.4)
                        )))),
                new Author("Автор Денис", List.of(
                        new Book("Роза", 45.6, List.of(
                                new Otziv("Толя", "Толе понравилось", 9.1),
                                new Otziv("Лера", "Лере не понравилось", 4.2))
                        ),
                        new Book("Маргаритка", 43.3, List.of(
                                new Otziv("Валя", "Вале понравилось", 7.2),
                                new Otziv("Сара", "Саре не понравилось", 4.1)
                        )))),
                new Author("Автор Семён", List.of(
                        new Book("Сыр", 15.7, List.of(
                                new Otziv("Коля", "Коле понравилось", 9.0),
                                new Otziv("Вениамин", "Вениамину не понравилось", 1.3))
                        ),
                        new Book("Сосиски", 99.9, List.of(
                                new Otziv("Бот#666", "Бот#666 понравилось", 8.2),
                                new Otziv("Штырь", "Штырю не понравилось", 2.4)
                        ))))
        );

        System.out.println("получить имена всех авторов");
        authorList
                .stream()
                .forEach(n -> System.out.println(n.authorName));

        System.out.println("Получить имена книг дешевле N: ");
        double N = 50;
//        authorList
//                .stream()
//                .forEach(n-> {
//                    for (Book book : n.listBook) {
//                        if (book.price < N)
//                        {
//                            System.out.println("-" + book.nameBook);
//                        }
//                    }
//                });
        var price = authorList
                .stream()
                .map(
                    n-> n.listBook
                            .stream()
                            .filter(book -> book.price < N)
                            .forEach(book -> System.out.println((String) book.nameBook)
                            ))
                .collect(Collectors.toList());
                ;

        System.out.println(price);

        System.out.println("Получить имена всех комментаторов в алфавитном порядке");

        System.out.println("получить случайный комментарий");

        System.out.println("получить мапу<рейтинг, лист<текст>>");


//Сложные*
        System.out.println("получить мапу<имя автора, лист<имя книги>>");

        System.out.println("получить мапу<имя книги, средний рейтинг>");




        ;


    }
}