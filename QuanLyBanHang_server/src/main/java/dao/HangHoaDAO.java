package dao;

import java.util.List;

import entity.HangHoa;

public interface HangHoaDAO {
	public boolean add(HangHoa hanghoa);
	public List<HangHoa> getAllHangHoa();
	
}
