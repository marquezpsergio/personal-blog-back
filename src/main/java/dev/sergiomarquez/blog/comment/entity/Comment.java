package dev.sergiomarquez.blog.comment.entity;

import dev.sergiomarquez.blog.post.entity.Post;
import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Entity
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String content;

    private Instant date;

    private String author;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
}
