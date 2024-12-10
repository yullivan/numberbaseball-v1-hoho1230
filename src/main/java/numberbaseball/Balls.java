package numberbaseball;

import java.util.List;

public class Balls {
    //private Ball ball;
    private List<Ball> balls;

    BallStatus matchStatus1(Ball userBall) {
        for (Ball ball : balls) {
            BallStatus result = ball.matchStatus(userBall);
            if (result == BallStatus.STRIKE) {
                return result;
            } else if (result == BallStatus.BALL) {
                return result;
            }
        }
        return BallStatus.NOTHING;
    }


    GameResult matchStatus2(Balls userBalls) {
        GameResult result = new GameResult(0, 0);
        for (Ball ball : balls) {
            result.incrementCount(userBalls.matchStatus1(ball));

        }
        return result;
    }

    public Balls(List<Ball> balls) {
        this.balls = balls;
    }

    @Override
    public String toString() {
        return "Balls{" +
                "balls=" + balls +
                '}';
    }
}

