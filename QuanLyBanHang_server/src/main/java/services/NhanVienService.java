package services;

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

}
