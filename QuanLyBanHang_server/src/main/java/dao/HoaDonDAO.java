package dao;

import java.time.LocalDate;
import java.util.List;

import entities.HoaDon;
import entities.TrangThaiHoaDon;

public interface HoaDonDAO {
	public boolean themHoaDon(HoaDon hd);
	public List<HoaDon> getAll(TrangThaiHoaDon tt);
	public HoaDon timHDTheoMa(String ma);
	public List<HoaDon> locHDTheoTG(LocalDate from, LocalDate to, TrangThaiHoaDon tt);
	public boolean updateHoaDon(HoaDon hd);
}
