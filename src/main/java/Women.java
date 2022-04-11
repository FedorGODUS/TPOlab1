import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class Women {
    private String name;
    private Place place;

    public String  sit() {
        place = Place.STREET;
        return (name + " сидит молча");
    }

    public String  hate(Men men) {
        return (name + " ненавидит " + men.getName());
    }

    public String  become(List<Element> elements) {
        StringBuilder line = new StringBuilder(name + " превращается в");
        for (Element element : elements) {
            line.append(" ").append(element.getName());
        }
        return (line.toString());
    }

    public String beHappy() {
        return (name + " радуется");
    }
}
