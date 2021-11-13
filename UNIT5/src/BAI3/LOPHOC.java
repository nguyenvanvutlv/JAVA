package BAI3;

import java.util.ArrayList;

public class LOPHOC {
    private String MaLH;
    private String TenLH;
    private String NgayMo;
    private ArrayList<SINHVIEN> x = new ArrayList<>();
    private int n;
    private String GiaoVien;
    public LOPHOC(){

    }
    public LOPHOC(String MaLH,String TenLH,String NgayMo,int n,String GiaoVien){
        this.MaLH = MaLH;
        this.TenLH = TenLH;
        this.NgayMo = NgayMo;
        this.n = n;
        this.GiaoVien = GiaoVien;
    }



    public String getMaLH() {
        return MaLH;
    }

    public void setMaLH(String MaLH) {
        this.MaLH = MaLH;
    }

    public String getTenLH() {
        return TenLH;
    }

    public void setTenLH(String TenLH) {
        this.TenLH = TenLH;
    }

    public String getNgayMo() {
        return NgayMo;
    }

    public void setNgayMo(String NgayMo) {
        this.NgayMo = NgayMo;
    }

    public ArrayList<SINHVIEN> getX() {
        return x;
    }

    public void setX(ArrayList<SINHVIEN> x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getGiaoVien() {
        return GiaoVien;
    }

    public void setGiaoVien(String GiaoVien) {
        this.GiaoVien = GiaoVien;
    }

}
