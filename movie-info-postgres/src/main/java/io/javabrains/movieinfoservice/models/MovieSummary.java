package io.javabrains.movieinfoservice.models;



import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MovieSummary {

    @Id
    private String id;
    private String title;
    private String overview;
}
