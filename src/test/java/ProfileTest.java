import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {
    @Test
    public void tenNull (){
        Profile pr = new Profile(null);
        assertThrows(NullPointerException.class, () -> {
            pr.GetName();
        });
    }

    @Test
    public void tenProfile(){
        Profile pr = new Profile("Pham Thi Quynh Anh");

        assertEquals("Pham Thi Quynh Anh", pr.GetName());
    }
}