package Chapter10;

import java.util.ArrayList;

/**
 * Created by YangHC on 2018-01-12.
 * <p>
 * [문제 10-5]
 * 드문드문 탐색 ; 빈 문자열이 섞여 있는 정렬된 문자열 배열이 주어졌을 때,
 * 특정 문자열의 위치를 차즌 메서드를 작성하라.
 * <p>
 * <p>
 * [Sort], [Search]
 */
public class Problem10_5 {
    private String arr[] = {"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
//    private String arr2[];

    public static int getCountValidString(String arr[]) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                cnt++;
            }
        }
        return cnt;
    }

    public static Node[] resetArr(String arr[]) {
        int validLength = getCountValidString(arr);
        Node nodes[] = new Node[validLength];

        for (int i = 0; i < arr.length; i++) {
            nodes[nodes.]
        }
    }

    public int indexOfJustUsingLoop(String value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value))
                return i;
        }
        return -1;
    }

    class Node {
        public String value;
        public int index;
    }
}
