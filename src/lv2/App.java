package lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArithmeticCalculator arithmetic = new ArithmeticCalculator();
        CircleCalculator circleArea = new CircleCalculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("원하시는 항목의 숫자를 입력하세요");
            System.out.println("1 : 사칙 연산");
            System.out.println("2 : 원의 넓이");
            System.out.println("3: 저장된 데이터 삭제");
            System.out.println("4: 저장된 데이터 조회");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("첫 번째 숫자를 입력하세요: ");
                    int num1 = sc.nextInt();
                    System.out.print("두 번째 숫자를 입력하세요:");
                    int num2 = sc.nextInt();

                    System.out.print("사칙연산 기호를 입력하세요: ");
                    char operator = sc.next().charAt(0);

                    try {
                        double result = arithmetic.calculate(num1, num2, operator);
                        arithmetic.saveResult(result);
                        System.out.println("결과: " + result);
                    } catch (Exception e) {
                        System.out.println("오류: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("반지름을 입력하세요: ");
                    double radius = sc.nextDouble();
                    double result = circleArea.calculateCircleArea(radius);
                    circleArea.saveResult(result);
                    System.out.println("결과 : " + result);
                    break;
                case 3:
                    System.out.println("1 : 사칙연산 데이터 삭제");
                    System.out.println("2 : 원 넓이 데이터 삭제");
                    int delete = sc.nextInt();
                    switch (delete) {
                        case 1:
                            arithmetic.removeResult();
                            break;
                        case 2:
                            circleArea.removeResult();
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1 : 사칙연산 데이터 조회");
                    System.out.println("2 : 원 넓이 데이터 조회");
                    int inquiry = sc.nextInt();
                    switch (inquiry) {
                        case 1:
                            arithmetic.inquiryResults();
                            break;
                        case 2:
                            circleArea.inquiryResults();
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                            break;
                    }
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}