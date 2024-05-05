package dao;

import java.util.List;

import entities.NhanVien;

public interface NhanVienDAO {
	public boolean add(NhanVien nv);
	public List<NhanVien> getAllKV();
	public NhanVien timNVTheoMa(String maNV);
}
