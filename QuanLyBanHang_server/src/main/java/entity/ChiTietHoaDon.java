package entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "chitiethoadon")
public class ChiTietHoaDon implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "maHoaDon" )
	private HoaDon hoaDon;
	@ManyToOne
	@JoinColumn(name = "maHangHoa")
	private HangHoa hangHoa;
	private int soLuong;
	private double donGia;
	private String donViTinh;
	public ChiTietHoaDon(HoaDon hoaDon, HangHoa hangHoa, int soLuong, double donGia, String donViTinh) {
		super();
		this.hoaDon = hoaDon;
		this.hangHoa = hangHoa;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.donViTinh = donViTinh;
	}
	public ChiTietHoaDon() {
		super();
	}
	public HoaDon getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ChiTietHoaDon [hoaDon=" + hoaDon + ", hangHoa=" + hangHoa + ", soLuong=" + soLuong + ", donGia="
				+ donGia + ", donViTinh=" + donViTinh + "]";
	}
	
	
	
	
}
