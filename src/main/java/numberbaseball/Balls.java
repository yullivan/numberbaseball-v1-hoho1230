package numberbaseball;

import java.awt.*;
import java.util.List;
import java.util.Objects;

public class Balls {
    //private Ball ball;
    private List<Ball> balls;

    BallStatus matchStatus(Ball userBall) {
        for (Ball ball : balls) {
            BallStatus result = ball.matchStatus(userBall);
              if(result==BallStatus.STRIKE){
                  return result;
              }else if(result==BallStatus.BALL){
                  return result;
              }
        }
        return BallStatus.NOTHING;
    }
    public Balls(List<Ball> balls) {
        this.balls = balls;
    }
}

