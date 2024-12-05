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
		Ball ball1 =new Ball(1,3);
		Ball ball2 =new Ball(1,7);
		Ball ball3 =new Ball(1,9);
		Ball userBall1 =new Ball(1,3);
		Ball userBall2 =new Ball(2,7);
		Ball userBall3 =new Ball(2,2);


		//when

		//then
		assertThat(ball1.matchStatus(userBall1)).isEqualTo("STRIKE");
		assertThat(ball2.matchStatus(userBall2)).isEqualTo("BALL");
		assertThat(ball3.matchStatus(userBall3)).isEqualTo("NOTHING");


	}

	@Test
	void name2() {
		//give
		Ball ball1 =new Ball(1,1);
		Ball ball2 =new Ball(2,2);
		Ball ball3 =new Ball(3,3);
		Ball userBall1 =new Ball(1,1);
		Ball userBall2 =new Ball(3,1);
		Ball userBall3 =new Ball(3,9);
		List<Ball> balls =new ArrayList<>();

		//Balls balls =new ArrayList<Ball>();
		balls.add(ball1);
		balls.add(ball2);
		balls.add(ball3);

		//when

		//then
		assertThat(ball1.matchStatus2(userBall1)).isEqualTo("STRIKE");
		assertThat(ball2.matchStatus2(userBall2)).isEqualTo("BALL");
		assertThat(ball1.matchStatus2(userBall3)).isEqualTo("NOTHING");
	}
}
