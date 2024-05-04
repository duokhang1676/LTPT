package services;

import java.util.List;

import dao.NhomHangDAO;
import entities.NhomHang;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class NhomHangService implements NhomHangDAO{
	private EntityManager entityManager;
	
	public NhomHangService(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<NhomHang> getAllNH() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("Select nh from NhomHang nh", NhomHang.class).getResultList();
	}

	@Override
	public boolean addHH(NhomHang nh) {
		// TODO Auto-generated method stub
		EntityTransaction trans = entityManager.getTransaction();
		
		try {
			trans.begin();
			entityManager.persist(nh);
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
	public NhomHang getNHByName(String name) {
		// TODO Auto-generated method stub
		return entityManager.createQuery("Select nh from NhomHang nh where nh.tenNhomHang = :name", NhomHang.class).setParameter("name", name).getSingleResult();
	}

}
