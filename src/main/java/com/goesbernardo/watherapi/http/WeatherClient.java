package com.goesbernardo.watherapi.http;

import com.goesbernardo.watherapi.dto.FutebolDTO;
import com.goesbernardo.watherapi.dto.LocationDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "weatherClient", url = "https://weatherapi-com.p.rapidapi.com/")
public interface WeatherClient {


    @GetMapping( "current.json")
    LocationDTO getAllLocation(@RequestHeader(name = "X-RapidAPI-Key") String apiKey , @RequestParam(value = "q") String q);

    @GetMapping( "sports.json")
    FutebolDTO getAll(@RequestHeader(name = "X-RapidAPI-Key") String apiKey , @RequestParam(value = "q") String q);
}
