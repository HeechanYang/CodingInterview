package Chapter3;

import java.util.Stack;

/**
 * Created by YangHC on 2018-01-31.
 * <p>
 * [문제 3-5]
 * 스택 정렬 : 가장 작은 값이 위로 오도록 스택을 정렬하는 프로그램을 작성하라. 추가적으로
 * 하나 정도의 스택은 사용해도 괜찮지만, 스택에 보관된 요소를 배열 등의 다른 자료구조로
 * 복사할 수는 없다. 스택은 push, pop, peek, isEmpty의 네 가지 연산을 제공해야 한다.
 * <p>
 * 기존 스택에 push할 때, 새로운 숫자와 기존 스택의 peek과 비교하며 pop하여 다른 스택에 push했다가
 * 새로운 숫자의 자리를 찾으면 push 후 다른 스택의 값들을 pop하여 기존 스택에 다시 옮긴다.
 * 나머지(pop, peek, isEmpty)는 그대로 구현하면 된다.
 */
public class Problem3_5 {
}

class SortedStack extends Stack<Integer> {
    Stack<Integer> tempStack = new Stack<>();

    @Override
    public Integer push(Integer item) {
        //자리를 찾을 때까지 pop 하면서 tempStack에 push함
        while (!isEmpty() && item > peek()) {
            tempStack.push(this.pop());
        }

        //자리를 찾으면 해당 item을 push함
        super.push(item);

        //tempStack에서 기존 Stack으로 다시 push함
        while (tempStack.size() > 0) {
            super.push(tempStack.pop());
        }
        return item;
    }

    @Override
    public synchronized Integer pop() {
        return super.pop();
    }

    @Override
    public synchronized Integer peek() {
        return super.peek();
    }

    @Override
    public synchronized boolean isEmpty() {
        return super.isEmpty();
    }
}