package entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "phieutrahang")
public class PhieuTraHang implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String maPhieuTraHang;
	private LocalDateTime thoiGianTao;
	
	@OneToOne
	@JoinColumn(name = "maHoaDon")
	private HoaDon hoaDon;
	private String ghiChu;
	private TrangThaiPhieuTraHang trangThaiPhieuTraHang;
	public PhieuTraHang(String maPhieuTraHang, LocalDateTime thoiGianTao, HoaDon hoaDon, String ghiChu,
			TrangThaiPhieuTraHang trangThaiPhieuTraHang) {
		super();
		this.maPhieuTraHang = maPhieuTraHang;
		this.thoiGianTao = thoiGianTao;
		this.hoaDon = hoaDon;
		this.ghiChu = ghiChu;
		this.trangThaiPhieuTraHang = trangThaiPhieuTraHang;
	}
	public PhieuTraHang() {
		super();
	}
	public String getMaPhieuTraHang() {
		return maPhieuTraHang;
	}
	public void setMaPhieuTraHang(String maPhieuTraHang) {
		this.maPhieuTraHang = maPhieuTraHang;
	}
	public LocalDateTime getThoiGianTao() {
		return thoiGianTao;
	}
	public void setThoiGianTao(LocalDateTime thoiGianTao) {
		this.thoiGianTao = thoiGianTao;
	}
	public HoaDon getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	public TrangThaiPhieuTraHang getTrangThaiPhieuTraHang() {
		return trangThaiPhieuTraHang;
	}
	public void setTrangThaiPhieuTraHang(TrangThaiPhieuTraHang trangThaiPhieuTraHang) {
		this.trangThaiPhieuTraHang = trangThaiPhieuTraHang;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "PhieuTraHang [maPhieuTraHang=" + maPhieuTraHang + ", thoiGianTao=" + thoiGianTao + ", hoaDon=" + hoaDon
				+ ", ghiChu=" + ghiChu + ", trangThaiPhieuTraHang=" + trangThaiPhieuTraHang + "]";
	}
	
	
}
