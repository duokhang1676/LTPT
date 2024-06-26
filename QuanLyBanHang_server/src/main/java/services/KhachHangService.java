package services;

import java.util.List;

import dao.KhachHangDAO;
import entities.HangHoa;
import entities.KhachHang;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;

public class KhachHangService implements KhachHangDAO{
	private EntityManager entityManager;
	
	public KhachHangService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	public KhachHang getKHTheoMaHoacSDT(String maKH) {
		try {
	        return entityManager.createQuery(
	                "SELECT k FROM KhachHang k WHERE k.maKhachHang = :makh OR k.soDienThoai = :sdt", KhachHang.class)
	                .setParameter("makh", maKH)
	                .setParameter("sdt", maKH)
	                .getSingleResult();
	    } catch (NoResultException e) {
	        return null; // Handle no result found
	    }
	}
	

	public boolean add(KhachHang kh) {
		// TODO Auto-generated method stub
		EntityTransaction trans = entityManager.getTransaction();
		
		try {
			trans.begin();
			entityManager.persist(kh);
			trans.commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			trans.rollback();
		}
		return false;
	}
	@Override
	public List<KhachHang> getAllKH() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("Select k from KhachHang k", KhachHang.class).getResultList();
	}
	@Override
	public boolean updateKH(KhachHang kh) {
		// TODO Auto-generated method stub khang cap nhat diem thuong khi tao hd
		EntityTransaction trans = entityManager.getTransaction();
		try {
			trans.begin();
			entityManager.merge(kh);
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
