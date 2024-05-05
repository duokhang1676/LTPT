package services;

import java.util.List;

import dao.NhaCungCapDAO;
import entities.NhaCungCap;
import jakarta.persistence.EntityManager;

public class NhaCungCapService implements NhaCungCapDAO{
	private EntityManager entityManager;
	
	public NhaCungCapService(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	public List<NhaCungCap> getAllNCC() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("Select ncc from NhaCungCap ncc", NhaCungCap.class).getResultList();
	}

}
