import hw6.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MassTestOneOrFor {
    private int[] arr;
    boolean b;

    public MassTestOneOrFor(boolean b, int[] arr) {
        this.b = b;
        this.arr = arr;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {true, new int[]{1, 1, 1, 4, 4, 1, 4, 4}},
                {false, new int[]{1, 1, 1, 1, 1, 1}},
                {true, new int[]{4, 4, 4, 1, 4}},
                {false, new int[]{1, 4, 4, 1, 1, 4, 3}}
        });
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(b, Main.oneOrFor(arr));
    }
}
