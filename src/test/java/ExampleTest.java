import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

public class ExampleTest {
    @Value("${test.value}")
    private String testValue;

    @Test
    public void test() {
        System.out.println("Hello World!");
        System.out.println(testValue);
    }
}
