package entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nhomhang")
public class NhomHang implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maNhomHang;
	private String tenNhomHang;
	public NhomHang(int maNhomHang, String tenNhomHang) {
		super();
		this.maNhomHang = maNhomHang;
		this.tenNhomHang = tenNhomHang;
	}
	public NhomHang() {
		super();
	}
	public int getMaNhomHang() {
		return maNhomHang;
	}
	public void setMaNhomHang(int maNhomHang) {
		this.maNhomHang = maNhomHang;
	}
	public String getTenNhomHang() {
		return tenNhomHang;
	}
	public void setTenNhomHang(String tenNhomHang) {
		this.tenNhomHang = tenNhomHang;
	}
	@Override
	public String toString() {
		return "NhomHang [maNhomHang=" + maNhomHang + ", tenNhomHang=" + tenNhomHang + "]";
	}
	
	
}
