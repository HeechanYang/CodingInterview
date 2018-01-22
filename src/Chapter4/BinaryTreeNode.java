package Chapter4;

/**
 * Created by YangHC on 2018-01-22.
 * <p>
 * Class for node in binary-tree.
 */
public class BinaryTreeNode {
    private String name;
    private BinaryTreeNode[] children = new BinaryTreeNode[2];

    public BinaryTreeNode() {
    }

    public BinaryTreeNode(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return this.name.isEmpty();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BinaryTreeNode[] getChildren() {
        return children;
    }

    public void setChildren(BinaryTreeNode[] children) {
        this.children = children;
    }

    public void addChild(BinaryTreeNode child) {
        for (int i = 0; i < children.length; i++) {
            if (children[i] == null) {
                children[i] = child;
                break;
            } else if (i == 2) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public boolean equals(BinaryTreeNode binaryTreeNode) {
        return this.name.equals(binaryTreeNode.getName());
    }
}
