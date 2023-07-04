package com.goesbernardo.watherapi.dto;

import lombok.Data;

@Data
public class CurrentWrapper {

    private Integer last_updated_epoch;
    private String last_updated;
    private Integer temp_c;
    private Integer temp_f;
    private Integer is_day;




}
