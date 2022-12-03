package Object_QLNS;

public class TruongPhong extends NhanVien {
    int soNhanVien;

    public TruongPhong(){
        super();
        this.luongMotNgay = 200;
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
