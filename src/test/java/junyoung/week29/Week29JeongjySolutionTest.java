package junyoung.week29;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Week29JeongjySolutionTest {

    Week29JeongjySolution solution = new Week29JeongjySolution();

    @DisplayName("예산")
    @ParameterizedTest
    @MethodSource("budgetProvider")
    void budget(int[] d, int budget, int expected) {
        // given & when
        int result = solution.budget(d, budget);

        // then
        assertEquals(expected, result);
    }

    private static Stream<Arguments> budgetProvider() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 2, 5, 4}, 9, 3),
                Arguments.of(new int[]{2, 2, 3, 3}, 10, 4)
        );
    }


}