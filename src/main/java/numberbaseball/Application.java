package numberbaseball;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        Random random = new Random();
        for (int i = 1; i < 10; i++) {
            num.add(i);
        }
        Collections.shuffle(num);
        List<Integer> randomNum = num.subList(0, 3);
        System.out.println(randomNum);


        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");
        boolean isCorrect=false;

        while (!isCorrect) {
            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            ArrayList<Integer> user = new ArrayList<>();
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            user.add(scanner.nextInt());
            System.out.print("두 번째 숫자를 입력하세요: ");
            user.add(scanner.nextInt());
            System.out.print("세 번째 숫자를 입력하세요: ");
            user.add(scanner.nextInt());

            int strike = 0;
            int ball = 0;
            // TODO: strike 개수를 계산하세요
            for (int i = 0; i < 3; i++) {
                if (randomNum.get(i) == user.get(i)) {
                    strike = strike + 1;
                } else  {
                    for (int j = 0; j < 3; j++) {

                    }
                    ball = ball + 1;
                }
            }
//
//            if(randomNum.get(0)==user.get(1)){
//                ball =ball+1;
//            }
//            if(randomNum.get(0)==user.get(2)){
//                ball =ball+1;
//            }
//            if(randomNum.get(1)==user.get(0)){
//                ball =ball+1;
//            }
//            if(randomNum.get(1)==user.get(2)){
//                ball =ball+1;
//            }
//            if(randomNum.get(2)==user.get(0)){
//                ball =ball+1;
//            }
//            if(randomNum.get(2)==user.get(1)){
//                ball =ball+1;
//            }
            // TODO: 결과를 출력하세요 (예: "1 스트라이크")
            System.out.println(strike + " 스트라이크");
            System.out.println(ball + "  볼");

            // TODO: 3 스트라이크인 경우 게임을 끝내세요
            if (strike == 3) isCorrect=true;

        }

        System.out.println("축하합니다! 정답을 맞추셨습니다.");
    }

}
