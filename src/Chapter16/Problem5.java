package Chapter16;

import java.util.Scanner;

/**
 * Created by YangHC on 2018-01-06.
 */
public class Problem5 {
    private int cnt5;

    public static void main(String[] args) {
        Problem5 p5 = new Problem5();

        Scanner scanner = new Scanner(System.in);

        System.out.println("f(5) : " + p5.factorialN(5));
        System.out.println("f(6) : " + p5.factorialN(6));
        System.out.println("f(7) : " + p5.factorialN(7));
        System.out.println("f(8) : " + p5.factorialN(8));
        System.out.println("f(9) : " + p5.factorialN(9));
        System.out.println("f(10) : " + p5.factorialN(10));
        System.out.println("f(15) : " + p5.factorialN(15));

//        System.out.println(p5.findLastZeros(p5.factorialN(s.nextInt())));
        System.out.println(p5.newFindLastZeros(scanner.nextInt()));
    }

    public int findLastZeros(long num) {
        int cnt = 0;
        while (num % 10 == 0) {
            num /= 10;
            cnt++;
        }
        return cnt;
    }

    public long factorialN(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int newFindLastZeros(int n) {
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            cnt += count5(i);
        }
        return cnt;
    }

    public int count5(int num) {
        int cnt = 0;
        while (num % 5 == 0) {
            num /= 5;
            cnt++;
        }
        return cnt;
    }
}
