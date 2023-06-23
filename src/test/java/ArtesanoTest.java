import ch.qos.logback.classic.Logger;
import com.murugosa.service.ArtesanoService;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ArtesanoTest {

    public static org.junit.platform.commons.logging.Logger Logger = LoggerFactory.getLogger(ArtesanoService.class);
    public void test1(){
        Logger.info(()->"Test case Executing");
        assertEquals(true,true);
    }

}
