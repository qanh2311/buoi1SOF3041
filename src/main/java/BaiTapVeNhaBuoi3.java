import java.util.List;

public class BaiTapVeNhaBuoi3 {
    // ------Bai 1------
    public int Tong (String a, String b){
        if ( !a.matches("-?\\d+") || !b.matches("-?\\d+")){
            throw new IllegalArgumentException("Khong phai la so nguyen");
        }
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        if (num1 < 0 || num1 > 100 || num2 < 0 || num2 > 100){
            throw new IllegalArgumentException("Gia tru tu 0 den 100");
        }
        return num1 + num2;
    }

    // ------Bai 2------
    public int PhepChia (int a, int b){
        if (a < 0 || a > 100 || b < 0)
            throw new IllegalArgumentException("Gia tri phai nam trong khoang tu 0 den 100");
        if(b == 0)
            throw new ArithmeticException("Khong the chia cho 0");
        return a/b;
    }

    // ------Bai 3------
    public double trungBinh (List<Integer> list){
        if (list == null || list.isEmpty()){
            throw new ArithmeticException("Danh sach rong");
        }
        double sum = 0;
        for (int value : list){
            sum += value;
        }

        return sum / list.size();
    }

    // ------Bai 4------
    public int GetElementAtIndex(int[] arr, int index){
        return arr [index];
    }

    // ------Bai 5------
    // class profile






}
