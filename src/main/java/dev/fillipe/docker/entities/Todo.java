package dev.fillipe.docker.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@Table(name = "users")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String title;

    @Setter
    private Boolean isCompleted;

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    public Todo(Long id, String title, Boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.isCompleted = false;
    }
}
