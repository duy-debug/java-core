public class Sach {
    private String TenSach;
    private double GiaBan;
    private int NamXuatBan;
    private TacGia TacGia;
    public Sach(String tenSach, double giaBan, int namXuatBan, TacGia tacGia) {
        TenSach = tenSach;
        GiaBan = giaBan;
        NamXuatBan = namXuatBan;
        TacGia = tacGia;
    }
    public String getTenSach() {
        return TenSach;
    }
    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }
    public double getGiaBan() {
        return GiaBan;
    }
    public void setGiaBan(double giaBan) {
        GiaBan = giaBan;
    }
    public int getNamXuatBan() {
        return NamXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        NamXuatBan = namXuatBan;
    }
    public TacGia getTacGia() {
        return TacGia;
    }
    public void setTacGia(TacGia tacGia) {
        TacGia = tacGia;
    }
    public void InTenSach() {
        System.out.println(this.TenSach);
    }
    public boolean KiemTraCungNamXuatBan(Sach SachKhac) {
//        if(this.NamXuatBan == SachKhac.NamXuatBan) {
//            return true;
//        }
//        else{
//            return false;
//        }
        return this.NamXuatBan == SachKhac.NamXuatBan;
    }
    public double GiaSauKhiGiamGia(double x){
        return this.GiaBan * (1-x/100);
    }
}
