package lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[] results = new int[10];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();

                System.out.println("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                System.out.println("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);
                int result = 0;
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            throw new IllegalArgumentException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
                        }
                        result = num1 / num2;
                        break;
                    default:
                        throw new IllegalArgumentException("올바른 사칙연산 기호를 입력해야 합니다.(+, -, *, /)");
                }
                System.out.println("결과: " + result);
                results[count] = result;
                count++;
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.next().equals("exit")){
                break;
            }
        }
    }
}
