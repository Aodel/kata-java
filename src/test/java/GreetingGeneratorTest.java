import bcnfemtech.GreetingGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingGeneratorTest {

    @Test
    void laClaseGreetingGeneratorSirveParaSaludar() {
        GreetingGenerator greetingGenerator = new GreetingGenerator();

        assertEquals(greetingGenerator.hello(), "Holas!");
    }

}
