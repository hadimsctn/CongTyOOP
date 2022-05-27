public class GiamDoc extends CanBoCoHuu implements QuanLy{
    private double phuCap;
    public double tinhLuong(){
        return super.tinhLuong() +phuCap + tinhHoaHong();
    }
    public double tinhHoaHong(){
        return 0.05* CongTy.loiNhuan;
    }
    public void inThongTin(){
        System.out.println(super.getTenNhanVien());
        System.out.println(tinhLuong());
        System.out.println(tinhHoaHong());
        System.out.println(phuCap);
    }
}
