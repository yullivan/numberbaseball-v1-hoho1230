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
    String matchStatus(Ball userBall) {
       int strike=0;
       int ball=0;

        if (position == userBall.position) {
            if (number == userBall.number) {
                strike =strike+1;
                System.out.println("strike = " + strike);
                return  "STRIKE";
            }

        } else if (number == userBall.number) {
            ball =ball +1;
            System.out.println("ball = " + ball);
            return  "BALL";
        } else
        System.out.println("아웃");
        return  "NOTHING";
    }


}
