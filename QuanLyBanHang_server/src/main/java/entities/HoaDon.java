package entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "hoadon")
public class HoaDon implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String maHoaDon;
	private LocalDateTime thoiGianLapHoaDon;
	
	@ManyToOne
	@JoinColumn(name = "maNhanVien")
	private NhanVien nhanVien;
	@ManyToOne
	@JoinColumn(name = "maKhachHang")
	private KhachHang khachHang;
	private double tienKhachTra;
	private int diemQuyDoi;
	private String ghiChu;
	private TrangThaiHoaDon trangThaiHoaDon;
	public HoaDon(String maHoaDon, LocalDateTime thoiGianLapHoaDon, NhanVien nhanVien, KhachHang khachHang,
			double tienKhachTra, int diemQuyDoi, String ghiChu, TrangThaiHoaDon trangThaiHoaDon) {
		super();
		this.maHoaDon = maHoaDon;
		this.thoiGianLapHoaDon = thoiGianLapHoaDon;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.tienKhachTra = tienKhachTra;
		this.diemQuyDoi = diemQuyDoi;
		this.ghiChu = ghiChu;
		this.trangThaiHoaDon = trangThaiHoaDon;
	}
	public HoaDon() {
		super();
	}
	public String getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public LocalDateTime getThoiGianLapHoaDon() {
		return thoiGianLapHoaDon;
	}
	public void setThoiGianLapHoaDon(LocalDateTime thoiGianLapHoaDon) {
		this.thoiGianLapHoaDon = thoiGianLapHoaDon;
	}
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	public KhachHang getKhachHang() {
		return khachHang;
	}
	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}
	public double getTienKhachTra() {
		return tienKhachTra;
	}
	public void setTienKhachTra(double tienKhachTra) {
		this.tienKhachTra = tienKhachTra;
	}
	public int getDiemQuyDoi() {
		return diemQuyDoi;
	}
	public void setDiemQuyDoi(int diemQuyDoi) {
		this.diemQuyDoi = diemQuyDoi;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public TrangThaiHoaDon getTrangThaiHoaDon() {
		return trangThaiHoaDon;
	}
	public void setTrangThaiHoaDon(TrangThaiHoaDon trangThaiHoaDon) {
		this.trangThaiHoaDon = trangThaiHoaDon;
	}
	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", thoiGianLapHoaDon=" + thoiGianLapHoaDon + ", nhanVien=" + nhanVien
				+ ", khachHang=" + khachHang + ", tienKhachTra=" + tienKhachTra + ", diemQuyDoi=" + diemQuyDoi
				+ ", ghiChu=" + ghiChu + ", trangThaiHoaDon=" + trangThaiHoaDon + "]";
	}
	
	
}
