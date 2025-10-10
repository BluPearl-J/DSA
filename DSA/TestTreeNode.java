import org.junit.Test;
import static org.junit.Assert.*;

public class TreeNodeTest {

    @Test
    public void testNodeCreation() {
        TreeNode rootDataNode = new TreeNode(5);  // block with rootnumber 5

        assertEquals(5, rootDataNode.value);      // Check if number is actually 5
        assertNull(rootDataNode.left);            // Check left is empty
        assertNull(rootDataNode.right);           // Checkright is empty
    }
}
