public class CongTy {
    private String tenCongTy;
    private NhanVien[] nhanViens;
    private int soNhanVien;
    public static int SO_NV_MAX;
    public static double loiNhuan;
    public void inThongTin(){
        System.out.println(tenCongTy);
        for(NhanVien lnv: this.nhanViens){
            lnv.inThongTin();
        }
    }
    public double tinhTongLuong(){
        double tongLuong=0;
        for (NhanVien nv:
             this.nhanViens) {
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }
    public boolean themNV(NhanVien nhanVien){
        if(this.soNhanVien==SO_NV_MAX){
            return false;
        }
        this.nhanViens[this.soNhanVien]=nhanVien;
        this.soNhanVien++;
        return true;
    }

}
