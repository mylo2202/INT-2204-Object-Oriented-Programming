import java.util.Scanner;

public class GCD {
    public static int GCD(int a, int b)
    {
        if (a == 0 && b == 0) return 0;
		if (a == 0 && b != 0) return b;
		if (a != 0 && b == 0) return a;
        while (a != b)
        {
            if (a > b) a = a - b;
            if (a < b) b = b - a;
        }
        return a;
    }

    public static void main(String[] args)
    {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(GCD(a, b));
    }

}
