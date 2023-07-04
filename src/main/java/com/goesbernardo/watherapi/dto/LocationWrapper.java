package com.goesbernardo.watherapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class LocationWrapper {

    private String name;
    private String region;
    private String country;
    private double lat;
    private double lon;
    private String tz_id;
    private Integer localtime_epoch;
    private String localtime;





}
