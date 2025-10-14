package junyoung.week28;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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

    @DisplayName("땅따먹기")
    @ParameterizedTest
    @MethodSource("HopscotchProvider")
    void Hopscotch(int[][] land, int expected) {
        // given & when
        int result = solution.Hopscotch(land);

        // then
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> HopscotchProvider() {
        return Stream.of(
                Arguments.of(new int[][]{
                        {1, 2, 3, 5},
                        {5, 6, 7, 8},
                        {4, 3, 2, 1}
                }, 16),
                Arguments.of(new int[][]{
                        {1, 2, 3, 5}
                }, 5)
        );
    }
}