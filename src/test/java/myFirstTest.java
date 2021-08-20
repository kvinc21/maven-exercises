import org.junit.Test;
import static org.junit.Assert.*;

public class myFirstTest {

    @Test
    public void companyNameEquals() {
        String company = "Codeup";
        assertEquals(company, "Codeup");
    }
}