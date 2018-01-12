package Chapter10;

import java.util.Arrays;

/**
 * Created by YangHC on 2018-01-12.
 * <p>
 * [문제 10-11]
 * Peak과 Valley : 정수 배열에서 'peak'이란 현재 원소가 인접한 정수보다 크거나
 * 같을 때를 말하고, valey'란 현재 원소가 인접한 저수보다 작거나 같을 때를 말한다.
 * 예를 들어 [5, 8, 6, 2, 3, 4, 6]이 있으면, [8, 6]은 'peak'이 되고, [5, 2]는
 * 'valley'가 된다. 정수 배열이 주어졌을 때, 'peak'과 'valley'가 번갈아 등장하도록
 * 정렬하는 알고리즘을 작성하라.
 * <p>
 * ex)
 * 입력 : {5, 3, 1, 2, 3}
 * 출력 : {5, 1, 3, 2, 3}
 */
public class Problem10_11 {

    public int[] getZigZagArray(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;

        int[] zigZagArr = new int[len];
        int curIdx = 0;

        int valley = -1;
        int peak = len;

        for (int i = 1; i <= len / 2; i++) {
            zigZagArr[curIdx++] = arr[--peak];
            zigZagArr[curIdx++] = arr[++valley];
        }
        if (len % 2 != 0) {
            zigZagArr[curIdx] = arr[++valley];
        }
        return zigZagArr;
    }

    public void printZigZagArr(int[] zigZagArr) {
        for (int num : zigZagArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
