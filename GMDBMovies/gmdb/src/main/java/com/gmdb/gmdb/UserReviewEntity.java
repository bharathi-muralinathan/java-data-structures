package com.gmdb.gmdb;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer starRating;
    private String review;

    //@OneToOne(cascade = CascadeType.ALL)
    //private MovieEntity movieEntity;

    public UserReviewEntity(Integer starRating, String review) {
        this.starRating = starRating;
        this.review = review;
    }
}
