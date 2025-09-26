package yujin.week26;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Week26SolutionTest {
    private final Week26Solution solution = new Week26Solution();

    @DisplayName("이진 변환 반복하기")
    @ParameterizedTest
    @MethodSource("convertBinaryTestCases")
    void convertBinary(String s, int[] expected) {
        assertThat(solution.convertBinary(s)).isEqualTo(expected);
    }

    static Stream<Arguments> convertBinaryTestCases() {
        return Stream.of(
                Arguments.of("110010101001", new int[]{3, 8}),
                Arguments.of("01110", new int[]{3, 3}),
                Arguments.of("1111111", new int[]{4, 1})
        );
    }

    @DisplayName("피보나치 수")
    @ParameterizedTest
    @CsvSource({
            "3, 2",
            "5, 5"
    })
    void fibonacciSeries(int n, int expected) {
        assertThat(solution.fibonacciSeries(n)).isEqualTo(expected);
    }
}