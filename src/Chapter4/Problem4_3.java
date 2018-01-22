package Chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by YangHC on 2018-01-22.
 */
public class Problem4_3 {
    private BinaryTreeNode[] nodes;
    private ArrayList<BinaryTreeNode>[] sameRankNodeList;
    private Queue<BinaryTreeNode> queue;

    public static void main(String[] args) {
        Problem4_3 p3 = new Problem4_3();
        BinaryTreeNode[] nodes = p3.getNodes();
        ArrayList<BinaryTreeNode>[] sameRankNodeList = p3.getSameRankNodeList();

        p3.setTreeExample1();


    }

    public void setTreeExample1() {
        queue = new LinkedList<>();

        nodes = new BinaryTreeNode[6];
        nodes[0] = new BinaryTreeNode("a");
        nodes[1] = new BinaryTreeNode("b");
        nodes[2] = new BinaryTreeNode("c");
        nodes[3] = new BinaryTreeNode("d");
        nodes[4] = new BinaryTreeNode("e");
        nodes[5] = new BinaryTreeNode("f");

        nodes[0].getChildren()[0] = nodes[3];   //(a,d)
        nodes[5].getChildren()[0] = nodes[1];   //(f,b)
        nodes[1].getChildren()[0] = nodes[3];   //(b,d)
        nodes[5].getChildren()[1] = nodes[0];   //(f,a)
        nodes[3].getChildren()[0] = nodes[2];   //(d,c)
        nodes[0].getChildren()[0] = nodes[4];   //(a,e)

        sameRankNodeList = new ArrayList[6];
        for (ArrayList arrayList : sameRankNodeList) {
            arrayList = new ArrayList();
        }
    }

    public void printRank() {
        sameRankNodeList[0].add(nodes[5]);      //f노드를 삽입
        BinaryTreeNode temp = sameRankNodeList[0].get(0);
        for (int i = 0; i < sameRankNodeList.length && sameRankNodeList[i].size() > 0; i++) {
            ArrayList<BinaryTreeNode> thisRank = sameRankNodeList[i];
            ArrayList<BinaryTreeNode> nextRank = sameRankNodeList[i+1];
            System.out.println("Depth : " + i);

            for(int j=0;j<thisRank.size();j++){
                if(!thisRank.get(j).isEmpty()){
                    nextRank.add(thisRank.get(j));
                }
            }
        }

    }

    public BinaryTreeNode[] getNodes() {
        return nodes;
    }

    public void setNodes(BinaryTreeNode[] nodes) {
        this.nodes = nodes;
    }

    public ArrayList<BinaryTreeNode>[] getSameRankNodeList() {
        return sameRankNodeList;
    }

    public void setSameRankNodeList(ArrayList<BinaryTreeNode>[] sameRankNodeList) {
        this.sameRankNodeList = sameRankNodeList;
    }
}
