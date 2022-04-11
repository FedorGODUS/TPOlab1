import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test3 {
    static Men men = new Men();
    static Women women = new Women();
    static List<Element> elements = new ArrayList<>();
    Element element1 = new Element("водород");
    Element element2 = new Element("озон");
    Element element3 = new Element("оксид углерода");

    @BeforeClass
    public static void setup(){
        women.setName("Женщина");
        men.setName("Мужчина");
    }

    @Test
    public void test1(){
        Assert.assertEquals(men.sit(), "Мужчина сидит молча");
    }

    @Test
    public void test2(){
        Assert.assertEquals(women.sit(), "Женщина сидит молча");
        Assert.assertEquals(women.getPlace(), Place.STREET);
    }

    @Test
    public void test3(){
        Assert.assertEquals(men.carry(women), "Мужчина тащит Женщина в бар");
        Assert.assertEquals(women.getPlace(), Place.BAR);
    }

    @Test
    public void test4(){
        Assert.assertEquals(women.hate(men), "Женщина ненавидит Мужчина");
    }

    @Test
    public void test5(){
        Assert.assertEquals(women.beHappy(), "Женщина радуется");
    }

    @Test
    public void test6(){
        elements.add(element1);
        elements.add(element2);
        elements.add(element3);
        Assert.assertEquals(men.become(elements), "Мужчина превращается в водород озон оксид углерода");
    }

    @Test
    public void test7(){
        assertThrows(NullPointerException.class, ()-> {
            women.become(null);
        });
    }
}
