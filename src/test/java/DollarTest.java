import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Polyakov
 * @created 07/08/2021 - 0:45
 * @project tddeducation
 */


public class DollarTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}
