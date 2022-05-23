import com.hepsiburada.bases.BaseTest;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Android_LoginTest extends BaseTest {

    @Before
    public void initialize() throws MalformedURLException {
           androidSetup();
       }
}
