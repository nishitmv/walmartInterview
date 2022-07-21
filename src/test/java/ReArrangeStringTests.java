import com.test.testproject.StringRearranger;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ReArrangeStringTests {

    @Test
    public void rearrangeStringTest1()
    {
        String input = "aaabbbccc";
        String output = new StringRearranger().rearrangeString(input);

        log.info("Input {}, Output {} ", input, output);


    }

    @Test
    public void rearrangeStringTest2()
    {
        String input = "aaabbbcccc";
        new StringRearranger().rearrangeString(input);

        String output = new StringRearranger().rearrangeString(input);

        log.info("Input {}, Output {} ", input, output);

    }

    @Test
    public void rearrangeStringTest3()
    {
        String input = "bbbaa";

        new StringRearranger().rearrangeString(input);

        String output = new StringRearranger().rearrangeString(input);

        log.info("Input {}, Output {} ", input, output);


    }

    @Test
    public void rearrangeStringTest4()
    {
        String input = "aaaaa";

        new StringRearranger().rearrangeString(input);

        String output = new StringRearranger().rearrangeString(input);

        log.info("Input {}, Output {} ", input, output);


    }

    @Test
    public void rearrangeStringTest5()
    {
        String input = "";

        new StringRearranger().rearrangeString(input);

        String output = new StringRearranger().rearrangeString(input);

        log.info("Input {}, Output {} ", input, output);


    }

}