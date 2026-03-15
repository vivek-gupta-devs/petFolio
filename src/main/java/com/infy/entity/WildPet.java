package com.infy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Table(name="wild_pet")
@Entity
public class WildPet extends Pet{

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dob;
}
