import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class Men {
    private String name;
    private static int count = 1;

    public String laugh() {
        count++;
        return (name + " громко смеётся " + count + " раз");
    }

    public String  carry(Women women) {
        women.setPlace(Place.BAR);
        return (name + " тащит " + women.getName() + " в бар");
    }

    public String sit() {
        return (name + " сидит молча");
    }

    public String  become(List<Element> elements) {
        StringBuilder line = new StringBuilder(name + " превращается в");
        for (Element element : elements) {
            line.append(" ").append(element.getName());
        }
        return (line.toString());
    }
}
