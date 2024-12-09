import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class codingTest {

    int solution(int n) {

        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }

        return n;
    }

    @Test
    void 나머지가_1이되는수_찾기() {
        //10/1 몫:10 ,나머지:0
        //10/2 몫:5, 나머지 0
        //10/3 몫:3, 나머지 1

        int 결과1 = solution(10);
        assertThat(결과1).isEqualTo(3);

        int 결과2 = solution(12);
        assertThat(결과2).isEqualTo(11);

    }
    String solution1(String[] participant, String[] completion) {

        String[] result =Stream.concat(Arrays.stream(participant),Arrays.stream(completion))
                .distinct()
                .toArray(String[]::new);


        return Arrays.toString(result);

    }


}
