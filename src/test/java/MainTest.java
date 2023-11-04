import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void countTest(){
        assertEquals(2, Main.count("OGOBAGA".toCharArray()));
        assertEquals(0, Main.count("Hello World".toCharArray()));
        assertEquals(1, Main.count("Hello OGO World".toCharArray()));
        assertEquals(3, Main.count("OGOAGAOGO".toCharArray()));
    }

    @Test
    public void testReplaceOGOandAGA() {
        assertArrayEquals("**B**".toCharArray(), Main.replaceOGOandAGA("OGOBAGA".toCharArray()));
        assertArrayEquals("Hello World".toCharArray(), Main.replaceOGOandAGA("Hello World".toCharArray()));
        assertArrayEquals("Hello ** World".toCharArray(), Main.replaceOGOandAGA("Hello OGO World".toCharArray()));
        assertArrayEquals("******".toCharArray(), Main.replaceOGOandAGA("OGOAGAOGO".toCharArray()));
    }
}
