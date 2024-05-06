package services;

import java.util.List;

import dao.ChiTietHoaDonDAO;
import entities.ChiTietHoaDon;
import entities.HoaDon;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;

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
	@Override
	public List<ChiTietHoaDon> getDSCTHDTheoMaHD(HoaDon hoaDon) {
		// TODO Auto-generated method stub
		try {
			return entityManager.createQuery("SELECT c FROM ChiTietHoaDon c WHERE c.hoaDon = :hoaDon", ChiTietHoaDon.class)
	                .setParameter("hoaDon", hoaDon)
					.getResultList();
	    } catch (NoResultException e) {
	        return null; // Handle no result found
	    }
	}
	
}
