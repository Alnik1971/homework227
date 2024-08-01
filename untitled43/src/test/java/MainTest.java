import org.junit.Assert;
import org.junit.Test;
import ru.netology.Main;

public class MainTest {
    @Test
    public void hasRepeats_Test() {
        final String argument1 = "CACABABABCCCAABAC";
        final int argument2 = 6;
        final boolean expected = false;

        final boolean result = Main.hasRepeats(argument1, argument2);

        Assert.assertEquals(expected, result);
    }
}
