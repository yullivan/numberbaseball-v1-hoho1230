package numberbaseball;

import java.util.Objects;

public class GameResult {
    private int strickCount;
    private int ballCount;

    void incrementCount(BallStatus status){
        if(status==BallStatus.STRIKE){
            strickCount=strickCount+1;
        }
        if(status==BallStatus.BALL){
            ballCount=ballCount+1;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameResult result = (GameResult) o;
        return strickCount == result.strickCount && ballCount == result.ballCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strickCount, ballCount);
    }

    @Override
    public String toString() {
        String strikeOutput=strickCount+" strike";
        String ballOutput=ballCount+" ball";

        if(strickCount==0&&ballCount==0){
            return "out ("+strikeOutput+" "+ballOutput+")";
        }
        else if(strickCount==0) {
            return ballOutput;
        }else if(ballCount==0){
            return strikeOutput;
        }
        return strikeOutput+" "+ballOutput;
    }

    boolean isGameOver(int strickCount){
        if (strickCount==3) return true;
        return false;
    }

    public GameResult(int strickCount, int ballCount) {
        this.strickCount = strickCount;
        this.ballCount = ballCount;
    }

}
