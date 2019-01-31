package at.ac.fhkufstein;

import at.ac.fhkufstein.Dto.WeatherDto;
import at.ac.fhkufstein.Dto.WeatherDto_Aufgabe5;
import at.ac.fhkufstein.Mapper.ObjectMapperWeather;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Aufgabe_5
{
    public static void main(String[] args) throws JAXBException
    {
        File file = new File("src/at/ac/fhkufstein/weather.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(WeatherDto.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        WeatherDto weather = (WeatherDto) unmarshaller.unmarshal(file);
        System.out.println(weather);

        WeatherDto_Aufgabe5 w2 = new WeatherDto_Aufgabe5(weather.getId(), weather.getMain(), weather.getDescription()
                , weather.getIcon());
        ObjectMapperWeather om = new ObjectMapperWeather();
        om.writeJson_Aufgabe5(w2);
    }
}
