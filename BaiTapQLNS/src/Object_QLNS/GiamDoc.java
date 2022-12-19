package Object_QLNS;

import java.util.Scanner;

public class GiamDoc extends NhanVien{
    float coPhan;

    public GiamDoc(){
        super();
        this.luongMotNgay = 300;
    }
    public GiamDoc(int maSoNhanVien, String hoTen, int soDienThoai, int soNgayLam, float coPhan){
        super(maSoNhanVien, hoTen, soDienThoai, soNgayLam);
        this.coPhan = coPhan;
        this.luongMotNgay = 300;
    }
    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println(" Lương một ngày: " + luongMotNgay + "  Số cổ phần: " + coPhan);
    }
    @Override
    public void themNhanVien(Scanner scanner) {
        super.themNhanVien(scanner);
        System.out.print("Cổ phần của giám đốc trong công ty: ");
        coPhan = Float.parseFloat(scanner.nextLine());
    }

    public float getCoPhan() {
        return coPhan;
    }

    public void setCoPhan(float coPhan) {
        this.coPhan = coPhan;
    }
}