package com.goesbernardo.watherapi.service;

import com.goesbernardo.watherapi.dto.FutebolDTO;
import com.goesbernardo.watherapi.dto.LocationDTO;
import com.goesbernardo.watherapi.http.WeatherClient;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private WeatherClient client;

    public LocationDTO getAllWhearerService(String apiKey, String q) throws FeignException {

        return client.getAllLocation(apiKey,q);
    }

    public FutebolDTO getAllInformationFutebolService(String apiKey, String q) throws FeignException {

        return client.getAll(apiKey,q);

    }
}
