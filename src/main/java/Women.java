import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class Women {
    private String name;

    public void sit() {
        System.out.println(name + " сидит молча");
    }

    public void hate(Men men) {
        System.out.println(name + " ненавидит " + men.getName());
    }

    public void become(List<Element> elements) {
        StringBuilder line = new StringBuilder(name + " превращается в");
        for (Element element : elements) {
            line.append(" ").append(element.getName());
        }
        System.out.println(line);
    }

    public void beHappy() {
        System.out.println(name + " радуется");
    }
}
