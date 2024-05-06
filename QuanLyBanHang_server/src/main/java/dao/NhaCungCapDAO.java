package dao;

import java.util.List;

import entities.NhaCungCap;

public interface NhaCungCapDAO {
	public boolean addNCC(NhaCungCap ncc);
	public List<NhaCungCap> getAllNCC();
	public NhaCungCap timNCCTheoMaTheoTen(String ma);
	public boolean update(NhaCungCap ncc);
		
	
}
