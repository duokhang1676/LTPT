package service;

import java.util.List;

import dao.HangHoaDAO;
import entity.HangHoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class HangHoaService implements HangHoaDAO {

	private EntityManager entityManager;
	@Override
	public boolean add(HangHoa hanghoa) {
		// TODO Auto-generated method stub
		EntityTransaction trans = entityManager.getTransaction();
		try {
			trans.begin();
			entityManager.persist(hanghoa);
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
	public List<HangHoa> getAllHangHoa() {
		// TODO Auto-generated method stub
		return entityManager.createNamedQuery("hanghoa.findAll", HangHoa.class).getResultList();
	}

}
