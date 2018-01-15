package com.xiaopotian.demo.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by zoulu on 2018-01-15.
 */
@Entity
@Table(name = "book")
public class Book implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false, unique = true)
    private String title;

    public Book(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
