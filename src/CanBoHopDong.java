public class CanBoHopDong extends NhanVien{
    private double luongHopDong;
    public double tinhLuong(){
        return luongHopDong;
    }
    public void inThongTin(){
        System.out.println(super.getTenNhanVien());
        System.out.println(tinhLuong());
    }
}
