import com.hepsiburada.base.TestBase;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Android_LoginTest extends TestBase {

    @Before
    public void initialize() throws MalformedURLException {
           androidSetup();
       }
}
