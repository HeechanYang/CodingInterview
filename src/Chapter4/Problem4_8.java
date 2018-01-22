package Chapter4;

import java.util.ArrayList;

/**
 * Created by YangHC on 2018-01-22.
 *
 * [문제4-8]
 * 첫 번째 공통 조상 : 이진 트리에서 노드 두 개가 주어졌을 때 이 두 노드의 첫번째
 * 공통 조상을 찾는 알고리즘을 설계하고 그 코드를 작성하라. 자료구조 내에
 * 추가로 노드를 저장해 두면 안 된다. 반드시 이진 탐색 트리일 필요는 없다.
 */
public class Problem4_8 {
    private ArrayList<BinaryTreeNode> nodes;
    public static int ERROR = Integer.MIN_VALUE;

    public Problem4_8() {
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

    public BinaryTreeNode getLatestAncestor(BinaryTreeNode root, BinaryTreeNode p, BinaryTreeNode q){
        boolean pIsOnLeft = covers(root.getChildren()[0],p);
        boolean qIsOnLeft = covers(root.getChildren()[0],q);
                                            //해당 노드를 기준으로
        if(pIsOnLeft != qIsOnLeft){         //방향이 갈라지면
            return root;
        }else if(pIsOnLeft && qIsOnLeft){   //둘 다 왼쪽이면
            return getLatestAncestor(root.getChildren()[0],p,q);
        }else if(!pIsOnLeft && !qIsOnLeft){ //둘 다 오른쪽이면
            return getLatestAncestor(root.getChildren()[1],p,q);
        }else{
            return null;
        }
    }

    public boolean covers(BinaryTreeNode root, BinaryTreeNode target){
        if(root == null){
            return false;
        }else if(root == target){
            return true;
        }else{
            return covers(root.getChildren()[0],target) || covers(root.getChildren()[1],target);
        }
    }

    public ArrayList<BinaryTreeNode> getNodes() {
        return nodes;
    }
}
