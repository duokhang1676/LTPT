package dao;

import entities.KhachHang;

public interface KhachHangDAO {
	public KhachHang getKHTheoMaHoacSDT(String maKH);
	public boolean updateKH(KhachHang kh);
}
