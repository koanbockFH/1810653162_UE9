package at.ac.fhkufstein.Dto;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class WeatherDto {
    @XmlAttribute(name = "id")
    private int id;
    @XmlElement(name = "main")
    private String main;
    @XmlElement(name = "description")
    private String description;
    //@XmlElement(name = "icon") Aufgabe 4
    @XmlTransient
    private String icon;

    public WeatherDto(){}
    public WeatherDto(int id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Data:" + System.lineSeparator());

        sb.append("ID: " + getId() + System.lineSeparator());

        sb.append("Main: " + getMain()+ System.lineSeparator());

        sb.append("Descriptiong: " + getDescription()+ System.lineSeparator());

        sb.append("Icon: " + getIcon()+ System.lineSeparator());

        sb.append("_____________________________________");

        return sb.toString();

    }
}