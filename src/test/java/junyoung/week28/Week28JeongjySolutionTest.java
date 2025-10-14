package junyoung.week28;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class Week28JeongjySolutionTest {
    Week28JeongjySolution solution;

    @BeforeEach
    void setUp() {
        solution = new Week28JeongjySolution();
    }

    @DisplayName("숫자의 표현")
    @ParameterizedTest
    @CsvSource({
            "15, 4",
            "10, 2"
    })
    void expressionOfNumbers(int n, int expected) {
        // given & when
        int result = solution.expressionOfNumbers(n);

        // then
        assertThat(result).isEqualTo(expected);
    }
}