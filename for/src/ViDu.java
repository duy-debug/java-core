public class ViDu {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tôi xin lỗi!" +i);
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println("Tôi yêu bạn <3");
        }
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++)
            {
                System.out.println(i + "x" + j + "=" + (i*j));
            }
            System.out.println();
        }
    }
}

