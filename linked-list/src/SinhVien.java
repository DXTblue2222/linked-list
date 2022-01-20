import java.io.Serializable;

public class SinhVien implements Serializable {
    private String maSV;
    private String hoTen;
    private String gioiTinh;
    private int tuoi;
    private float diemTB;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String gioiTinh, int tuoi, float diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.diemTB = diemTB;
    }

    public void hienThiThongTinSV() {
        System.out.println("-----Information's student-----");
        System.out.println("Code: " + this.maSV);
        System.out.println("Full name: " + this.hoTen);
        System.out.println("Gender: " + this.gioiTinh);
        System.out.println("Age: " + this.tuoi);
        System.out.println("Score: " + this.diemTB);
        System.out.println("-----------------------");
    }

    @Override
    public String toString() {
        return "{MSSV: " + this.maSV + ", Name: " + this.hoTen + ", Gender: " + this.gioiTinh + ", Age: " + this.tuoi + ", Score: " + this.diemTB + "}";
    }
}