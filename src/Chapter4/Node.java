package Chapter4;

import java.util.ArrayList;

/**
 * Created by YangHC on 2018-01-22.
 *
 * Class for node in tree.
 */
public class Node {
    private int idx;
    private ArrayList<Node> children = new ArrayList<>();

    public Node(){}

    public Node(int idx) {
        this.idx = idx;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }
}
