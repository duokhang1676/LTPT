package entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "khachhang")
public class KhachHang implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String maKhachHang;
	private String tenKhachHang;
	private LocalDate ngaySinh;
	private boolean gioiTinh;
	private String soDienThoai;
	private int diemThuong;
	private LocalDate ngayTao;
	private String ghiChu;
	private TrangThaiKhachHang trangThaiKH;
	
	public KhachHang(String maKhachHang, String tenKhachHang, LocalDate ngaySinh, boolean gioiTinh, String soDienThoai,
			int diemThuong, LocalDate ngayTao, String ghiChu, TrangThaiKhachHang trangThaiKH) {
		super();
		this.maKhachHang = maKhachHang;
		this.tenKhachHang = tenKhachHang;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.diemThuong = diemThuong;
		this.ngayTao = ngayTao;
		this.ghiChu = ghiChu;
		this.trangThaiKH = trangThaiKH;
	}

	public KhachHang() {
		super();
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
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

	public int getDiemThuong() {
		return diemThuong;
	}

	public void setDiemThuong(int diemThuong) {
		this.diemThuong = diemThuong;
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

	public TrangThaiKhachHang getTrangThaiKH() {
		return trangThaiKH;
	}

	public void setTrangThaiKH(TrangThaiKhachHang trangThaiKH) {
		this.trangThaiKH = trangThaiKH;
	}
	
	
	
	
}
