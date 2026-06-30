package lv2;

public class ArithmeticCalculator extends Calculator {
    AddOperator add;
    SubtractOperator sub;
    MultiplyOperator mlt;
    DivideOperator div;

    public ArithmeticCalculator(){
        this.add = new AddOperator();
        this.sub = new SubtractOperator();
        this.mlt = new MultiplyOperator();
        this.div = new DivideOperator();
    }

    public int calculate(int num1, int num2, char operator) {
        if(num1 < 0 || num2 < 0){
            throw new IllegalArgumentException("양의 정수(0 포함)만 입력할 수 있습니다");
        }
        int result;
        switch (operator){
            case '+':
                result = add.operate(num1,num2);
                break;
            case '-':
                result = sub.operate(num1, num2);
                break;
            case '*':
                result = mlt.operate(num1, num2);
                break;
            case '/':
                if (num2 == 0) {
                    throw new IllegalArgumentException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                result = div.operate(num1, num2);
                break;

            default:
                throw new IllegalArgumentException("잘못된 연산자를 입력했습니다. (+, -, *, /)");
        }
        return result;
    }
}
