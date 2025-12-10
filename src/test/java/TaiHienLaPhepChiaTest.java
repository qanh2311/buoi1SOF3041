import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaiHienLaPhepChiaTest {

    private TaiHienLaPhepChia div;
    @BeforeEach
    public void setUp(){
        div = new TaiHienLaPhepChia();
    }


    // Bien
    @Test
    public void minLaAm1 (){
        assertThrows(IllegalArgumentException.class, () ->{
            div.PhepChia(-1, 1);
        });
    }

    @Test
    public void minLa0 (){
        int thucTe = div.PhepChia(0, 1);
        int mongMuon = 0;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void minLa1 (){
        int thucTe = div.PhepChia(1, 1);
        int mongMuon = 1;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void maxLa99 (){
        int thucTe = div.PhepChia(99, 1);
        int mongMuon = 99;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void maxLa100 (){
        int thucTe = div.PhepChia(100, 1);
        int mongMuon = 100;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void maxLa101 (){
        assertThrows(IllegalArgumentException.class, () -> {
            div.PhepChia(101, 1);
        });
    }

    // Phan vung tuong duong
    @Test
    public void bienDuoi (){
        assertThrows(IllegalArgumentException.class, () -> {
            div.PhepChia(-50 , 1);
        });
    }

    @Test
    public void bienGiua (){
        int thucTe = div.PhepChia(50, 1);
        int mongMuon = 50;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void bienTren (){
        assertThrows(IllegalArgumentException.class, () -> {
            div.PhepChia(150 , 1);
        });
    }

    // Chia cho 0
    @Test
    public void chiaCho0(){
        assertThrows(ArithmeticException.class, () -> {
            div.PhepChia(100, 0);
        });
    }
}