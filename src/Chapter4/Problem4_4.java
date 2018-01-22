package Chapter4;

import java.util.ArrayList;

/**
 * Created by YangHC on 2018-01-22.
 * <p>
 * [문제 4-4]
 * 균형 확인 : 이진 트리가 균형 잡혀있는지 확인하는 함수를 작성하라. 이 문제에서
 * 균형 잡힌 트리란 모든 노드에 대해서 왼쪽 부분 트리의 높이와 오른쪽 부분 트리의
 * 높이의 차이가 최대 하나인 트리를 의미한다.
 */
public class Problem4_4 {
    private ArrayList<BinaryTreeNode> nodes;
    public static int ERROR = Integer.MIN_VALUE;

    public Problem4_4() {
        nodes = new ArrayList<>();
    }

    public void setTreeExample1() {
        nodes.add(new BinaryTreeNode("a"));
        nodes.add(new BinaryTreeNode("b"));
        nodes.add(new BinaryTreeNode("c"));
        nodes.add(new BinaryTreeNode("d"));
        nodes.add(new BinaryTreeNode("e"));
        nodes.add(new BinaryTreeNode("f"));

        nodes.get(0).addChild(nodes.get(3));   //(a,d)
        nodes.get(5).addChild(nodes.get(1));   //(f,b)
        nodes.get(5).addChild(nodes.get(0));   //(f,a)
        nodes.get(3).addChild(nodes.get(2));   //(d,c)
        nodes.get(0).addChild(nodes.get(4));   //(a,e)
    }

    public void setTreeExample2() {
        nodes.add(new BinaryTreeNode("a"));
        nodes.add(new BinaryTreeNode("b"));
        nodes.add(new BinaryTreeNode("c"));
        nodes.add(new BinaryTreeNode("d"));
        nodes.add(new BinaryTreeNode("e"));
        nodes.add(new BinaryTreeNode("f"));
        nodes.add(new BinaryTreeNode("g"));
        nodes.add(new BinaryTreeNode("h"));
        nodes.add(new BinaryTreeNode("i"));

        nodes.get(0).addChild(nodes.get(1));
        nodes.get(0).addChild(nodes.get(2));
        nodes.get(1).addChild(nodes.get(3));
        nodes.get(1).addChild(nodes.get(4));
        nodes.get(2).addChild(nodes.get(5));
        nodes.get(3).addChild(nodes.get(6));
        nodes.get(3).addChild(nodes.get(7));
        nodes.get(5).addChild(nodes.get(8));
    }

    public void setTreeExample3() {
        nodes.add(new BinaryTreeNode("a"));
        nodes.add(new BinaryTreeNode("b"));
        nodes.add(new BinaryTreeNode("c"));
        nodes.add(new BinaryTreeNode("d"));
        nodes.add(new BinaryTreeNode("e"));
        nodes.add(new BinaryTreeNode("f"));
        nodes.add(new BinaryTreeNode("g"));
        nodes.add(new BinaryTreeNode("h"));
        nodes.add(new BinaryTreeNode("i"));

        nodes.get(0).addChild(nodes.get(1));
        nodes.get(0).addChild(nodes.get(2));
        nodes.get(1).addChild(nodes.get(3));
        nodes.get(1).addChild(nodes.get(4));
        nodes.get(2).addChild(nodes.get(6));
        nodes.get(3).addChild(nodes.get(7));
        nodes.get(3).addChild(nodes.get(8));
        nodes.get(4).addChild(nodes.get(5));
    }

    public int preOrderTraversal(BinaryTreeNode root) {
        if (root == null) {
            return -1;
        }
        int leftTreeDepth = preOrderTraversal(root.getChildren()[0]);
        int rightTreeDepth = preOrderTraversal(root.getChildren()[1]);

        if (Math.abs(leftTreeDepth - rightTreeDepth) > 1 || leftTreeDepth == ERROR || rightTreeDepth == ERROR) {
            return ERROR;
        } else {
            return (Math.max(leftTreeDepth, rightTreeDepth) + 1);
        }
    }

    public ArrayList<BinaryTreeNode> getNodes() {
        return nodes;
    }
}
