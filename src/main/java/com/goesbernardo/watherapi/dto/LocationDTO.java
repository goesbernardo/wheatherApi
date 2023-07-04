package com.goesbernardo.watherapi.dto;

import lombok.Data;

@Data
public class LocationDTO {

    private LocationWrapper location;
    private CurrentWrapper current;


}
