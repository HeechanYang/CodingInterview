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

        System.out.print("n을 입력해주세요(n은 자연수) : ");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.print("n을 다시 입력해주세요(n은 자연수) : ");
            n = scanner.nextInt();
        }

//        System.out.println(p5.findLastZeros(p5.factorialN(n))));
        System.out.println(p5.newFindLastZeros(n));
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
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int newFindLastZeros(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
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
