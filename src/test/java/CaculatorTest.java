import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaculatorTest {
    //Thuc hien viet testcase o class nay
    //Luu y de viet duoc testcase cac ban can quan tam den annotation: @Test
    //1 so annotation cho testcase sex cos: @Test, @Displayname, @Disabled, @Timeout, @RepeatedTest
    //@Test -- Danh dau 1 phuong thuc la testcase
    //@Displayname -- Gan ten mo ta de hieu thay vi ten ham, Vidu: @Displayname ("Ten de doc")
    //@Disabled -- Bo qua (tam ngung) test nay, Vidu: @Disabled ("Ly do")
    //@Timeout -- Gioi han thoi gian chay (fail neu nhu qua thoi gian), Vidu: @Timeout (value = 2)
    //@RepeatedTest -- Lap lai test nhieu lan, Vidu: @RepeatedTest(3) -- Lpa lai test 3 lan

    @Test
    public void add_1(){
        Caculator cl = new Caculator();
        int thucte = cl.add(3, 5);
        int mongdoi = 8;
        assertEquals(thucte, mongdoi);
    }
    @Test
    public void add_2(){
        Caculator cl = new Caculator();
        int thucte = cl.add(7, 12);
        int mongdoi = 19;
        assertEquals(thucte, mongdoi);
    }
    @Test
    public void tru(){
        Caculator cl = new Caculator();
        int thucte = cl.tru(10, 4);
        int mondoi = 6;
        assertEquals(thucte, mondoi);
    }
    @Test
    public void nhan(){
        Caculator cl = new Caculator();
        int thucte = cl.nhan(10, 4);
        int mondoi = 40;
        assertEquals(thucte, mondoi);
    }
    @Test
    public void chia(){
        Caculator cl = new Caculator();
        int thucte = cl.chia(12, 4);
        int mondoi = 3;
        assertEquals(thucte, mondoi);
    }
}