package com.ved.hotel.HotelService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    private String id;
    @Column(unique = true)
    private String name;
    private  String location;
    private String about;
}
