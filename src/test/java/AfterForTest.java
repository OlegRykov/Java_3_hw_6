import hw6.Main;
import org.junit.Assert;
import org.junit.Test;

public class AfterForTest {

    @Test(expected = RuntimeException.class)
    public void testException() {
        Main.afterFor(new int[]{1, 1, 2, 2, 175});
    }

    @Test
    public void testNewArr() {
        Assert.assertArrayEquals(new int[]{17, 45}, Main.afterFor(new int[]{1, 4, 5, 5, 4, 17, 45}));
    }

    @Test
    public void testNewArrNull() {
        Assert.assertArrayEquals(new int[0], Main.afterFor(new int[]{1, 4, 5, 5, 4, 17, 45, 4}));
    }
}
