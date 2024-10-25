⭐ 구현 
Lv 1. 기본 게임 구현 (숫자 야구 게임)



✅ 구현 시 신경쓴 점
1. 주석을 활용해 코드 설명
2. 간단명료한 코드 작성



💡 숫자 야구 게임이란?
- **목표** : 컴퓨터가 생성한 3자리 숫자를 플레이어가 맞추는 게임
- **숫자에 대한 요구사항**
    - 각 자리는 1-9 사이의 숫자
    - 동일한 숫자는 사용될 수 없다. 즉, 숫자는 중복되지 않아야 한다.
    - ex) 333, 112, 119 `불가능`
- **게임 결과**
    - 각 시도에 대해 '스트라이크'와 '볼'의 개수를 출력하여 플레이어가 숫자를 맞출 수 있도록 유도한다.


 

1️⃣ Lv 1. 기본 게임 구현


✅ <제시조건 체크문항>
1. 정답 개수는 숫자 3개로 제한 (V)
2. 정답과 입력값을 비교해 '볼, 스트라이크, 아웃'으로 표시 (V)
3. 스트라이크 기능 구현(입력값과 정답을 비교해 같은 자리에 같은 숫자가 있는 경우) (V)
4. 볼 기능 구현(숫자는 같지만, 자리는 다른 경우) (V)
5. 아웃 기능 구현(숫자도, 자리도 다른 경우) (V)
6. 올바르지 않은 입력값에 대해 오류 문구 표시(V)
7. 정답을 맞출때까지 이어지며, 정답을 맞추면 종료 구현 (V)
8. 입력값 숫자의 중복 오류를 구현 (V)

✴️ 트러블 슈팅
https://nangman99.tistory.com/27
