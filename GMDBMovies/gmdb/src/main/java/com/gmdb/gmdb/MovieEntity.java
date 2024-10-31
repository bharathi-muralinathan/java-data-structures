package com.gmdb.gmdb;

import lombok.*;
import org.apache.catalina.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode
@ToString
@Getter
@Setter
@Entity
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String director;
    private String actors;
    private String releaseYear;
    private String description;
    private Double starRating;

   // @OneToOne(cascade = CascadeType.ALL)
   // private UserReviewEntity userReview;

    public MovieEntity(String title, String director, String actors, String releaseYear, String description, Double starRating) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.releaseYear = releaseYear;
        this.description = description;
        this.starRating = starRating;
      //  this.userReview = new UserReviewEntity();
    }

    public MovieEntity(Long id, String title, String director, String actors, String releaseYear, String description, Double starRating) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.releaseYear = releaseYear;
        this.description = description;
        this.starRating = starRating;
    }

    public MovieEntity(MovieEntity movie){
        this.title = movie.title;
        this.director = movie.director;
        this.actors = movie.actors;
        this.releaseYear = movie.releaseYear;
        this.description = movie.description;
        this.starRating = movie.starRating;
       // this.userReview = movie.getUserReview();
    }

    public MovieEntity() {
    }
}
