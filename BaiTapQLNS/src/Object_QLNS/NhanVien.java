package Object_QLNS;

import java.util.Scanner;

public class NhanVien extends CongTy{
    int maSoNhanVien;
    String hoTen;
    int soDienThoai;
    int soNgayLam;
    int luongMotNgay;
    // Tính lương thang
    public int tinhLuong(){
        return luongMotNgay * soNgayLam;
    }
    // Phương thức khởi tạo
    public NhanVien(){
        super();
    }
    public void themNhanVien(Scanner scanner){
        System.out.print("Mã số nhân viên: ");
        maSoNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.print("Họ và tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Số điện thoại: ");
        soDienThoai = scanner.nextInt();
        System.out.print("Số ngày làm: ");
        soNgayLam = scanner.nextInt();
    }

    public int getMaSoNV() {
        return maSoNhanVien;
    }

    public void setMaSoNhanVien(int maSoNhanVien) {
        this.maSoNhanVien = maSoNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public int getLuongMotNgay() {
        return luongMotNgay;
    }

    public void setLuongMotNgay(int luongMotNgay) {
        this.luongMotNgay = luongMotNgay;
    }
}
