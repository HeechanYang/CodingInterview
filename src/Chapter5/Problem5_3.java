package Chapter5;

import Chapter6.Problem6_2;

import java.util.ArrayList;

/**
 * Created by YangHC on 2018-01-29.
 * <p>
 * 비트 뒤집기 : 어떤 정수가 주어졌을 때 여러분은 이 정수의 비트 하나를 0에서 1로 바꿀 수 있다.
 * 이 때 1이 연속으로 나올 수 있는 가장 긴 길이를 구하는 코드를 작성하라.
 */
public class Problem5_3 {
    public int getLongestOneLength(int num) {
        ArrayList<StraightOne> straightOneList = new ArrayList<>();

        boolean isStart = false;
        int start = 0, end, length;

        for (int i = 0; i < Integer.SIZE; i++) {
            if (isThisBitOne(num, i)) {
                if (!isStart) {
                    isStart = true;
                    start = i;
                }
            } else {
                if (isStart) {
                    isStart = false;
                    end = i - 1;
                    length = end - start + 1;
                    straightOneList.add(new StraightOne(length, start, end));
                }
            }
        }

        int result;
        int longestLength = getLongestLength(straightOneList) + 1;
        int longestPastedLength = getPastedLongestLength(straightOneList);

        return longestLength > longestPastedLength ? longestLength : longestPastedLength;
    }

    public int getPastedLongestLength(ArrayList<StraightOne> straightOneList) {
        int maxLength = 0;

        for (int i = 1; i < straightOneList.size(); i++) {
            StraightOne so1 = straightOneList.get(i - 1);
            StraightOne so2 = straightOneList.get(i);
            if (so2.getStart() - so1.getEnd() == 2) {
                int pastedLength = so1.getLength() + so2.getLength() + 1;
                if (pastedLength > maxLength) {
                    maxLength = pastedLength;
                }
            }
        }
        return maxLength;
    }

    public int getLongestLength(ArrayList<StraightOne> straightOneList) {
        int max = 0;
        for (StraightOne so : straightOneList) {
            if (so.getLength() > max) {
                max = so.getLength();
            }
        }
        return max;
    }

    public boolean isThisBitOne(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    class StraightOne {
        private int length;
        private int start;
        private int end;

        public StraightOne(int length, int start, int end) {
            this.length = length;
            this.start = start;
            this.end = end;
        }

        public int getLength() {
            return length;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }
    }
}
