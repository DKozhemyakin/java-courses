import org.junit.Test;

//import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by damon on 28.04.2017.
 */
public class CalculatorTest {

    @Test
    public void calcAddTest(){
        int expected = 5;
        Calculator calc = new Calculator(1,5);
        calc.add(2,3);
        assertEquals(expected, calc.getResult());
        //assertThat(calc.getResult(), is(expected));
    }

}