package numberbaseball;

import java.util.List;

public class Balls {
    List<Ball> values;

        BallStatus matchStatus(Ball userBall){
            for (Ball ball : values) {
                ball.matchStatus(userBall);

            }
            return BallStatus.NOTHING;
    }
}

