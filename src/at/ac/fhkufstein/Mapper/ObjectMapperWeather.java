package at.ac.fhkufstein.Mapper;


import at.ac.fhkufstein.Dto.WeatherDto;
import at.ac.fhkufstein.Dto.WeatherDto_Aufgabe5;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
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

    public void writeJson(WeatherDto w){
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(w);
            System.out.println("JSON String: " + jsonString);
        } catch(JsonGenerationException e){
            e.printStackTrace();
        } catch (JsonMappingException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeJson_Aufgabe5(WeatherDto_Aufgabe5 w){
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(w);
            System.out.println("JSON String: " + jsonString);
        } catch(JsonGenerationException e){
            e.printStackTrace();
        } catch (JsonMappingException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
