package services;

import dao.KhachHangDAO;
import entities.HangHoa;
import entities.KhachHang;
import jakarta.persistence.EntityManager;
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
	
}
