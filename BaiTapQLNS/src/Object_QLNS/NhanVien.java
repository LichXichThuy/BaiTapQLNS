package Object_QLNS;

import java.util.Scanner;

public class NhanVien extends CongTy{
    int maSoNV;
    String hoTen;
    int soDienThoai;
    int soNgayLam;
    int luongMotNgay;
    // Tính lương thang
    public int tinhLuong(int luongMotNgay){
        return luongMotNgay * soNgayLam;
    }
    // Phương thức khởi tạo
    public void themNhanVien(Scanner scanner){
        System.out.print("Mã số nhân viên: ");
        maSoNV = Integer.parseInt(scanner.nextLine());
        System.out.print("Họ và tên: ");
        hoTen = scanner.nextLine();
    }
}
