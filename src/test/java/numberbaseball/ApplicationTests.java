package numberbaseball;

import org.junit.jupiter.api.Test;

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


       // System.out.println(balls);
        //when

        //then
        assertThat(balls.matchStatus1(userBall1)).isEqualTo(BallStatus.STRIKE);
        assertThat(balls.matchStatus1(userBall2)).isEqualTo(BallStatus.BALL);
        assertThat(balls.matchStatus1(userBall3)).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void name3() {
        //given
        Balls balls= new Balls(List.of(new Ball(1, 1),
                new Ball(2, 2),new Ball(3, 3)));

        Balls userBalls1= new Balls(List.of(new Ball(1, 1),
                new Ball(2, 2),new Ball(3, 3)));
        Balls userBalls2= new Balls(List.of(new Ball(1, 3),
                new Ball(2, 2),new Ball(3, 1)));
        Balls userBalls3= new Balls(List.of(new Ball(1, 3),
                new Ball(2, 9),new Ball(3, 1)));
        Balls userBalls4= new Balls(List.of(new Ball(1, 4),
                new Ball(2, 5),new Ball(3, 6)));
        //when

        //then
       // System.out.println(balls.matchStatus2(userBalls2));

        assertThat(balls.matchStatus2(userBalls1)).isEqualTo(new GameResult(3,0));
        assertThat(balls.matchStatus2(userBalls2)).isEqualTo(new GameResult(1,2));
        assertThat(balls.matchStatus2(userBalls3)).isEqualTo(new GameResult(0,2));
        assertThat(balls.matchStatus2(userBalls4)).isEqualTo(new GameResult(0,0));

    }
}
