package dao;

import java.util.List;

import entities.ChiTietHoaDon;
import entities.HoaDon;

public interface ChiTietHoaDonDAO {
	public boolean themCTHD(ChiTietHoaDon cthd);
	public List<ChiTietHoaDon> getDSCTHDTheoMaHD(HoaDon hoaDon);
}
