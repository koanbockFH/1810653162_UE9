package at.ac.fhkufstein;

import at.ac.fhkufstein.Dto.WeatherDto;
import at.ac.fhkufstein.Mapper.ObjectMapperWeather;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;

public class Aufgabe_2
{
    public static void main(String[] args) throws JAXBException, IOException
    {
        ObjectMapperWeather omw = new ObjectMapperWeather();
        WeatherDto weather = omw.readJson("src/at/ac/fhkufstein/weather.json");
        JAXBContext jaxbContext = JAXBContext.newInstance(WeatherDto.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(weather, new File("src/at/ac/fhkufstein/weather.xml"));
        marshaller.marshal(weather, System.out);
    }
}
