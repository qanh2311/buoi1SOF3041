public class PhepChia {
    //  Phép chia 2 số a và b (a <=0, a >= 100) (a và b là các số nguyên)
    public int phepChia(int a, int b){
        if(a < 0 || a > 100 || b < 0)
            throw new IllegalArgumentException("Gia tri phai nam trong khoang tu 0 den 100");
        if(b == 0)
            throw new ArithmeticException("Khong the chia cho 0");
        return a/b;
    }
}
