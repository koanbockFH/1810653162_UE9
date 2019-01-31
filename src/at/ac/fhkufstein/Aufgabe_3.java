package at.ac.fhkufstein;

import at.ac.fhkufstein.Dto.WeatherDto;
import at.ac.fhkufstein.Mapper.ObjectMapperWeather;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Aufgabe_3
{
    public static void main(String[] args) throws JAXBException
    {
        File file = new File("src/at/ac/fhkufstein/weather.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(WeatherDto.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        WeatherDto weather = (WeatherDto)unmarshaller.unmarshal(file);
        System.out.println(weather);

        ObjectMapperWeather om = new ObjectMapperWeather();
        om.writeJson(weather);
    }
}
