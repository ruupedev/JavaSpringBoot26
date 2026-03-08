package bookstore.bookstore.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private List<Book> books;

    public Category() {

    }

    public void setCategoryid(Long categoryid) {
        this.id = categoryid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Category(String name) {
        this.name = name;
    }

    public Long getCategoryid() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Category [categoryid=" + id + ", name=" + name + ", books=" + books + "]";
    }

}
