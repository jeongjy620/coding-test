package yujin.week27;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Week27SolutionTest {
    Week27Solution solution = new Week27Solution();

    @DisplayName("K번째수")
    @ParameterizedTest
    @MethodSource("kThNumberTestCases")
    void kThNumber(int[] array, int[][] commands, int[] expected) {
        assertThat(solution.kThNumber(array, commands)).isEqualTo(expected);
    }

    static Stream<Arguments> kThNumberTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}, new int[]{5, 6, 3})
        );
    }

    @DisplayName("문자열 내 마음대로 정렬하기")
    @ParameterizedTest
    @MethodSource("freeSortTestCases")
    void freeSort(String[] strings, int n, String[] expected) {
        assertThat(solution.freeSort(strings, n)).isEqualTo(expected);
    }

    static Stream<Arguments> freeSortTestCases() {
        return Stream.of(
                Arguments.of(new String[]{"sun", "bed", "car"}, 1, new String[]{"car", "bed", "sun"}),
                Arguments.of(new String[]{"abce", "abcd", "cdx"}, 2, new String[]{"abcd", "abce", "cdx"})
        );
    }

    @DisplayName("로또의 최고 순위와 최저 순위")
    @ParameterizedTest
    @MethodSource("lottoScoreTestCases")
    void lottoScore(int[] lottos, int[] winNums, int[] expected)
    {
        assertThat(solution.lottoScore(lottos, winNums)).isEqualTo(expected);
    }

    static Stream<Arguments> lottoScoreTestCases() {
        return Stream.of(
                Arguments.of(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}, new int[]{3, 5}),
                Arguments.of(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25}, new int[]{1, 6}),
                Arguments.of(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35}, new int[]{1, 1})
        );
    }
}