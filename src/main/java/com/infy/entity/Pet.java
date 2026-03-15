package com.infy.entity;

import com.infy.enums.Gender;
import com.infy.enums.PetType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "pet")
@Entity
public abstract class Pet extends Base{

    @Column(name = "name", nullable = false)
    private String name;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "type", nullable = false)
    private PetType type;

}
