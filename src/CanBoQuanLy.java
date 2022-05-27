public class CanBoQuanLy extends CanBoCoHuu implements QuanLy{
    public double tinhLuong(){
        return super.tinhLuong() + tinhHoaHong();
    }
    public double tinhHoaHong(){

        return 0.002* CongTy.loiNhuan;
    }
    public void inThongTin(){
        System.out.println(super.getTenNhanVien());
        System.out.println(tinhLuong());
        System.out.println(tinhHoaHong());
    }
}
