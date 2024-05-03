package dao;

import java.util.List;

import entities.NhomHang;

public interface NhomHangDAO {
	public List<NhomHang> getAllNH();
	public boolean addHH(NhomHang nh);
	public NhomHang getNHByName(String name);
}
