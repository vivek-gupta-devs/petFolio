package com.infy.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OwnerDTO {

    private Long id;

    private String firstName;

    private String lastName;

    private String gender;

    private String city;

    private String state;

    @EqualsAndHashCode.Include
    private String mobileNumber;

    @EqualsAndHashCode.Include
    private String emailId;

    private PetDTO pet;
}
