package services;

import java.util.List;

import dao.NhanVienDAO;
import entities.KhachHang;
import entities.NhanVien;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;

public class NhanVienService implements NhanVienDAO{
	private EntityManager entityManager;
	
	public NhanVienService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	public NhanVien timNVTheoMa(String maNV) {
		return entityManager.find(NhanVien.class, maNV);
	}
	@Override
	public boolean add(NhanVien nv) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<NhanVien> getAllKV() {
		// TODO Auto-generated method stub
		return null;
	}

}
