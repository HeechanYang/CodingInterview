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
    private String arr[] = {"at", "ball", "car", "dad",};

    private int start, end;

    public void setArr(String arr[]) {
        this.arr = arr;
        start = 0;
        end = arr.length - 1;
    }

    public int indexOf(String value) {
        String temp;
        do {
            int tempIdx = (start + end) / 2;
            System.out.println(tempIdx);
            temp = arr[tempIdx];

            //만약 공백문자라면 tempIdx++;
            while (temp.isEmpty()) {
                if (++tempIdx > end) {
                    //끝까지 갔는데 못 찾으면 일단 끝냄
                    break;
                }
                temp = arr[tempIdx];
            }
            //끝까지 갔는데 아직 못 찾았다면
            //원위치로 와서 다시 반대로 ㄱㄱ(tempIdx--;)
            if (temp.isEmpty()) {
                tempIdx = (start + end) / 2;
            }
            while (temp.isEmpty()) {
                if (--tempIdx < start) {
                    //반대로 왔는데도 끝까지 못 찾으면 끝냄
                    break;
                }
                temp = arr[tempIdx];
            }
            if (temp.isEmpty()) {
                return -1;
            }

            if (temp.equals(value)) {
                return tempIdx;
            } else if (temp.compareTo(value) < 0) {
                start = tempIdx + 1;
            } else {
                end = tempIdx - 1;
            }
        }
        while (true);
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
