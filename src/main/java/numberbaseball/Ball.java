package numberbaseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ball {
   private int position;
    private int number;
    private List<Ball> balls;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }


    Enum<BallStatus> matchStatus(Ball userBall) {

        if (balls.equals(userBall)) {
                return BallStatus.STRIKE;

        } else if (position == userBall.position) {
            return BallStatus.BALL;
        }
            return BallStatus.NOTHING;
    }
    Enum<BallStatus> matchStatus2(Ball userBall) {

        for (Ball ball : balls) {
            ball.matchStatus(userBall);

        }
        return BallStatus.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && number == ball.number && Objects.equals(balls, ball.balls);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, number, balls);
    }
}
