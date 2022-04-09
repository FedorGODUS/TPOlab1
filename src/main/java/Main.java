import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Men men = new Men();
        men.setName("Mужчина");
        Women women = new Women();
        women.setName("Женщина");
        Element element1 = new Element("водород");
        Element element2 = new Element("озон");
        Element element3 = new Element("оксид углерода");
        List<Element> elements = new ArrayList<>();
        elements.add(element1);
        elements.add(element2);
        elements.add(element3);

        men.sit();
        women.sit();

        men.carry(women);
        women.hate(men);

        women.beHappy();
        men.become(elements);

        women.become(new ArrayList<>());
    }
}
