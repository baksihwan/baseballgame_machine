package numplay;

import java.util.Scanner;


public class BaseballGame {
    String answer;

    public BaseballGame() {//객체 생성시 정답을 만들도록 함


         answer=CorrectAnswer();



    }

    private String CorrectAnswer() {
        String number = "369"; //<--랜덤숫자지정
        return number;
    }








    public void play() {
        int countGames = 0;
        while (true) {
            Scanner sc = new Scanner(System.in); // 입력값
            System.out.println("숫자를 입력하세요.");
            String input = sc.nextLine();
            if (!validateInput(input)) {
                continue;
            }
            System.out.println();
            countGames++;  //게임 진행횟수 증가
            int strike = countStrike(input); //스트라이크 갯수 계산
            if (strike == 3) {    //정답여부 확인, 만약 정답이면 break를 이용해 반복문 탈출
                System.out.println("정답입니다.");
                break;
            }
            int ball = countBall(input); //볼 개수 계산
            BaseballGameDisplay.displayHint(strike,ball);


        }


    }

    protected boolean validateInput(String input) {    //검증입력값
        if (input.length() != 3) {
            System.out.println("숫자 갯수 오류입니다.");
            return false;

        }
        return true;

    }


    //스트라이크 갯수
    private int countStrike(String input) {
        int strike = 0;
        for (int i = 0; i < answer.length(); i++) {
            if(input.charAt(i) == answer.charAt(i)) {
                strike++;
            }

            }
        return strike;

    }



    //볼 갯수
    private int countBall(String input) {
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if(input.charAt(i) !=answer.charAt(i)
                    && answer.contains(String.valueOf(input.charAt(i)))){
                ball++;
            }
            }
        return ball;
    }
}


