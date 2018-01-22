package Chapter4;

/**
 * Created by YangHC on 2018-01-22.
 */
public class Problem4_4 {
    private BinaryTreeNode[] nodes;
    private Tree[] trees;

    public static void main(String[] args) {

    }

    public void setTreeExample1() {
        nodes = new BinaryTreeNode[6];
        trees = new Tree[nodes.length];

        nodes[0] = new BinaryTreeNode("a");
        nodes[1] = new BinaryTreeNode("b");
        nodes[2] = new BinaryTreeNode("c");
        nodes[3] = new BinaryTreeNode("d");
        nodes[4] = new BinaryTreeNode("e");
        nodes[5] = new BinaryTreeNode("f");

        for (int i = 0; i < nodes.length; i++) {
            trees[i].setRoot(nodes[i]);
        }

        Dependency[] dependencies = new Dependency[6];
        dependencies[0] = new Dependency(nodes[0], trees[3]);
        dependencies[1] = new Dependency(nodes[5], trees[1]);
        dependencies[2] = new Dependency(nodes[1], trees[3]);
        dependencies[3] = new Dependency(nodes[5], trees[0]);
        dependencies[4] = new Dependency(nodes[3], trees[2]);
        dependencies[5] = new Dependency(nodes[0], trees[4]);

        for (Dependency dependency : dependencies) {
            BinaryTreeNode parent = dependency.getParent();
            Tree child = dependency.getChild();

            parent.addChild(child);
            child.setParent(parent);
        }

//        nodes[0].getChildren()[0] = nodes[3];   //(a,d)
//        nodes[5].getChildren()[0] = nodes[1];   //(f,b)
//        nodes[1].getChildren()[0] = nodes[3];   //(b,d)
//        nodes[5].getChildren()[1] = nodes[0];   //(f,a)
//        nodes[3].getChildren()[0] = nodes[2];   //(d,c)
//        nodes[0].getChildren()[0] = nodes[4];   //(a,e)


    }

    class Tree {
        private BinaryTreeNode parent;
        private BinaryTreeNode root;
        private int depth=-1;

        public BinaryTreeNode getParent() {
            return parent;
        }

        public void setParent(BinaryTreeNode parent) {
            this.parent = parent;
        }

        public BinaryTreeNode getRoot() {
            return root;
        }

        public void setRoot(BinaryTreeNode root) {
            this.root = root;
        }

        public int getDepth() {
            return depth;
        }

        public void setDepth(int depth) {
            this.depth = depth;
        }

        public boolean isEmpty(){
            return root.isEmpty();
        }
    }

    class Dependency {
        private BinaryTreeNode parent;
        private Tree child;

        public Dependency(BinaryTreeNode parent, Tree child) {
            this.parent = parent;
            this.child = child;
        }

        public BinaryTreeNode getParent() {
            return parent;
        }

        public Tree getChild() {
            return child;
        }
    }

    class BinaryTreeNode {
        private String name;
        private Tree[] children = new Tree[2];

        public BinaryTreeNode(){}

        public BinaryTreeNode(String name) {
            this.name = name;
        }

        public boolean isEmpty(){
            return this.name.isEmpty();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Tree[] getChildren() {
            return children;
        }

        public void addChild(Tree child){
            for(int i=0;i<children.length;i++){
                if(children[i].isEmpty()){
                    children[i]=child;
                    break;
                }
            }
        }
    }
}
