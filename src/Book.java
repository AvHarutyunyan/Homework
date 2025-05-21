/**
 * Ստեղծիր երկու կլաս՝ Author և Book, որտեղ ամեն գրք ունի հեղինակի ինֆորմացիա։
 * <p>
 * 🔧 Պահանջներ՝
 * <p>
 * Author դասը պետք է ունենա անուն։
 * <p>
 * Book դասը պետք է ունենա վերնագիր և Author դաշտ։
 * <p>
 * Ստեղծիր main մեթոդում գիրք ու հեղինակ, կապիր։
 */
public class Book {
    String bookText;

    Book(String bookText) {
        this.bookText = bookText;
    }
}

class Author {
    String person;

    Author(String person){
        this.person = person;
    }

    void author(Book book) {
        System.out.println("The " + person + " Is reading a book " + book.bookText);
    }

    public static void main(String[] args) {
        Book book = new Book("Java");
        Author author = new Author("Drug");
        author.author(book);
    }
}

