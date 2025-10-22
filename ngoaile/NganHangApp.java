package ngoaile;

public class NganHangApp {

    public static void main(String[] args) {

        System.out.println(" tạo tài khoản");
        TaiKhoanNganHang tkCuaAn = new TaiKhoanNganHang("0011223344", "Nguyễn Văn An", 5000000.0);

        tkCuaAn.hienThiThongTin();

        System.out.println("\n thực hiện gửi 2,000,000 VND");
        tkCuaAn.guiTien(2000000.0);
        tkCuaAn.hienThiThongTin();

        System.out.println("\n thực hiện rút 4,500,000 VND");
        tkCuaAn.rutTien(4500000.0);
        tkCuaAn.hienThiThongTin();

        System.out.println("\nthực hiện rút 3,000,000 VND");
        tkCuaAn.rutTien(3000000.0);
        tkCuaAn.hienThiThongTin();
    }
}
