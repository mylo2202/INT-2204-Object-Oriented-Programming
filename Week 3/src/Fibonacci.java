import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        return n;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner scannerObj =  new Scanner(System.in);
        n = scannerObj.nextInt();
        System.out.println(fibonacci(n));
    }

}
