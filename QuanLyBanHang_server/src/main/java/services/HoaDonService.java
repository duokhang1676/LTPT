package services;

import java.time.LocalDate;
import java.util.List;

import dao.HoaDonDAO;
import entities.HoaDon;
import entities.TrangThaiHoaDon;
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
	@Override
	public List<HoaDon> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public HoaDon timHDTheoMa(String ma) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public HoaDon locHDTheoTGvaTT(LocalDate from, LocalDate to, TrangThaiHoaDon tt) {
		// TODO Auto-generated method stub
		return null;
	}

}
