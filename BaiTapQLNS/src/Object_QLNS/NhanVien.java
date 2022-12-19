package Object_QLNS;

import java.util.Scanner;

public class NhanVien {
    int maSoNhanVien;
    String hoTen;
    int soDienThoai;
    int soNgayLam;
    int luongMotNgay;
    int luong;
    // Tính lương thang
    public int tinhLuong(){
        return luongMotNgay * soNgayLam;
    }

    // Phương thức khởi tạo
    public NhanVien(){

    }

    public void themNhanVien(Scanner scanner){
        System.out.print("Mã số nhân viên: ");
        maSoNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.print("Họ và tên: ");
        hoTen = scanner.nextLine();
        System.out.print("Số điện thoại: ");
        soDienThoai = Integer.parseInt(scanner.nextLine());
        System.out.print("Số ngày làm: ");
        soNgayLam = Integer.parseInt(scanner.nextLine());
    }
    public  NhanVien(int maSoNhanVien, String hoTen, int soDienThoai, int soNgayLam){
        this.maSoNhanVien = maSoNhanVien;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soNgayLam = soNgayLam;

    }

    public void xuatThongTin(){
        String xuat = String.format("Mã số: %-4d Họ tên: %-20s Số điện thoại: %-15d Số ngày làm việc: %-4d",
                maSoNhanVien, hoTen, soDienThoai, soNgayLam);
        System.out.print(xuat);
        System.out.print(" Lương tháng: " + getLuong());
    }
    public int getMaSoNhanVien() {
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

    public int getLuong() {
        return tinhLuong();
    }
}
