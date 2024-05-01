package dao;


import java.util.List;

import entities.HangHoa;

public interface HangHoaDAO {
	public HangHoa timHangHoaTheoMaHH(String maHH);
	public boolean add(HangHoa hanghoa);
	public List<HangHoa> getAllHangHoa();
}
