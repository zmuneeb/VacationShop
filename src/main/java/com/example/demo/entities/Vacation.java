package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "vacations")
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_id")
    private Long id;

    @Column(name = "vacation_title")
    private String vacation_title;

    @Column(name = "description")
    private String description;

    @Column(name = "travel_fare_price")
    private double travel_price;

    @Column(name = "image_url")
    private String image_URL;

    @OneToMany(mappedBy = "vacation")
    private Set<Excursion> excursions;
}