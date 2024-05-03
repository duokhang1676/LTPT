package entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "hanghoa")
@NamedNativeQueries({
	@NamedNativeQuery(name = "hanghoa.findAll", query = "Select * from hanghoa")
})
public class HangHoa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String maHangHoa;
	private String tenHangHoa;
	
	@ManyToOne
	@JoinColumn(name = "maNhomHang")
	private NhomHang nhomHang;
	private String nuocSanXuat;
	private String hangSanXuat;
	private String moTa;
	private double thue;
	private String maVach;
	private int soLuongDinhMuc;
	private int soLuongCanhBao;
	private String donViTinh;
	private double giaNhap;
	private double giaBan;
	
	@ManyToOne
	@JoinColumn(name = "maNhaCungCap")
	private NhaCungCap nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate hanSuDung;
	private TrangThaiHangHoa trangThaiHangHoa;
	public HangHoa(String maHangHoa, String tenHangHoa, NhomHang nhomHang, String nuocSanXuat, String hangSanXuat,
			String moTa, double thue, String maVach, int soLuongDinhMuc, int soLuongCanhBao,
			String donViTinh, double giaNhap, double giaBan, NhaCungCap nhaCungCap, LocalDate ngaySanXuat,
			LocalDate hanSuDung, TrangThaiHangHoa trangThaiHangHoa) {
		super();
		this.maHangHoa = maHangHoa;
		this.tenHangHoa = tenHangHoa;
		this.nhomHang = nhomHang;
		this.nuocSanXuat = nuocSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.moTa = moTa;
		this.thue = thue;
		this.maVach = maVach;
		this.soLuongDinhMuc = soLuongDinhMuc;
		this.soLuongCanhBao = soLuongCanhBao;
		this.donViTinh = donViTinh;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.hanSuDung = hanSuDung;
		this.trangThaiHangHoa = trangThaiHangHoa;
	}
	
	
	public HangHoa(String tenHangHoa, NhomHang nhomHang, String nuocSanXuat, String hangSanXuat, String moTa,
			double thue, String maVach, int soLuongDinhMuc, int soLuongCanhBao, String donViTinh, double giaNhap,
			double giaBan, NhaCungCap nhaCungCap, LocalDate ngaySanXuat, LocalDate hanSuDung,
			TrangThaiHangHoa trangThaiHangHoa) {
		super();
		this.tenHangHoa = tenHangHoa;
		this.nhomHang = nhomHang;
		this.nuocSanXuat = nuocSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.moTa = moTa;
		this.thue = thue;
		this.maVach = maVach;
		this.soLuongDinhMuc = soLuongDinhMuc;
		this.soLuongCanhBao = soLuongCanhBao;
		this.donViTinh = donViTinh;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.hanSuDung = hanSuDung;
		this.trangThaiHangHoa = trangThaiHangHoa;
	}


	public HangHoa() {
		super();
	}
	@Override
	public String toString() {
		return "HangHoa [maHangHoa=" + maHangHoa + ", tenHangHoa=" + tenHangHoa + ", nhomHang=" + nhomHang
				+ ", nuocSanXuat=" + nuocSanXuat + ", hangSanXuat=" + hangSanXuat
				+ ", moTa=" + moTa + ", thue=" + thue + ", maVach=" + maVach + ", soLuongDinhMuc=" + soLuongDinhMuc
				+ ", soLuongCanhBao=" + soLuongCanhBao + ", donViTinh=" + donViTinh + ", giaNhap=" + giaNhap
				+ ", giaBan=" + giaBan + ", nhaCungCap=" + nhaCungCap + ", ngaySanXuat=" + ngaySanXuat + ", hanSuDung="
				+ hanSuDung + ", trangThaiHangHoa=" + trangThaiHangHoa + "]";
	}
	public String getMaHangHoa() {
		return maHangHoa;
	}
	public void setMaHangHoa(String maHangHoa) {
		this.maHangHoa = maHangHoa;
	}
	public String getTenHangHoa() {
		return tenHangHoa;
	}
	public void setTenHangHoa(String tenHangHoa) {
		this.tenHangHoa = tenHangHoa;
	}
	public NhomHang getNhomHang() {
		return nhomHang;
	}
	public void setNhomHang(NhomHang nhomHang) {
		this.nhomHang = nhomHang;
	}
	public String getNuocSanXuat() {
		return nuocSanXuat;
	}
	public void setNuocSanXuat(String nuocSanXuat) {
		this.nuocSanXuat = nuocSanXuat;
	}
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public double getThue() {
		return thue;
	}
	public void setThue(double thue) {
		this.thue = thue;
	}
	public String getMaVach() {
		return maVach;
	}
	public void setMaVach(String maVach) {
		this.maVach = maVach;
	}
	public int getSoLuongDinhMuc() {
		return soLuongDinhMuc;
	}
	public void setSoLuongDinhMuc(int soLuongDinhMuc) {
		this.soLuongDinhMuc = soLuongDinhMuc;
	}
	public int getSoLuongCanhBao() {
		return soLuongCanhBao;
	}
	public void setSoLuongCanhBao(int soLuongCanhBao) {
		this.soLuongCanhBao = soLuongCanhBao;
	}
	public String getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}
	public double getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public LocalDate getHanSuDung() {
		return hanSuDung;
	}
	public void setHanSuDung(LocalDate hanSuDung) {
		this.hanSuDung = hanSuDung;
	}
	public TrangThaiHangHoa getTrangThaiHangHoa() {
		return trangThaiHangHoa;
	}
	public void setTrangThaiHangHoa(TrangThaiHangHoa trangThaiHangHoa) {
		this.trangThaiHangHoa = trangThaiHangHoa;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
