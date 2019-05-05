package model;

import javax.persistence.*;
@Entity
@Table(name = "blogs")
public class Blog {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String content;
    private String author;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    public Blog(String name, String content, String author, Category category) {
        this.name = name;
        this.content = content;
        this.author = author;
        this.category = category;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Blog() {}

    @Override
    public String toString() {
        return String.format("Blog[id=%d, title='%s', content='%s', author='%s']", id, name, content, author);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}