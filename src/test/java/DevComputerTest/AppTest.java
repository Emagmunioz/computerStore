package DevComputerTest;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class AppTest {

    @Test
    void testApp() {
        assertThat(1, equalTo(1)); 
    }
}