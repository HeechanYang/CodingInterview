package Chapter3;

import java.util.Stack;

/**
 * Created by YangHC on 2018-01-31.
 *
 * [문제 3-2]
 * 스택 Min : 기본적인 push와 pop 기능이 구현된 스택에서 최솟값을 반환하는 min 함수를
 * 추가하려고 한다. 어떻게 설계할 수 있겠는가? push, pop, min 연산은 모두 O(1) 시간에 동작해야 한다.
 * push, pop을 하면서 max, min값을 계산한다.
 *
 *
 * max[]와 min[]을 만들어서 push, pop 시 각 사이즈까지의 max, min 값을 기록해둔다.
 */
public class Problem3_2 {
}

class MyStack extends Stack<Integer>{
    private int[] max= new int[10000];
    private int[] min= new int[10000];

    public MyStack(){
        super();
        max[0] = Integer.MIN_VALUE;
        min[0] = Integer.MAX_VALUE;
    }

    @Override
    public Integer push(Integer item) {
        int size = size();
        max[size] = item > max[size-1] ? max[size] = item : max[size-1];
        min[size] = item < min[size-1] ? min[size] = item : min[size-1];

        return super.push(item);
    }

    @Override
    public synchronized Integer pop() {
        int item = super.pop();

        int size = size();
        max[size] = item > max[size-1] ? max[size] = item : max[size-1];
        min[size] = item < min[size-1] ? min[size] = item : min[size-1];

        return item;
    }

    public int getMax() {
        return max[size()];
    }

    public int getMin() {
        return min[size()];
    }
}
