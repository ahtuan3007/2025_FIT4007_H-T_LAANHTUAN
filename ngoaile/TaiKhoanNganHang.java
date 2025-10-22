package ngoaile;

public class TaiKhoanNganHang {

    private String soTaiKhoan;
    private String tenChuKhoan;
    private double soDu;

    public TaiKhoanNganHang(String soTaiKhoan, String tenChuKhoan, double soDuBanDau) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuKhoan = tenChuKhoan;
        this.soDu = soDuBanDau;
    }

    public void guiTien(double soTien) {
        this.soDu = this.soDu + soTien;
        System.out.println("Giao dịch thành công. Đã gửi: " + soTien);
    }

    public void rutTien(double soTien) {
        this.soDu = this.soDu - soTien;
        System.out.println("Giao dịch thành công. Đã rút: " + soTien);
    }

    public void hienThiThongTin() {
        System.out.println("Chủ tài khoản: " + tenChuKhoan);
        System.out.println("Số tài khoản: " + soTaiKhoan);
        System.out.printf("Số dư hiện tại: %,.0f VND\n", soDu);
    }
}