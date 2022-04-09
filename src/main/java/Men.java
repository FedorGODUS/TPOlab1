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

    public void laugh(){
        System.out.println("Громко смеётся " + count + " раз");
    }

    public void carry(Women women){
        System.out.println("Тащит "+ women.getName() + " в бар");
    }

    public void sit(){
        System.out.println("Сидит молча");
    }

    public void become(List<Element> elements){
        StringBuilder line = new StringBuilder("Превращается в");
        for (Element element: elements){
            line.append(" ").append(element);
        }
        System.out.println(line);
    }
}
