package lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Integer> results = new ArrayList<>();
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
                results.add(result);

            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String remove = sc.next();
            if (remove.equals("remove")){
                results.remove(0);
                System.out.println("삭제되었습니다.");
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiry = sc.next();
            if (inquiry.equals("inquiry")){
                System.out.println("저장된 연산 결과 입니다.");
                for (Integer result : results) {
                    System.out.println(result);
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.next().equals("exit")){
                break;
            }
        }
    }
}
