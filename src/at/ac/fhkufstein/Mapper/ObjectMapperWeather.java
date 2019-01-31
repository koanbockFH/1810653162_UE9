package at.ac.fhkufstein.Mapper;


import at.ac.fhkufstein.Dto.WeatherDto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectMapperWeather {
    public WeatherDto readJson(String path) throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();

        WeatherDto emp = objectMapper.readValue(new File(path), WeatherDto.class);

        return emp;
    }
}
