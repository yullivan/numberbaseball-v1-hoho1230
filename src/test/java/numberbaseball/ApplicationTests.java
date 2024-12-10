package numberbaseball;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTests {

    @Test
    void name1() {
        //given
        Ball ball1 = new Ball(1, 3);
        Ball ball2 = new Ball(1, 7);
        Ball ball3 = new Ball(1, 9);
        Ball userBall1 = new Ball(1, 3);
        Ball userBall2 = new Ball(2, 7);
        Ball userBall3 = new Ball(2, 2);


        //when

        //then
        assertThat(ball1.matchStatus(userBall1)).isEqualTo(BallStatus.STRIKE);
        assertThat(ball2.matchStatus(userBall2)).isEqualTo(BallStatus.BALL);
        assertThat(ball3.matchStatus(userBall3)).isEqualTo(BallStatus.NOTHING);


    }

    @Test
    void name2() {
        //give

        Ball userBall1 = new Ball(1, 1);
        Ball userBall2 = new Ball(3, 1);
        Ball userBall3 = new Ball(3, 9);

        Balls balls = new Balls(List.of(new Ball(1, 1),
                new Ball(1, 2),new Ball(1, 3)));


        System.out.println(balls);
        //when

        //then
        assertThat(balls.matchStatus(userBall1)).isEqualTo(BallStatus.STRIKE);
        assertThat(balls.matchStatus(userBall2)).isEqualTo(BallStatus.BALL);
        assertThat(balls.matchStatus(userBall3)).isEqualTo(BallStatus.NOTHING);
    }
}
