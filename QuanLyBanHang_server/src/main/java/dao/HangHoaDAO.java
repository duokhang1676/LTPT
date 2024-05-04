package dao;


import java.util.List;

import entities.HangHoa;

public interface HangHoaDAO {
	public HangHoa timHangHoaTheoMaHH(String maHH);
	public HangHoa timHangHoaTheoMaHoacTen(String maTenHH);
	public boolean add(HangHoa hanghoa);
	public List<HangHoa> getAllHangHoa();
	public List<HangHoa> getHangHoaByID();
}
