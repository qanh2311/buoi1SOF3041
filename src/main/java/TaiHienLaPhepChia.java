public class TaiHienLaPhepChia {
    public int PhepChia (int a, int b){
        if ( a < 0 || a > 100 ||b < 0)
            throw new IllegalArgumentException("Gia tri cho phep trong khoang 0 - 100");
        if ( b == 0 )
            throw new ArithmeticException("Khong the chia cho 0");
        return a/b;
    }
}
