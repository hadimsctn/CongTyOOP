public class CanBoCoHuu extends NhanVien{
    private static double luongCoBan=1000000;
    private double heSoLuong;
    public double tinhLuong(){
        return luongCoBan*heSoLuong;
    }
    public void tangHeSoLuong(double heSoLuongTang){
        if ((luongCoBan*(heSoLuong+ heSoLuongTang))<100000000){
            heSoLuong=heSoLuong+heSoLuongTang;
        }else{
            System.out.println("Tăng lương cao quá.");
        }
    }
    public void inThongTin(){
        System.out.println(super.getTenNhanVien());
        System.out.println(tinhLuong());
    }
}
