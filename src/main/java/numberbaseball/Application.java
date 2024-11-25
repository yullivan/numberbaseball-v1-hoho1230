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
        List<Integer> randomNum = num.subList(0,3);
        System.out.println(randomNum);


        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");


        while (true) {
            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            int user1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int user2 = scanner.nextInt();
            System.out.print("세 번째 숫자를 입력하세요: ");
            int user3 = scanner.nextInt();

            int strike =0;
            // TODO: strike 개수를 계산하세요
            if(randomNum.get(0)==user1){
                strike =strike+1;
            }
            if(randomNum.get(1)==user2){
                strike =strike+1;
            }
            if(randomNum.get(2)==user3){
                strike =strike+1;
            }
            int ball =0;
            if(randomNum.get(0)==user2){
                ball =ball+1;
            }
            if(randomNum.get(0)==user3){
                ball =ball+1;
            }
            if(randomNum.get(1)==user1){
                ball =ball+1;
            }
            if(randomNum.get(1)==user3){
                ball =ball+1;
            }
            if(randomNum.get(2)==user1){
                ball =ball+1;
            }
            if(randomNum.get(2)==user2){
                ball =ball+1;
            }
            // TODO: 결과를 출력하세요 (예: "1 스트라이크")
            System.out.println(strike + " 스트라이크");
            System.out.println(ball + "  볼");

            // TODO: 3 스트라이크인 경우 게임을 끝내세요
            if(strike==3) break;

        }

         System.out.println("축하합니다! 정답을 맞추셨습니다.");
    }

}
