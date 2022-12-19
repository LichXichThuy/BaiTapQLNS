package Object_QLNS;

import java.util.Scanner;

public class CongTy {
    String tenCongTy;
    int maSoThue;
    int doanhThuThang;
    // Phương thức nhập thông tin công ty
    public void nhapThongTinCongTy(Scanner scanner){
        System.out.print("Tên công ty: ");
        tenCongTy = scanner.nextLine();
        System.out.print("Mã số thuế: ");
        maSoThue = Integer.parseInt(scanner.nextLine());
        System.out.print("Doanh thu tháng này: ");
        doanhThuThang = Integer.parseInt(scanner.nextLine());
    }
    public CongTy(){

    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public int getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(int maSoThue) {
        this.maSoThue = maSoThue;
    }

    public int getDoanhThuThang() {
        return doanhThuThang;
    }

    public void setDoanhThuThang(int doanhThuThang) {
        this.doanhThuThang = doanhThuThang;
    }
}
