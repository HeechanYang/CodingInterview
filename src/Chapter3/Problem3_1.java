package Chapter3;

/**
 * Created by YangHC on 2018-01-31.
 * <p>
 * [문제 3-1]
 * 한 개로 세 개 : 배열 한 개로 스택 세 개를 어떻게 구현할지 설명하라.
 * <p>
 * 0번째 스택은 idx%3==0 의 인덱스를 사용하고
 * 1번째 스택은 idx%3==1 의 인덱스를 사용하고
 * 2번째 스택은 idx%3==2 의 인덱스를 사용한다
 */
public class Problem3_1 {
    class ArrayStack {
        public int STACK_0_SIZE = 0;
        public int STACK_1_SIZE = 0;
        public int STACK_2_SIZE = 0;
        private int[] arrayStack = new int[10000];

        public void push(int stackNum, int num) {
            switch (stackNum) {
                case 0:
                    arrayStack[STACK_0_SIZE * 3] = num;
                    STACK_0_SIZE++;
                case 1:
                    arrayStack[STACK_1_SIZE * 3 + 1] = num;
                    STACK_1_SIZE++;
                case 2:
                    arrayStack[STACK_2_SIZE * 3 + 2] = num;
                    STACK_2_SIZE++;
            }
        }

        public int pop(int stackNum) {
            switch (stackNum) {
                case 0:
                    STACK_0_SIZE--;
                    return arrayStack[STACK_0_SIZE * 3];
                case 1:
                    STACK_1_SIZE--;
                    return arrayStack[STACK_0_SIZE * 3 + 1];
                case 2:
                    STACK_2_SIZE--;
                    return arrayStack[STACK_0_SIZE * 3 + 2];
            }
            return Integer.MIN_VALUE;
        }

        public int peek(int stackNum) {
            switch (stackNum) {
                case 0:
                    return arrayStack[(STACK_0_SIZE - 1) * 3];
                case 1:
                    return arrayStack[(STACK_0_SIZE - 1) * 3 + 1];
                case 2:
                    return arrayStack[(STACK_0_SIZE - 1) * 3 + 2];
            }
            return Integer.MIN_VALUE;
        }

        public boolean isEmpty(int stackNum) {
            switch (stackNum) {
                case 0:
                    return STACK_0_SIZE == 0;
                case 1:
                    return STACK_1_SIZE == 0;
                case 2:
                    return STACK_2_SIZE == 0;
            }
            return true;
        }
    }
}
