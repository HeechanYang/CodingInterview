package Chapter4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by YangHC on 2018-01-22.
 *
 * [문제 4-3]
 * 깊이의 리스트 : 이진 트리가 주어졌을 때 같은 깊이에 있는 노드를 연결리스트로
 * 연결해 주는 알고리즘을 설계하라. 즉, 트리의 깊이가 D라면 D개의 연결리스트를 만들어야한다.
 */
public class Problem4_3 {
    private ArrayList<BinaryTreeNode> nodes;
    private ArrayList<LinkedList<BinaryTreeNode>> sameLevelNodeList;

    public Problem4_3(){
        nodes = new ArrayList<>();
        sameLevelNodeList = new ArrayList<>();
    }

    public static void main(String[] args) {
        Problem4_3 p3 = new Problem4_3();
        p3.setTreeExample3();
        p3.preOrderTraversal(p3.getNodes().get(0),0);
        p3.printSameLevelNodes();
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

    public void preOrderTraversal(BinaryTreeNode root, int level) {
        if (root == null) {
            return;
        } else {
            if (sameLevelNodeList.size() < (level + 1)) {
                sameLevelNodeList.add(new LinkedList<>());
            }
            LinkedList<BinaryTreeNode> thisLevelNodeList = sameLevelNodeList.get(level);
            thisLevelNodeList.add(root);

            preOrderTraversal(root.getChildren()[0], level + 1);
            preOrderTraversal(root.getChildren()[1], level + 1);
        }
    }

    public void printSameLevelNodes() {
        for (int i = 0; i < sameLevelNodeList.size(); i++) {
            System.out.println("==========Level " + i + "==========");
            for (int j = 0; j < sameLevelNodeList.get(i).size(); j++) {
                System.out.print(sameLevelNodeList.get(i).get(j).getName()+" ");
            }
            System.out.println("");
        }
    }

    public ArrayList<BinaryTreeNode> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<BinaryTreeNode> nodes) {
        this.nodes = nodes;
    }

    public ArrayList<LinkedList<BinaryTreeNode>> getSameLevelNodeList() {
        return sameLevelNodeList;
    }

    public void setSameLevelNodeList(ArrayList<LinkedList<BinaryTreeNode>> sameLevelNodeList) {
        this.sameLevelNodeList = sameLevelNodeList;
    }
}
