package Chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * Created by YangHC on 2018-01-15.
 */
public class Problem4_7 {
    private static final int MAX_CHILDREN_NUM = 100;
    public Node projects[];

    public static void main(String[] args) {
        Problem4_7 p7 = new Problem4_7();
        char[] projectsName = {'a', 'b', 'c', 'd', 'e', 'f'};
        p7.projects = new Node[projectsName.length];
        for (int i = 0; i < p7.projects.length; i++) {
            p7.projects[i] = new Node(projectsName[i]);
        }

        p7.getNode('a').addParent(p7.getNode('d'));
        p7.getNode('f').addParent(p7.getNode('b'));
        p7.getNode('b').addParent(p7.getNode('d'));
        p7.getNode('f').addParent(p7.getNode('a'));
        p7.getNode('d').addParent(p7.getNode('c'));
    }

    public int indexOf(char name) {
        for (int i = 0; i < projects.length; i++) {
            if (projects[i].getName() == name) {
                return i;
            }
        }
        return -1;
    }

    public Node getNode(char name){
        for (Node project : projects) {
            if (project.getName() == name) {
                return project;
            }
        }
        return null;
    }

    public void printProcedure(){
        for(Node project : projects){
            Stack<Node> stack = new Stack<>();
            Node temp = project;
            stack.add(temp);
        }
    }

    static class Node {
        private char name;
        private ArrayList<Node> parents = new ArrayList<>();

        public boolean isPerformed;

        public Node() {
        }

        public Node(char name) {
            this.name = name;
        }

        public char getName() {
            return name;
        }

        public void setName(char name) {
            this.name = name;
        }

        public void addParent(Node parent) {
            parents.add(parent);
        }
    }
}
