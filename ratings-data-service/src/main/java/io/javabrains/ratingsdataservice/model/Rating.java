package io.javabrains.ratingsdataservice.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Rating {

    private String movieId;
    private int rating;

}
