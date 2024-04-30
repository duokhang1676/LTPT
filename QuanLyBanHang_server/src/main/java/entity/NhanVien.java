package entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "nhanvien")
public class NhanVien implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String maNhanVien;
	private String tenNhanVien;
	private LocalDate ngaySinh;
	private boolean gioiTinh;
	private String soDienThoai;
	private String matKhau;
	private LocalDate ngayTao;
	private String ghiChu;
	private TrangThaiNhanVien trangThaiNhanVien;
	private ChucVuNhanVien chucVu;
	public NhanVien(String maNhanVien, String tenNhanVien, LocalDate ngaySinh, boolean gioiTinh, String soDienThoai,
			String matKhau, LocalDate ngayTao, String ghiChu, TrangThaiNhanVien trangThaiNhanVien,
			ChucVuNhanVien chucVu) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.matKhau = matKhau;
		this.ngayTao = ngayTao;
		this.ghiChu = ghiChu;
		this.trangThaiNhanVien = trangThaiNhanVien;
		this.chucVu = chucVu;
	}
	public NhanVien() {
		super();
	}
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public LocalDate getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(LocalDate ngayTao) {
		this.ngayTao = ngayTao;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public TrangThaiNhanVien getTrangThaiNhanVien() {
		return trangThaiNhanVien;
	}
	public void setTrangThaiNhanVien(TrangThaiNhanVien trangThaiNhanVien) {
		this.trangThaiNhanVien = trangThaiNhanVien;
	}
	public ChucVuNhanVien getChucVu() {
		return chucVu;
	}
	public void setChucVu(ChucVuNhanVien chucVu) {
		this.chucVu = chucVu;
	}
	@Override
	public String toString() {
		return "NhanVien [maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", ngaySinh=" + ngaySinh
				+ ", gioiTinh=" + gioiTinh + ", soDienThoai=" + soDienThoai + ", matKhau=" + matKhau + ", ngayTao="
				+ ngayTao + ", ghiChu=" + ghiChu + ", trangThaiNhanVien=" + trangThaiNhanVien + ", chucVu=" + chucVu
				+ "]";
	}
	
	
}
