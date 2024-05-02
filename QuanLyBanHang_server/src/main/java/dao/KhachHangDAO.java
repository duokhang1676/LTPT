package dao;

import java.util.List;

import entities.KhachHang;

public interface KhachHangDAO {
	public boolean add(KhachHang kh);
	public List<KhachHang> getAllKH();
}
