package SangLyThuyet.Sang1007;

public class GiaiThuaFactorial {
    public static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return (n * factorial(n-1));
    }

    public static int fibonacci(int n){
        if(n == 0 || n ==1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
