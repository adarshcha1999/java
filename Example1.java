
interface Calculator {
    int operate(int a,int b);
}
public class Example1 {
    public static void main(String[] args) {
        Calculator addition=(a,b)->a+b;
        Calculator multiply=(a,b)->a*b;
        int sum=addition.operate(5,10);
        int multiResult=multiply.operate(5,3);
        System.out.println("Addition="+sum);
        System.out.println("Multiplication="+multiResult);
    }
}
