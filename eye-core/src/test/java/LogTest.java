import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gaozhicheng on 2017/2/17.
 */
public class LogTest {


    private static Logger logger = LoggerFactory.getLogger(LogTest.class);


    public static void main(String[] args) {
        logger.info("test.info");
    }

}
