package numberbaseball;

import java.util.ArrayList;
import java.util.List;

public class Ball {
    int position;
    int number;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }


    Enum<BallStatus> matchStatus(Ball userBall) {

        if (position == userBall.position) {
            if (number == userBall.number) {
                return BallStatus.STRIKE;
            }
        } else if (number == userBall.number) {
            return BallStatus.BALL;
        }
            return BallStatus.NOTHING;
    }



}
