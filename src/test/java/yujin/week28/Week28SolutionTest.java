package yujin.week28;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Week28SolutionTest {
    private final Week28Solution solution = new Week28Solution();

    @DisplayName("2016년")
    @ParameterizedTest
    @CsvSource({"5,24,TUE"})
    void year2016(int a, int b, String expected) {
        assertThat(solution.year2016(a, b)).isEqualTo(expected);
    }

    @DisplayName("소수 만들기")
    @ParameterizedTest
    @MethodSource("makeDecimalTestCases")
    void makeDecimal(int[] nums, int expected) {
        assertThat(solution.makeDecimal(nums)).isEqualTo(expected);
    }

    static Stream<Arguments> makeDecimalTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 1),
                Arguments.of(new int[]{1, 2, 7, 6, 4}, 4)
        );
    }

    @DisplayName("소수 찾기")
    @ParameterizedTest
    @CsvSource({"10,4", "5,3"})
    void findDecimal(int n, int expected) {
        assertThat(solution.findDecimal(n)).isEqualTo(expected);
    }
}