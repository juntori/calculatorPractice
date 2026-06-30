package lv2;

public class ArithmeticCalculator extends Calculator {
    AddOperator add;
    SubtractOperator sub;
    MultiplyOperator mlt;
    DivideOperator div;
    ModOperator mod;

    public ArithmeticCalculator(){
        this.add = new AddOperator();
        this.sub = new SubtractOperator();
        this.mlt = new MultiplyOperator();
        this.div = new DivideOperator();
        this.mod = new ModOperator();
    }

    public int calculate(int num1, int num2, char operator) {
        if(num1 < 0 || num2 < 0){
            throw new IllegalArgumentException("양의 정수(0 포함)만 입력할 수 있습니다");
        }
        int result = switch (operator){
            case '+' -> add.operate(num1, num2);
            case '-' -> sub.operate(num1, num2);
            case '*' -> mlt.operate(num1, num2);
            case '/' -> div.operate(num1, num2);
            case '%' -> mod.operate(num1, num2);
            default -> throw new IllegalArgumentException("잘못된 연산자를 입력했습니다. (+, -, *, /, %)");
        };
        return result;
    }
}
