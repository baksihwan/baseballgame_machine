package numplay;

import java.util.Random;
import java.util.Scanner;


public class BaseballGame {
    Random random = new Random();
    String answer;

    public BaseballGame() {//객체 생성시 정답을 만들도록 함


        answer = CorrectAnswer();


    }

    private String CorrectAnswer() {
        int firstNum=random.nextInt(9)+1;  //1~9까지의 랜덤숫자 기입
        int secondNum=random.nextInt(9)+1;
        int thirdNum=random.nextInt(9)+1;
        return firstNum+""+secondNum+""+thirdNum;
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
            BaseballGameDisplay.displayHint(strike, ball);


        }


    }

    protected boolean validateInput(String input) {    //숫자 입력값 검증
        if (input.length() != 3) {     //숫자 갯수 오류 검증
            System.out.println("숫자 갯수 오류입니다.");
            return false;

        }if(input.charAt(0)==input.charAt(1)   // 숫자 중복 오류 검증
                || input.charAt(1)==input.charAt(2)
                ||input.charAt(2)== input.charAt(0)){
            System.out.println("중복 숫자 오류입니다!");
            return false;
        }
        return true;

    }


    //스트라이크 갯수
    private int countStrike(String input) {
        int strike = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (input.charAt(i) == answer.charAt(i)) {
                strike++;
            }

        }
        return strike;

    }


    //볼 갯수
    private int countBall(String input) {
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (input.charAt(i) != answer.charAt(i)
                    && answer.contains(String.valueOf(input.charAt(i)))) {
                ball++;
            }
        }

            return ball;
        }
    }


