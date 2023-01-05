package com.springboot.practice.basicpost.SpringBoot.Blog.Post.Basic.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(
        name = "basic", uniqueConstraints = {@UniqueConstraint(columnNames = ("title"))}
)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name = "title",insertable = true)
    private  String title;

    @Column(name = "content", insertable = true)
    private String content;
}
