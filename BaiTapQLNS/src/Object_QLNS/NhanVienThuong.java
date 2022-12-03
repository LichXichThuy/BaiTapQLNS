package Object_QLNS;

public class NhanVienThuong extends NhanVien{
    int maTruongPhong;

    public NhanVienThuong(){
        super();
        this.luongMotNgay = 100;
    }

    public int getMaTruongPhong() {
        return maTruongPhong;
    }

    public void setMaTruongPhong(int maTruongPhong) {
        this.maTruongPhong = maTruongPhong;
    }
}
