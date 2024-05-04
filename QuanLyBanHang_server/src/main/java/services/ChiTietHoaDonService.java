package services;

import dao.ChiTietHoaDonDAO;
import entities.ChiTietHoaDon;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ChiTietHoaDonService implements ChiTietHoaDonDAO{
	private EntityManager entityManager;
	public ChiTietHoaDonService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	public boolean themCTHD(ChiTietHoaDon cthd) {
		EntityTransaction trans = entityManager.getTransaction();
		try {
			trans.begin();
			entityManager.persist(cthd);
			trans.commit();
			return true;
		} catch (Exception e) {
			if (trans.isActive()) {
				trans.rollback();
			}
			e.printStackTrace();
		}
		return false;
	}
	
}
