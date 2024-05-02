package entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "chitietphieutrahang")
public class ChiTietPhieuTraHang implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne
	@JoinColumn(name = "maPhieuTraHang")
	private PhieuTraHang phieuTraHang;
	@Id
	@ManyToOne
	@JoinColumn(name = "maHangHoa")
	private HangHoa hangHoa;
	private int soLuong;
	private double donGia;
	private String donViTinh;
	private double thanhTien;
	
	public ChiTietPhieuTraHang() {
		// TODO Auto-generated constructor stub
	}

	public ChiTietPhieuTraHang(PhieuTraHang phieuTraHang, HangHoa hangHoa, int soLuong, double donGia, String donViTinh,
			double thanhTien) {
		super();
		this.phieuTraHang = phieuTraHang;
		this.hangHoa = hangHoa;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.donViTinh = donViTinh;
		this.thanhTien = thanhTien;
	}

	public PhieuTraHang getPhieuTraHang() {
		return phieuTraHang;
	}

	public void setPhieuTraHang(PhieuTraHang phieuTraHang) {
		this.phieuTraHang = phieuTraHang;
	}

	public HangHoa getHangHoa() {
		return hangHoa;
	}

	public void setHangHoa(HangHoa hangHoa) {
		this.hangHoa = hangHoa;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	@Override
	public String toString() {
		return "ChiTietPhieuTraHang [phieuTraHang=" + phieuTraHang + ", hangHoa=" + hangHoa + ", soLuong=" + soLuong
				+ ", donGia=" + donGia + ", donViTinh=" + donViTinh + ", thanhTien=" + thanhTien + "]";
	}
	
	
	
}
