import Object_QLNS.*;

import java.util.*;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static List<NhanVien> lstNhanVien = new ArrayList<>();

    // Tạo danh sách nhan vien thuong
    public static List<NhanVienThuong> lstNhanVienThuong = new ArrayList<>();
    // Tạo danh sách truong phong
    public static List<TruongPhong> lstTruongPhong = new ArrayList<>();
    // Tạo danh sách Giam doc
    public static List<GiamDoc> lstGiamDoc = new ArrayList<>();

    public static void main(String[] args) {
        CongTy congTy = new CongTy();
        int tongLuong = 0;

//         Xuất biểu mẫu lựa chọn
        int choose;
        do {
            showMenu();
            System.out.println("Choose: ");
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                    congTy.nhapThongTinCongTy(scanner);
                    break;
                case 2:
                    phanBoNhanVien();
                    break;
                case 3:
                    System.out.println("1. Thêm nhân viên thường");
                    System.out.println("2. Thêm trưởng phòng");
                    System.out.println("3. Thêm giám đốc");
                    System.out.println("4. Xóa nhân viên thường");
                    System.out.println("5. Xóa trưởng phòng");
                    System.out.println("6. Xóa giám đốc");
                    switch (Integer.parseInt(scanner.nextLine())){
                        case 1:
                            themNhanVienThuong();
                            break;
                        case 2:
                            themTruongPhong();
                            break;
                        case 3:
                            themGiamDoc();
                            break;
                        case 4:
                            xoaNhanVienThuong();
                            break;
                        case 5:
                            xoaTruongPhong();
                            break;
                        case 6:
                            xoaGiamDoc();
                            break;
                    }
                    break;
                case 4:
                    for (NhanVien item: lstNhanVien) item.xuatThongTin();
                    break;
                case 5:
                    for (NhanVien item: lstNhanVien){
                        tongLuong += item.tinhLuong();
                    }

                    System.out.println("Tổng lương trong tháng của công ty là: " + tongLuong);
                    break;
                case 6:
                    int maxLuong = 0;
                    NhanVienThuong nhanVienThuongMaxLuong = new NhanVienThuong();

                    for (NhanVienThuong item: lstNhanVienThuong){
                        if (item.tinhLuong() > maxLuong){
                            maxLuong = item.tinhLuong();
                            nhanVienThuongMaxLuong = item;
                        }
                    }

                    System.out.println("Nhân viên thường có lương cao nhất " + maxLuong + " là: ");
                    nhanVienThuongMaxLuong.xuatThongTin();
                    break;
                case 7:
                    int maxSoNhanVien = 0;
                    TruongPhong truongPhong = new TruongPhong();

                    for (TruongPhong item: lstTruongPhong){
                        if (item.getSoNhanVien() > maxSoNhanVien){
                            maxSoNhanVien = item.getSoNhanVien();
                            truongPhong = item;
                        }
                    }

                    System.out.println("Trưởng phòng có số nhân viên nhiều nhất " + maxSoNhanVien + " là: ");
                    truongPhong.xuatThongTin();
                    break;
                case 8:
                    Collections.sort(lstNhanVien, new Comparator<NhanVien>() {
                        @Override
                        public int compare(NhanVien o1, NhanVien o2) {
                            int comp = o1.getHoTen().compareTo(o2.getHoTen());
                            if (comp >= 0){
                                return 1;
                            }
                            return -1;
                        }
                    });
                    break;
                case 9:
                    Collections.sort(lstNhanVien, Comparator.comparingInt(NhanVien::getLuong).reversed());

                    for (NhanVien item: lstNhanVien){
                        item.xuatThongTin();
                    }
                    break;
                case 10:
                    float maxCoPhan = 0;
                    GiamDoc giamDoc = new GiamDoc();

                    for (GiamDoc item: lstGiamDoc){
                        if (item.getCoPhan() > maxCoPhan){
                            giamDoc = item;
                            maxCoPhan = item.getCoPhan();
                        }
                    }

                    System.out.println("Giám đốc có số cổ phần nhiều nhất là: ");
                    giamDoc.xuatThongTin();
                    break;
                case 11:
                    int loiNhuan = congTy.getDoanhThuThang() - tongLuong;
                    float tongThuNhap;

                    for (GiamDoc item: lstGiamDoc){
                        tongThuNhap = item.getLuong() + item.getCoPhan() * loiNhuan;
                        item.xuatThongTin();
                        System.out.println("Có tổng thu nhập là: " + tongThuNhap);
                    }
                    break;
                case 12:
                    System.out.println("Goodbye!!");
                    break;
            }
        } while (choose != 12);
    }

    public static void showMenu(){
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
        System.out.println("12. Thoát! ");
    }

    // Thêm nhân viên thường
    public static void themNhanVienThuong(){
        NhanVien nhanVien = new NhanVienThuong();
        nhanVien.themNhanVien(scanner);
        // Thêm mã trường phòng nếu có
        System.out.print("Đã có Trưởng phòng quản lý thì nhập 1, chưa thì nhập 0: ");
        int kiemTra = Integer.parseInt(scanner.nextLine());
        if (kiemTra == 1){
            System.out.print("Nhập mã trưởng phòng quản lý: ");
            int maTruongPhong = Integer.parseInt(scanner.nextLine());
            ((NhanVienThuong) nhanVien).setMaTruongPhong(maTruongPhong);
            // Tăng số nhân viên quản lý của trưởng phòng lên 1
            for (TruongPhong item: lstTruongPhong){
                if (item.getMaSoNhanVien() == maTruongPhong)
                    item.setSoNhanVien(item.getSoNhanVien() + 1);
            }
        }
        lstNhanVien.add(nhanVien);
        lstNhanVienThuong.add((NhanVienThuong) nhanVien);
    }
    // Thêm trưởng phòng
    public static void themTruongPhong(){
        NhanVien truongPhong = new TruongPhong();
        truongPhong.themNhanVien(scanner);
        lstNhanVien.add(truongPhong);
        lstTruongPhong.add((TruongPhong) truongPhong);
    }
    // Thêm giám đốc
    public static void themGiamDoc(){
        NhanVien giamDoc = new GiamDoc();
        giamDoc.themNhanVien(scanner);
        lstNhanVien.add(giamDoc);
        lstGiamDoc.add((GiamDoc) giamDoc);
    }
    // Xóa nhân viên thường
    public static void xoaNhanVienThuong(){
        System.out.print("Nhập mã số nhân viên cần xóa: ");
        int maSoXoa = Integer.parseInt(scanner.nextLine());
        int index = 0;
        // Xóa nhân viên trong danh sách nhân viên thường
        NhanVienThuong nhanVienThuong = new NhanVienThuong();

        for (NhanVienThuong item: lstNhanVienThuong){
            if (maSoXoa == item.getMaSoNhanVien()){
                index = lstNhanVienThuong.indexOf(item);
                // Giảm số nhân viên quản lý của trưởng phòng
                int maTruongPhong = item.getMaTruongPhong();
                for (TruongPhong itemTP: lstTruongPhong){
                    if (itemTP.getMaSoNhanVien() == maTruongPhong)
                        itemTP.setSoNhanVien(itemTP.getSoNhanVien() - 1);
                }
            }
        }

        nhanVienThuong = lstNhanVienThuong.remove(index);

        // Xóa nhân viên trong danh sách nhân viên
        NhanVien nhanVien = new NhanVien();
        for (NhanVien item: lstNhanVien){
            if (maSoXoa == item.getMaSoNhanVien()) index = lstNhanVien.indexOf(item);
        }
        nhanVien = lstNhanVien.remove(index);   // Xóa trong danh sách nhân viên
    }
    // Xóa trưởng phòng
    public static void xoaTruongPhong(){
        System.out.print("Nhập mã số nhân viên cần xóa: ");
        int maSoXoa = Integer.parseInt(scanner.nextLine());

        int index = 0;
        TruongPhong truongPhong = new TruongPhong();

        for (TruongPhong item: lstTruongPhong){
            if (maSoXoa == item.getMaSoNhanVien()) index = lstTruongPhong.indexOf(item);
        }
        truongPhong = lstTruongPhong.remove(index); // Xóa trong danh sách trưởng phòng

        NhanVien nhanVien = new NhanVien();
        for (NhanVien item: lstNhanVien){
            if (maSoXoa == item.getMaSoNhanVien()) index = lstNhanVien.indexOf(item);
        }
        nhanVien = lstNhanVien.remove(index);   // Xóa trong danh sách nhân viên
        // Xóa liên kết đến nhân viên thuộc quyền
        for (NhanVienThuong item: lstNhanVienThuong){
            if (maSoXoa == item.getMaTruongPhong()) item.setMaTruongPhong(0);
        }
    }
    // Xóa giám đốc
    public static void xoaGiamDoc(){
        System.out.print("Nhập mã số nhân viên cần xóa: ");
        int index = 0;
        int maSoXoa = Integer.parseInt(scanner.nextLine());

        GiamDoc giamDoc = new GiamDoc();
        for (GiamDoc item: lstGiamDoc){
            if (maSoXoa == item.getMaSoNhanVien()) index = lstGiamDoc.indexOf(item);
        }
        giamDoc = lstGiamDoc.remove(index);

        NhanVien nhanVien = new NhanVien();
        for (NhanVien item: lstNhanVien){
            if (maSoXoa == item.getMaSoNhanVien()) index = lstNhanVien.indexOf(item);
        }
        nhanVien = lstNhanVien.remove(index);   // Xóa trong danh sách nhân viên
    }

    //  Phân bổ nhân viên vào trưởng phòng
    public static void phanBoNhanVien(){
        System.out.print("Nhập mã nhân viên: ");
        int maNhanVien = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mã trưởng phòng: ");
        int maTruongPhong = Integer.parseInt(scanner.nextLine());
        //  Đặt lại mã trưởng phòng cho nhân viên
        for (NhanVienThuong item:lstNhanVienThuong){
            if (item.getMaSoNhanVien() == maNhanVien) item.setMaTruongPhong(maTruongPhong);
        }
        //  Đặt lại số nhân viên cho trưởng phòng
        for (TruongPhong item:lstTruongPhong){
            if (item.getMaSoNhanVien() == maTruongPhong)
                item.setSoNhanVien(item.getSoNhanVien() + 1);
        }
    }

}
