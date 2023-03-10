package com.movie.aws.springcloudawslambda.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private int id;
    private String name;
    private String genre;
}
