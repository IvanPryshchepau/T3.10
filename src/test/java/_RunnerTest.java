import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _RunnerTest {
    @Test
    public void testConfigure() throws Exception {

        int[][] mas = new int[][]{
                {1,2,3,4},
                {4,3,2,1},
                {1,2,3,4},
                {4,3,2,1},
        };

        _Runner.configure(4);
        
        assertEquals(_Runner.mas3, mas);

    }

}