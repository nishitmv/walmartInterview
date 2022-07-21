import com.test.SynchronizedSortedStrings.PrintInorder;
import org.junit.jupiter.api.Test;

public class SynchronizedIntegersTest {

    @Test
    public void testSyncronized() throws InterruptedException {
        int k =5;
        int numTimes = 10;
        new PrintInorder().printIntegersSychronizedRoundRobin(k, numTimes);
    }

}
