package services;

import dao.HangHoaDAO;
import entities.HangHoa;
import jakarta.persistence.EntityManager;

public class HangHoaService implements HangHoaDAO{
	private EntityManager entityManager;
	
	public HangHoaService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public HangHoa timHangHoaTheoMaHH(String maHH) {
		return entityManager.find(HangHoa.class, maHH);
	}
	
}
