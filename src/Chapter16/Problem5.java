package Chapter16;

import java.util.Scanner;

/**
 * Created by YangHC on 2018-01-06.
 */
public class Problem5 {
    public static void main(String[] args) {
        Problem5 p5 = new Problem5();

        Scanner s = new Scanner(System.in);

        System.out.println(p5.findLastZeros(p5.factorialN(s.nextInt())));
    }

    public int findLastZeros(long num){
        int cnt = 0;
        while(num%10==0){
            num/=10;
            cnt ++;
        }
        return cnt;
    }

    public long factorialN(int n){
        long result=1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        return result;
    }
}
