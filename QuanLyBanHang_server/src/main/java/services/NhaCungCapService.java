package services;

import java.util.List;

import dao.NhaCungCapDAO;
import entities.HangHoa;
import entities.NhaCungCap;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

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

	@Override
	public NhaCungCap timNCCTheoMaTheoTen(String ma) {
		// TODO Auto-generated method stub
		try {
			NhaCungCap ncc = entityManager.createQuery("Select ncc from NhaCungCap ncc where ncc.maNhaCungCap = :ma or ncc.tenNhaCungCap = :ma", NhaCungCap.class)
					.setParameter("ma", ma)
					.getSingleResult();
			return ncc;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	@Override
	public boolean addNCC(NhaCungCap ncc) {
		// TODO Auto-generated method stub
		
		EntityTransaction trans = entityManager.getTransaction();
		
		try {
			trans.begin();
			entityManager.persist(ncc);
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
	public boolean update(NhaCungCap ncc) {
		// TODO Auto-generated method stub
		EntityTransaction trans = entityManager.getTransaction();
		try {
			trans.begin();
			entityManager.merge(ncc);
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
