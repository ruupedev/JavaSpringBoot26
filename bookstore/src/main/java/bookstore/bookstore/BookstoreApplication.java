package bookstore.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import bookstore.bookstore.domain.AppUser;
import bookstore.bookstore.domain.AppUserRepository;
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
	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository repository2,
			AppUserRepository AppUserRepository) {
		return (args) -> {

			Category horror = new Category("Horror");
			Category mystery = new Category("Mystery");
			Category thriller = new Category("Thriller");
			repository2.save(horror);
			repository2.save(mystery);
			repository2.save(thriller);

			repository.save(new Book("A Farewell to Arms", "Ernest Hemingway", 1929, "1232323-21", 12.00, mystery));
			repository.save(new Book("Animal Farm", "George Orwell", 1945, "2212343-5", 9.00, horror));

			// Create users: admin/admin user/user
			AppUser user1 = new AppUser("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			AppUser user2 = new AppUser("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C",
					"ADMIN");
			AppUserRepository.save(user1);
			AppUserRepository.save(user2);
		};
	}

}
