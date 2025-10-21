package junyoung.week29;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @DisplayName("두 개 뽑아서 더하기")
    @ParameterizedTest
    @MethodSource("pickTwoAndSumProvider")
    void pickTwoAndSum(int[] numbers, int[] expected) {
        // given & when
        int[] result = solution.pickTwoAndSum(numbers);

        // then
        assertArrayEquals(expected, result);
    }

    private static Stream<Arguments> pickTwoAndSumProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 3, 4, 1}, new int[]{2, 3, 4, 5, 6, 7}),
                Arguments.of(new int[]{5, 0, 2, 7}, new int[]{2, 5, 7, 9, 12})
        );
    }
}