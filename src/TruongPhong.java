public class TruongPhong extends CanBoCoHuu{
    private double phuCap;
    public double tinhLuong(){
        return super.tinhLuong() + phuCap;
    }
    public void inThongTin(){
        System.out.println(super.getTenNhanVien());
        System.out.println(tinhLuong());
        System.out.println(phuCap);
    }

}
