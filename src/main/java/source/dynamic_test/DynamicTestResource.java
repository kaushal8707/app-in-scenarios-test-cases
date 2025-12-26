package source.dynamic_test;

public class DynamicTestResource {

    public static Integer addNum(int n1, int n2){
        return n1+n2;
    }
    public static Integer multiplyNum(int n1, int n2){
        return n1 * n2;
    }
    public static Integer squareNum(int n){
        return n * n;
    }
    public static boolean isOddNum(int num){
        return num % 2 != 0;
    }
}
