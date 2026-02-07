package bookstore.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookstore.bookstore.domain.Book;
import bookstore.bookstore.domain.BookRepository;
import bookstore.bookstore.domain.Category;
import bookstore.bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository repository2) {
		return (args) -> {

			Category horror = new Category("Horror");
			Category mystery = new Category("Mystery");
			Category thriller = new Category("Thriller");
			repository2.save(horror);
			repository2.save(mystery);
			repository2.save(thriller);

			repository.save(new Book("A Farewell to Arms", "Ernest Hemingway", 1929, "1232323-21", 12.00, mystery));
			repository.save(new Book("Animal Farm", "George Orwell", 1945, "2212343-5", 9.00, horror));

		};
	}

}
