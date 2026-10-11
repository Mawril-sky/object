//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Author author1 = new Author("Stiven", "Hogs");
        Author author2 = new Author("Стругацкий", "Борис");

        Book book1 = new Book("Война и мир", author1, 2025);
        Book book2 = new Book("Villa", author2, 2018);

        System.out.println("Книга 1: " + book1.getTitle() +
                ", автор: " + book1.getAuthor().getFirstName() + " " +
                book1.getAuthor().getLastName() +
                ", год: " + book1.getYearPublicationBook());

        System.out.println("Книга 2: " + book2.getTitle() +
                ", автор: " + book2.getAuthor().getFirstName() + " " +
                book2.getAuthor().getLastName() +
                ", год: " + book2.getYearPublicationBook());

        // Изменяем год публикации одной из книг с помощью сеттера
        book1.setYearPublicationBook(1870);

        // Проверим, что год обновился
        System.out.println("\nОбновлённый год для книги 1: " + book1.getYearPublicationBook());
    }
}