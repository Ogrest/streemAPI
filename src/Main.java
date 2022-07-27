import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Author> authorList = List.of(
                new Author("Автор Виталий", List.of(
                        new Book("Ромашка", 71.5, List.of(
                                new Otziv("Толя", "Толе понравилось", 1),
                                new Otziv("Лера", "Лере не понравилось", 2))
                        ),
                        new Book("Василёк", 43.3, List.of(
                                new Otziv("Оля", "Оле понравилось", 3),
                                new Otziv("Вера", "Вере не понравилось", 4)
                        )))),
                new Author("Автор Денис", List.of(
                        new Book("Роза", 45.6, List.of(
                                new Otziv("Толя", "Толе понравилось", 1),
                                new Otziv("Лера", "Лере не понравилось", 2))
                        ),
                        new Book("Маргаритка", 43.3, List.of(
                                new Otziv("Валя", "Вале понравилось", 3),
                                new Otziv("Сара", "Саре не понравилось", 4)
                        )))),
                new Author("Автор Семён", List.of(
                        new Book("Сыр", 15.7, List.of(
                                new Otziv("Коля", "Коле понравилось", 1),
                                new Otziv("Вениамин", "Вениамину не понравилось", 2))
                        ),
                        new Book("Сосиски", 99.9, List.of(
                                new Otziv("Бот#666", "Бот#666 понравилось", 3),
                                new Otziv("Штырь", "Штырю не понравилось", 4)
                        ))))
        );

        System.out.println("получить имена всех авторов");
        authorList
                .stream()
                .forEach(n -> System.out.println(n.authorName));

        System.out.println("Получить имена книг дешевле N: ");
        double N = 50;

        var price = authorList
                .stream()
                .flatMap(n -> n.listBook.stream())
                .filter(n -> n.price < N)
                .map(n -> n.nameBook)
                .collect(Collectors.toList());
        System.out.println(price);

        System.out.println("Получить имена всех комментаторов в алфавитном порядке");
        var otz = authorList
                .stream()
                .flatMap(n -> n.listBook.stream())
                .flatMap(n -> n.otzivList.stream())
                .map(n -> n.nameOtziv)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(otz);

        System.out.println("получить случайный комментарий");
        var come = authorList
                .stream()
                .flatMap(n -> n.listBook.stream())
                .flatMap(n -> n.otzivList.stream())
                .map(n -> n.text)
                .findAny();
        System.out.println(come);

//        не получилось
//        System.out.println("получить мапу<рейтинг, лист<текст>>");
//        var ogh = authorList
//                .stream()
//                .flatMap(n -> n.listBook.stream())
//                .flatMap(n -> n.otzivList.stream())
//                        .


    }}