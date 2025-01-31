public class Main {
    public static void main(String[] args) {
        Day day1 = new Day(30,10,2005);
        Day day2 = new Day(29,1,2025);
        TacGia tacGia1 = new TacGia("Nguyễn Văn A", day1);
        TacGia tacGia2 = new TacGia("Nguyễn Văn B", day2);
        Sach sach1 = new Sach("Lập Trình Hướng Đối Tượng", 200000, 2025, tacGia1);
        Sach sach2 = new Sach("Thiết Kế Web", 100000, 2025, tacGia2);
        sach1.InTenSach();
        sach2.InTenSach();
        System.out.println("So sanh NXB sach 1 voi sach 2: " +sach1.KiemTraCungNamXuatBan(sach2));
        System.out.println("Sach 1 giam 10%: " + sach1.GiaSauKhiGiamGia(10));
        System.out.println("Sach 2 giam 20%: " + sach2.GiaSauKhiGiamGia(20));
    }
}