package lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            try {
                calculator.calculate(num1, num2, operator);
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }

            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까?(y/n)");
            String remove = sc.next();
            if (remove.equalsIgnoreCase("y")){
                calculator.removeResult();
            }

            System.out.println("저장된 데이터를 조회 하시겠습니까? (y/n");
            String inquiry = sc.next();
            if (inquiry.equalsIgnoreCase("y")){
                calculator.inquiryResults();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")){
                break;
            }
        }
    }
}
