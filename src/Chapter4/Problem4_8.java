package Chapter4;

import java.util.Stack;

/**
 * Created by YangHC on 2018-01-22.
 *
 * [문제4-8]
 * 첫 번째 공통 조상 : 이진 트리에서 노드 두 개가 주어졌을 때 이 두 노드의 첫번째
 * 공통 조상을 찾는 알고리즘을 설계하고 그 코드를 작성하라. 자료구조 내에
 * 추가로 노드를 저장해 두면 안 된다. 반드시 이진 탐색 트리일 필요는 없다.
 */
public class Problem4_8 {
    BinaryTreeNode[] nodes;
    Stack<BinaryTreeNode>[] parentStack;
    Dependency[] dependencies;

    public static void main(String[] args) {
        Problem4_8 p8 = new Problem4_8();
        p8.setTreeExample1();
        p8.setParentStack();

        System.out.println(p8.getFirstAncestor(2,3).getName());
    }

    public void setTreeExample1() {
        nodes = new BinaryTreeNode[6];
        parentStack = new Stack[nodes.length];
        for (int i = 0; i < parentStack.length; i++) {
            parentStack[i] = new Stack<>();
        }

        nodes[0] = new BinaryTreeNode("a");
        nodes[1] = new BinaryTreeNode("b");
        nodes[2] = new BinaryTreeNode("c");
        nodes[3] = new BinaryTreeNode("d");
        nodes[4] = new BinaryTreeNode("e");
        nodes[5] = new BinaryTreeNode("f");

        dependencies = new Dependency[6];
        dependencies[0] = new Dependency(nodes[0], nodes[3]);
        dependencies[1] = new Dependency(nodes[5], nodes[1]);
        dependencies[2] = new Dependency(nodes[0], nodes[3]);
        dependencies[3] = new Dependency(nodes[5], nodes[0]);
        dependencies[4] = new Dependency(nodes[3], nodes[2]);
        dependencies[5] = new Dependency(nodes[0], nodes[4]);

        for (Dependency dependency : dependencies) {
            BinaryTreeNode parent = dependency.getParent();
            BinaryTreeNode child = dependency.getChild();

            parent.addChild(child);
        }
    }

    public void setParentStack() {
        for (int i = 0; i < nodes.length; i++) {
            BinaryTreeNode thisNode = nodes[i];
            parentStack[i].push(thisNode);
        }
    }

    public BinaryTreeNode getFirstAncestor(int a, int b) {
        Stack<BinaryTreeNode> temp = new Stack<>();

        while (parentStack[a].size() > 0 && parentStack[b].size() > 0) {
            BinaryTreeNode tempNode = parentStack[a].pop();
            if(tempNode.equals(parentStack[b].pop())) {
                temp.push(tempNode);
            }else{
                break;
            }
        }
        return temp.pop();
    }

    class Dependency {
        private BinaryTreeNode parent;
        private BinaryTreeNode child;

        public Dependency(BinaryTreeNode parent, BinaryTreeNode child) {
            this.parent = parent;
            this.child = child;
        }

        public BinaryTreeNode getParent() {
            return parent;
        }

        public BinaryTreeNode getChild() {
            return child;
        }
    }
}
