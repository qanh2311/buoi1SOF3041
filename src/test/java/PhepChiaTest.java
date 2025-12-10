import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhepChiaTest {
    private PhepChia div;
    @BeforeEach
    public void SetUp(){
        div = new PhepChia();
    }
    // Ap dung ky thuat phan tich gia tri bien: a (chay tu 0 den 100)
    // min = 0              => hop le
    // min - 1 = -1         => khong hop le     => case ngoai le
    // min + 1 = 2          => hop le
    // max = 100            => hop le
    // max - 1 = 99         => hop le
    // max + 1 = 101        => khong hop le     => case ngoai le

    // case chia cho 0      => khong hop le     => case ngoai le
    // Cac case ap dung phan vung tuong duong lam tuong tu


    // ---------------Case hop le---------------
    @Test
    public void chiaHL_minLa0(){
        int thucTe = div.phepChia(0, 1);
        int mongMuon = 0;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void chiaHL_minCong1La1(){
        int thucTe = div.phepChia(1, 1);
        int mongMuon = 1;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void chiaHL_maxLa100(){
        int thucTe = div.phepChia(100, 1);
        int mongMuon = 100;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void chiaHL_maxTru1La99(){
        int thucTe = div.phepChia(99, 1);
        int mongMuon = 99;
        assertEquals(mongMuon, thucTe);
    }


    // ---------------Case khong hop le---------------
    @Test
    public void chiaKHL_minTru1LaAm1(){
        assertThrows(IllegalArgumentException.class, () -> {
            div.phepChia(-1, 1);
        });
    }

    @Test
    public void chiaKHL_maxCong1La101(){
        assertThrows(IllegalArgumentException.class, () -> {
           div.phepChia(101, 1);
        });
    }

    @Test
    public void chiaKHL_chiaCho0(){
        assertThrows(ArithmeticException.class, () -> {
            div.phepChia(100, 0);
        });
    }


















































}