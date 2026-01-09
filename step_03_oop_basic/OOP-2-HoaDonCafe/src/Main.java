public class Main {
    public static void main(String[] args) {
        HoaDonCafe hd = new HoaDonCafe("Trung nguyen",100000,5.5);
        System.out.println("Tong tien: " +hd.TinhTongTien());
        System.out.println("Kiem tra khoi luong > 2kg " + hd.KiemTraKhoiLuong(2));
        System.out.println("Kiem tra khoi luong > 1kg " + hd.KiemTraKhoiLuong(1));
        System.out.println("Kiem tra tong tien > 500k " + hd.KiemTraTongTienLonHon500k());
        System.out.println("Giam gia cua hd: " + hd.GiamGiaTien(10));
        System.out.println("Tong tien sau khi giam gia: " + hd.GiaSauKhiGiam(10));
    }
}