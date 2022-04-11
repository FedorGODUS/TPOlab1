import function.ArctgTaylorSeries;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1 {
    @ParameterizedTest
    @ValueSource(doubles = {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY})
    void ifArgIsNotFunctionScopeThanReturnCorrectResponse(double x) {
        assertEquals(Double.NaN, ArctgTaylorSeries.arctg(x));
    }

    @ParameterizedTest
    @CsvSource({"0.7854, 1",
            "-0.7854, -1",
            "0.7137, 0.8660",
            "-0.7137, -0.8660",
            "0.6155, 0.7071",
            "-0.6155, -0.7071",
            "0.4636, 0.5",
            "-0.4636, -0.5"})
    void trigonometricCircleTest(double y, double x) {
        assertEquals(y, ArctgTaylorSeries.arctg(x), 0.0001);
    }

    @Test
    void zeroTest() {
        assertEquals(0,ArctgTaylorSeries.arctg(0), 0.001);
    }
}
