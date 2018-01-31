package Chapter3;

import java.util.Stack;

/**
 * Created by YangHC on 2018-01-31.
 *
 * [문제 3-4]
 * 스택으로 큐 : 스택 두개로 큐 하나를 구현한 MyQueue클래스를 구현하라.
 *
 * 1. 스택 A에 차곡차곡 push 하다가 pop,remove, peek 할 땐 스택 B에 차례대로 pop 한 후 다룬다.
 */
public class Problem3_4 {
}
class MyQueue<E>{
    private Stack[] stacks;

    public MyQueue(){
        stacks = new Stack[2];
        for (int i = 0; i < 2; i++) {
            stacks[i] = new Stack<E>();
        }
    }


}
