package services;

import java.time.LocalDate;
import java.util.List;

import dao.HoaDonDAO;
import entities.HangHoa;
import entities.HoaDon;
import entities.TrangThaiHoaDon;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;

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
	@Override
	public List<HoaDon> getAll(TrangThaiHoaDon tt) {
		// TODO Auto-generated method stub
		try {
			return entityManager.createQuery("Select h from HoaDon h WHERE h.trangThaiHoaDon = :tt ", HoaDon.class)
	                .setParameter("tt", tt)
					.getResultList();
	    } catch (NoResultException e) {
	        return null; // Handle no result found
	    }
		
	}
	@Override
	public HoaDon timHDTheoMa(String ma) {
		// TODO Auto-generated method stub
		return entityManager.find(HoaDon.class, ma);
	}
	@Override
	public List<HoaDon> locHDTheoTG(LocalDate from, LocalDate to, TrangThaiHoaDon tt) {
		// TODO Auto-generated method stub
		try {
			return entityManager.createQuery("Select h from HoaDon h WHERE CAST(h.thoiGianLapHoaDon AS DATE) BETWEEN :from AND :to and h.trangThaiHoaDon = :tt", HoaDon.class)
	                .setParameter("tt", tt)
	                .setParameter("from", from)
	                .setParameter("to", to)
					.getResultList();
	    } catch (NoResultException e) {
	        return null; // Handle no result found
	    }
	}
	@Override
	public boolean updateHoaDon(HoaDon hd) {
		// TODO Auto-generated method stub
		EntityTransaction trans = entityManager.getTransaction();
		try {
			trans.begin();
			entityManager.merge(hd);
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
