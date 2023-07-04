package com.goesbernardo.watherapi.controller;

import com.goesbernardo.watherapi.dto.FutebolDTO;
import com.goesbernardo.watherapi.dto.LocationDTO;
import com.goesbernardo.watherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "rapidapi.com/")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("current.json")
    public ResponseEntity<LocationDTO> getAllWheater(@RequestHeader(name = "X-RapidAPI-Key") String apiKey, @RequestParam(value = "q") String q){

        LocationDTO response = weatherService.getAllWhearerService(apiKey, q);

        return ResponseEntity.ok(response);

    }

    @GetMapping("sports.json")
    public ResponseEntity<FutebolDTO> getAllInformationFutebol(@RequestHeader(name = "X-RapidAPI-Key") String apiKey, @RequestParam(value = "q") String q){

        FutebolDTO response = weatherService.getAllInformationFutebolService(apiKey, q);

        return ResponseEntity.ok(response);
    }
}
