import Object_QLNS.CongTy;
import Object_QLNS.GiamDoc;
import Object_QLNS.NhanVienThuong;
import Object_QLNS.TruongPhong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo danh sách nhan vien thuong
        List<NhanVienThuong> lstNhanVienThuong = new ArrayList<>();
        // Tạo danh sách truong phong
        List<TruongPhong> lstTruongPhong = new ArrayList<>();
        // Tạo danh sách Giam doc
        List<GiamDoc> lstGiamDoc = new ArrayList<>();

        // Xuất biểu mẫu lựa chọn
        System.out.println("1. Nhập thông tin công ty");
        System.out.println("2. Phân bổ nhân viên vào trưởng phòng");
        System.out.println("3. Thêm, xóa thông tin một nhân sự");
        System.out.println("4. Xuất ra thông tin toàn bộ nhân sự trong công ty");
        System.out.println("5. Tính và xuất tổng lương cho toàn công ty");
        System.out.println("6. Tìm nhân viên thường có lương cao nhất");
        System.out.println("7. Tìm trưởng phòng có số lượng nhân viên dưới quyền nhiều nhất");
        System.out.println("8. Sắp xếp nhân viên toàn công ty theo tứ tự abc");
        System.out.println("9. Sắp xếp nhân viên toàn công ty theo tứ tự lương giảm dần");
        System.out.println("10. Tìm giám đốc có số lượng cổ phần nhiều nhất");
        System.out.println("11. Tính và xuất tổng thu nhập của từng Giám đốc");
        // Lựa chọn
        switch (Integer.parseInt(scanner.nextLine())){
            case 1:
                CongTy congTy = new CongTy();
                congTy.nhapThongTinCongTy(scanner);
                break;
            case 2:
                phanBoNhanVien(scanner);
        }
    }

    //  Phân bổ nhân viên vào trưởng phòng
    public static void phanBoNhanVien(Scanner scanner){
        System.out.print("Nhập mã nhân viên: ");
        int maNhanVien = scanner.nextInt();
        //  Kiểm tra nhân viên có thông tin hay chưa?

        System.out.print("Nhập mã trưởng phòng: ");
        int maTruongPhong = scanner.nextInt();

    }


}
