package Object_QLNS;

public class TruongPhong extends NhanVien {
    int soNhanVien;

    public TruongPhong(){
        super();
        this.luongMotNgay = 200;
        //  Khởi tạo số nhân viên thuộc quyền bằng 0
        this.soNhanVien = 0;
    }
    public TruongPhong(int maSoNhanVien, String hoTen, int soDienThoai, int soNgayLam, int soNhanVien){
        super(maSoNhanVien, hoTen, soDienThoai, soNgayLam);
        this.soNhanVien = soNhanVien;
        this.luongMotNgay = 200;
    }
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println(" Lương một ngày: " + luongMotNgay + "  Số nhân viên: " + soNhanVien);
    }

    @Override
    public int tinhLuong() {
        return (luongMotNgay * soNgayLam) + (100 * soNhanVien);
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }
}
