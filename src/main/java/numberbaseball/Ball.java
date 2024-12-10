package numberbaseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ball {
   private int position;
    private int number;
    //private List<Ball> balls;

    public Ball(int position, int number) {
        this.position = position;
        this.number = number;
    }


    BallStatus matchStatus(Ball userBall) {

        if (number==userBall.number && position == userBall.position) {

            return BallStatus.STRIKE;

        } else if (number==userBall.number) {

            return BallStatus.BALL;
        }

            return BallStatus.NOTHING;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && number == ball.number;
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


    @Override
    public int hashCode() {
        return Objects.hash(position, number);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "position=" + position +
                ", number=" + number +
                '}';
    }


}

