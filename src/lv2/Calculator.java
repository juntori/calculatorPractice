package lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Integer> results;
    private final List<Double> circleAreaResults;

    public Calculator(){
        this.results = new ArrayList<>();
        this.circleAreaResults = new ArrayList<>();
    }

    public double calculateCircleArea(double radius){
        double circleArea = radius * radius * 3.14;
        circleAreaResults.add(circleArea);
        return circleArea;
    }

    public List<Double> getCircleAreaResults(){
        return circleAreaResults;
    }

    public void setCircleAreaResults(List<Double> newCircleAreaResults){
        circleAreaResults.clear();
        circleAreaResults.addAll(newCircleAreaResults);
    }

    public int calculate(int num1, int num2, char operator) {
        if(num1 < 0 || num2 < 0){
            throw new IllegalArgumentException("양의 정수(0 포함)만 입력할 수 있습니다");
        }
        int result;
        switch (operator){
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
                    throw new IllegalArgumentException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = num1 / num2;
                break;

            default:
                throw new IllegalArgumentException("잘못된 연산자를 입력했습니다. (+, -, *, /)");
        }
        results.add(result);
        return result;
    }

    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> newResults){
        results.clear();
        results.addAll(newResults);
    }

    public void removeResult() {
        results.remove(0);
    }

    public void inquiryResults(){
        for (Integer result : results) {
            System.out.println( );
        }
    }
}
