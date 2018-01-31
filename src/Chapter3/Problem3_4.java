package Chapter3;

import java.util.Stack;

/**
 * Created by YangHC on 2018-01-31.
 * <p>
 * [문제 3-4]
 * 스택으로 큐 : 스택 두개로 큐 하나를 구현한 MyQueue클래스를 구현하라.
 * <p>
 * 1. enqueue 시 스택 A에 차곡차곡 push 하다가 dequeue, remove, peek 할 땐 스택 B에 차례대로 pop 한 후 다룬다.
 * (단, dequeue, remove, peek의 시간복잡도는 O(n) )
 * (반대로 enqueue의 시간복잡도만 O(n)으로 바꿀 수도 있음)
 */
public class Problem3_4 {
}

class MyQueue<E> {
    private Stack[] stacks;

    public MyQueue() {
        stacks = new Stack[2];
        for (int i = 0; i < 2; i++) {
            stacks[i] = new Stack<E>();
        }
    }

    public E enqueue(E item) {
        stacks[0].push(item);
        return item;
    }

    public E dequeue() {
        while (stacks[0].size() > 0) {
            stacks[1].push(stacks[0].pop());
        }
        E item = (E) stacks[1].pop();
        while (stacks[1].size() > 0) {
            stacks[0].push(stacks[1].pop());
        }
        return item;
    }

    public void remove() {
        while (stacks[0].size() > 0) {
            stacks[1].push(stacks[0].pop());
        }
        E item = (E) stacks[1].pop();
        while (stacks[1].size() > 0) {
            stacks[0].push(stacks[1].pop());
        }
    }

    public E peek() {
        while (stacks[0].size() > 0) {
            stacks[1].push(stacks[0].pop());
        }
        E item = (E) stacks[1].peek();
        while (stacks[1].size() > 0) {
            stacks[0].push(stacks[1].pop());
        }
        return item;
    }

    public boolean isEmpty() {
        return stacks[0].isEmpty();
    }
}

class MyQueue2<E> {
    private Stack[] stacks;

    public MyQueue2() {
        stacks = new Stack[2];
        for (int i = 0; i < 2; i++) {
            stacks[i] = new Stack<E>();
        }
    }

    public E enqueue(E item) {
        while (stacks[0].size() > 0) {
            stacks[1].push(stacks[0].pop());
        }

        stacks[0].push(item);

        while (stacks[1].size() > 0) {
            stacks[0].push(stacks[1].pop());
        }
        return item;
    }

    public E dequeue() {
        return (E) stacks[0].pop();
    }

    public void remove() {
        stacks[0].pop();
    }

    public E peek() {
        return (E) stacks[0].peek();
    }

    public boolean isEmpty() {
        return stacks[0].isEmpty();
    }
}
