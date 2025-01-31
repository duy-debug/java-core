public class TacGia {
    private String TenTacGia;
    private Day NgaySinh;
    public TacGia(String TenTacGia, Day NgaySinh) {
        TenTacGia = TenTacGia;
        NgaySinh = NgaySinh;
    }
    public String getTenTacGia() {
        return TenTacGia;
    }
    public void setTenTacGia(String tenTacGia) {
        TenTacGia = tenTacGia;
    }
    public Day getNgaySinh() {
        return NgaySinh;
    }
    public void setNgaySinh(Day ngaySinh) {
        NgaySinh = ngaySinh;
    }
}
