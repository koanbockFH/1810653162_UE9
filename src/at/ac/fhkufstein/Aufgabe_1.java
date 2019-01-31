package at.ac.fhkufstein;

import java.io.IOException;
import at.ac.fhkufstein.Mapper.ObjectMapperWeather;

public class Aufgabe_1 {

    public static void main(String[] args)
    {
	    try
        {
            //neues Objekt objektmapper und ausführen der readJson methode
            ObjectMapperWeather omw = new ObjectMapperWeather();
            System.out.println(omw.readJson("src/at/ac/fhkufstein/weather.json"));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
