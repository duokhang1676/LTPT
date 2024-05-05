package dao;

import java.time.LocalDate;
import java.util.List;

import entities.HoaDon;
import entities.TrangThaiHoaDon;

public interface HoaDonDAO {
	public boolean themHoaDon(HoaDon hd);
	public List<HoaDon> getAll();
	public HoaDon timHDTheoMa(String ma);
	public HoaDon locHDTheoTGvaTT(LocalDate from, LocalDate to, TrangThaiHoaDon tt);
}
