package junyoung.week26;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Week26JeongjySolutionTest {
    Week26JeongjySolution solution;

    @BeforeEach
    void init() {
        this.solution = new Week26JeongjySolution();
    }

    @DisplayName("x만큼 간격이 있는 n개의 숫자")
    @ParameterizedTest
    @MethodSource("numberIntervalProvider")
    void numberInterval(int x, int n, long[] expected) {
        // given
        Week26JeongjySolution solution = new Week26JeongjySolution();

        // when
        long[] actual = solution.numberInterval(x, n);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> numberIntervalProvider() {
        return Stream.of(
                Arguments.of(2, 5, new long[]{2, 4, 6, 8, 10}),
                Arguments.of(4, 3, new long[]{4, 8, 12}),
                Arguments.of(-4, 2, new long[]{-4, -8})
        );
    }
}