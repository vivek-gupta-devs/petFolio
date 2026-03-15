package com.infy.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.infy.enums.Gender;
import com.infy.enums.PetType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "category")
@JsonSubTypes({
        @Type(value = DomesticPetDTO.class, name = "Domestic"),
        @Type(value = WildPetDTO.class, name = "Wild")
})
public class PetDTO {

    @EqualsAndHashCode.Include
    private Long id;

    private String name;

    private Gender gender;

    private PetType type;
}
