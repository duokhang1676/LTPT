package services;

import java.util.List;

import dao.NhanVienDAO;
import entities.KhachHang;
import entities.NhanVien;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;

public class NhanVienService implements NhanVienDAO{
	private EntityManager entityManager;
	
	public NhanVienService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	public NhanVien timNVTheoMaHoacSDT(String maNV) {
		try {
	        return entityManager.createQuery(
	                "SELECT n FROM NhanVien n WHERE n.maNhanVien = :manv OR n.soDienThoai = :sdt", NhanVien.class)
	                .setParameter("manv", maNV)
	                .setParameter("sdt", maNV)
	                .getSingleResult();
	    } catch (NoResultException e) {
	        return null; // Handle no result found
	    }
	}
	@Override
	public boolean add(NhanVien nv) {
		// TODO Auto-generated method stub
		EntityTransaction trans = entityManager.getTransaction();
		
		try {
			trans.begin();
			entityManager.persist(nv);
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
	public List<NhanVien> getAllKV() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("Select n from NhanVien n", NhanVien.class).getResultList();
	}
	@Override
	public boolean update(NhanVien nv) {
		// TODO Auto-generated method stub
		EntityTransaction trans = entityManager.getTransaction();
		try {
			trans.begin();
			entityManager.merge(nv);
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
