package Chapter3;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by YangHC on 2018-01-31.
 * <p>
 * [문제 3-3]
 * 접시 무더기 : 접시 무더기를 생각해 보자. 접시를 너무 높이 쌓우면 무너져 내릴 것이다.
 * 따라서 현실에서는 접시를 쌓다가 무더기가 어느 정도 높아지면 새로운 무더기를 만든다.
 * 이것을 흉내 내는 자료구조 SetOfStaks를 구현해 보라. SetOfStaks는 여러 개의 스택으로 구성되어
 * 있으며, 이전 스택이 지정된 용량을 초과하는 경우 새로운 스택을 생성해야 한다.
 * SetOfStacks.push()와 SetOfStacks.pop()은 스택이 하나이 경우와 동일하게 동작해야 한다.
 * (다시 말해, pop()은 정확히 하나의 스택이 있을 때와 동일한 값을 반환해야 한다)
 * <p>
 * <p>
 * [연관 문제]
 * 특정한 하위 스택에 대해서 pop을 수행하는 popAt(int index) 함수를 구현하라.
 */
public class Problem3_3 {


}

class SetOfStacks {
    public static final int MAX_STACK_SIZE = 10;
    private int idx = -1;

    private ArrayList<Stack<Integer>> stackList = new ArrayList<>();

    public Integer push(Integer item) {
        idx++;

        //다음 스택이 존재하지 않으면
        if (idx % MAX_STACK_SIZE == 0) {
            stackList.add(new Stack<>());
        }

        stackList.get(getCurrentStackNum()).push(item);

        return item;
    }

    public synchronized Integer pop() {
        Stack<Integer> currentStack = stackList.get(getCurrentStackNum());
        int num = currentStack.pop();
        if (currentStack.size() == 0) {
            stackList.remove(currentStack);
        }
        idx--;
        return num;
    }

    public Integer peek() {
        Stack<Integer> currentStack = stackList.get(getCurrentStackNum());
        return currentStack.peek();
    }

    public int size() {
        return idx + 1;
    }

    public boolean isEmpty() {
        return (idx < 0);
    }

    public int getCurrentStackNum() {
        return idx / MAX_STACK_SIZE;
    }
}