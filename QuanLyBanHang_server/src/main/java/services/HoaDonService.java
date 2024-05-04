package services;

import dao.HoaDonDAO;
import entities.HoaDon;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class HoaDonService implements HoaDonDAO{
	private EntityManager entityManager;

	public HoaDonService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	public boolean themHoaDon(HoaDon hd) {
		EntityTransaction trans = entityManager.getTransaction();
		try {
			trans.begin();
			entityManager.persist(hd);
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
