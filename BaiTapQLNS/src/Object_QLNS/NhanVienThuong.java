package Object_QLNS;

import java.util.Scanner;

public class NhanVienThuong extends NhanVien{
    int maTruongPhong;

    public NhanVienThuong(){
        super();
        this.luongMotNgay = 100;
    }
    public NhanVienThuong(int maSoNhanVien, String hoTen, int soDienThoai, int soNgayLam, int maTruongPhong){
        super(maSoNhanVien, hoTen, soDienThoai, soNgayLam);
        this.maTruongPhong = maTruongPhong;
        this.luongMotNgay = 100;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();

        System.out.println(" Lương một ngày: " + luongMotNgay + "  Mã trưởng phòng: " + maTruongPhong);
    }
    public int getMaTruongPhong() {
        return maTruongPhong;
    }
    public void setMaTruongPhong(int maTruongPhong) {
        this.maTruongPhong = maTruongPhong;
    }

    public void setMaTruongPhong(Integer integer) {
    }
}
