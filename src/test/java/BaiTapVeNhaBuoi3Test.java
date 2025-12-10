import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BaiTapVeNhaBuoi3Test {
    private BaiTapVeNhaBuoi3 bt;
    @BeforeEach
    public void setUp(){
        bt = new BaiTapVeNhaBuoi3();
    }

    // --------- Test Bai 1 ---------
    @Test
    public void tongVungDuoi (){
        assertThrows(IllegalArgumentException.class, () -> {
            bt.Tong("-10", "50");
        });
    }

    @Test
    public void tongVungGiua (){
        int thucTe = bt.Tong("20", "30");
        int mongMuon = 50;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void tongVungTren (){
        assertThrows(IllegalArgumentException.class, () -> {
            bt.Tong("49", "120");
        });
    }

    @Test
    public void tongNhapChu (){
        assertThrows(IllegalArgumentException.class, () -> {
            bt.Tong("abc", "80");
        });
    }

    @Test
    public void tongThapPhan (){
        assertThrows(IllegalArgumentException.class, () -> {
            bt.Tong("5.5", "90");
        });
    }

    // --------- Test Bai 2 ---------

    @Test
    public void chia_min(){
        int thucTe = bt.PhepChia(0 , 1);
        int mongMuon = 0;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void chia_max(){
        int thucTe = bt.PhepChia( 100 , 1);
        int mongMuon = 100;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void chia_minCong1(){
        int thucTe = bt.PhepChia( 1 , 1);
        int mongMuon = 1;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void chia_maxTru1(){
        int thucTe = bt.PhepChia( 99, 1);
        int mongMuon = 99;
        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void chia_minTru1(){
        assertThrows(IllegalArgumentException.class, () -> {
            bt.PhepChia(-1, 1);
        });
    }

    @Test
    public void chia_maxCong1(){
        assertThrows(IllegalArgumentException.class, () -> {
            bt.PhepChia(101, 1);
        });
    }


    @Test
    public void chiaVoi0(){
        assertThrows(ArithmeticException.class, () -> {
            bt.PhepChia(50, 0);
        });
    }

    // --------- Test Bai 3 ---------
    @Test
    public void danhSachRong(){
        List<Integer> list = new ArrayList<>();

        assertThrows(ArithmeticException.class, () -> {
            bt.trungBinh(list);
        });
    }

    @Test
    public void danhSachNull(){
        List<Integer> list = null;

        assertThrows(ArithmeticException.class, () -> {
            bt.trungBinh(list);
        });
    }

    @Test
    public void phanVungHopLe() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);

        double thucTe = bt.trungBinh(list);
        double mongMuon = 5.0;

        assertEquals(mongMuon, thucTe);
    }

    @Test
    public void SoAm() {
        List<Integer> list = new ArrayList<>();
        list.add(-2);
        list.add(-4);
        list.add(-6);

        double thucTe = bt.trungBinh(list);
        double mongMuon = -4.0;

        assertEquals(mongMuon, thucTe);
    }

    // --------- Test Bai 4 ---------
    @Test
    public void vuotPhamVi(){
        int [] arr = {1, 2, 3};

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            bt.GetElementAtIndex(arr, 5);
        });
    }

    @Test
    public void trongPhamVi(){
        int [] arr = {23, 11, 2008};
        int thucTe = bt.GetElementAtIndex(arr, 2);
        int mongMuon = 2008;

        assertEquals(mongMuon, thucTe);
    }

















}