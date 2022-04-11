import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Men men = new Men();
        men.setName("Мужчина");
        Women women = new Women();
        women.setName("Женщина");
        Element element1 = new Element("водород");
        Element element2 = new Element("озон");
        Element element3 = new Element("оксид углерода");
        List<Element> elements = new ArrayList<>();
        elements.add(element1);
        elements.add(element2);
        elements.add(element3);

        System.out.println(men.sit());
        System.out.println(women.sit());

        System.out.println(men.carry(women));
        System.out.println(women.hate(men));

        System.out.println(women.beHappy());
        System.out.println(men.become(elements));

        System.out.println(women.become(new ArrayList<>()));
    }
}
