import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    private static Main conversion = new Main();

    @Test
    void ToFahrenheit(){
        double fahrenheit = conversion.convertToFahrenheit(30);
        assertEquals((9/5.0 * 30) + 32, fahrenheit);
        //assertEquals(50, fahrenheit);
    }

    @Test
    void ToCelsius(){
        double celsius = conversion.convertToCelsius(100);
        assertEquals((100-32) * 5/9d, celsius);
        //assertEquals(50, celsius);
    }

}
