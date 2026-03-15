package com.infy.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@ToString(callSuper = true)
@Setter
@Getter
public class DomesticPetDTO extends PetDTO {

    private LocalDate birthDate;

}
