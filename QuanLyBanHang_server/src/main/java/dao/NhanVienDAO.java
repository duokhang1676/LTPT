package dao;

import java.util.List;

import entities.NhanVien;

public interface NhanVienDAO {
	public boolean add(NhanVien nv);
	public List<NhanVien> getAllKV();
	public NhanVien timNVTheoMaHoacSDT(String ma);
	public boolean update(NhanVien nv);
}
