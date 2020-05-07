import static org.junit.Assert.*;

public class PeselAuthenticationTest {

    @org.junit.Test
    public void checkCorrectness() {
        assertTrue((PeselAuthentication.checkCorrectness("44051401458")));
    }

    @org.junit.Test //
    public void isDigits() {
        assertFalse(PeselAuthentication.isDigits("421fasv23fs"));
    }

    @org.junit.Test
    public void isLengthOK() {
        assertTrue(PeselAuthentication.isLengthOK("12345678910"));
    }
}