import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Data
public class Men {
    private String name;
    private static int count = 1;

    public void laugh() {
        System.out.println(name + " громко смеётся " + count + " раз");
        count++;
    }

    public void carry(Women women) {
        System.out.println(name + " тащит " + women.getName() + " в бар");
    }

    public void sit() {
        System.out.println(name + " сидит молча");
    }

    public void become(List<Element> elements) {
        StringBuilder line = new StringBuilder(name + " превращается в");
        for (Element element : elements) {
            line.append(" ").append(element.getName());
        }
        System.out.println(line);
    }
}
