package Chapter4;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * Created by YangHC on 2018-01-22.
 */
public class Problem4_3Test {
    private static Problem4_3 p3;

    @Before
    public void makeInstance() throws Exception {
        p3 = new Problem4_3();
    }

    @Test
    public void preOrderTraversalTest1(){
        p3.setTreeExample1();
        p3.preOrderTraversal(p3.getNodes().get(5),0);
        ArrayList<LinkedList<BinaryTreeNode>> sameLevelNodeList = p3.getSameLevelNodeList();
        assertEquals("f",sameLevelNodeList.get(0).get(0).getName());
        assertEquals("b",sameLevelNodeList.get(1).get(0).getName());
        assertEquals("a",sameLevelNodeList.get(1).get(1).getName());
        assertEquals("d",sameLevelNodeList.get(2).get(0).getName());
        assertEquals("e",sameLevelNodeList.get(2).get(1).getName());
        assertEquals("c",sameLevelNodeList.get(3).get(0).getName());
    }
    @Test
    public void preOrderTraversalTest2(){
        p3.setTreeExample2();
        p3.preOrderTraversal(p3.getNodes().get(0),0);
        ArrayList<LinkedList<BinaryTreeNode>> sameLevelNodeList = p3.getSameLevelNodeList();
        assertEquals("a",sameLevelNodeList.get(0).get(0).getName());
        assertEquals("b",sameLevelNodeList.get(1).get(0).getName());
        assertEquals("c",sameLevelNodeList.get(1).get(1).getName());
        assertEquals("d",sameLevelNodeList.get(2).get(0).getName());
        assertEquals("e",sameLevelNodeList.get(2).get(1).getName());
        assertEquals("f",sameLevelNodeList.get(2).get(2).getName());
        assertEquals("g",sameLevelNodeList.get(3).get(0).getName());
        assertEquals("h",sameLevelNodeList.get(3).get(1).getName());
        assertEquals("i",sameLevelNodeList.get(3).get(2).getName());
    }


}
