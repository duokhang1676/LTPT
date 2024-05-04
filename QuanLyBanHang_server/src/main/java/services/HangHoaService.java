
package services;

import java.util.List;

import dao.HangHoaDAO;
import entities.HangHoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;

public class HangHoaService implements HangHoaDAO{
	private EntityManager entityManager;
	
	public HangHoaService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public HangHoa timHangHoaTheoMaHH(String maHH) {
		try {
	        return entityManager.createQuery(
	                "SELECT h FROM HangHoa h WHERE h.maHangHoa = :mahh OR h.maVach = :mavach", HangHoa.class)
	                .setParameter("mahh", maHH)
	                .setParameter("mavach", maHH)
	                .getSingleResult();
	    } catch (NoResultException e) {
	        return null; // Handle no result found
	    }
	}
	@Override
	public boolean add(HangHoa hanghoa) {
		// TODO Auto-generated method stub
		EntityTransaction trans = entityManager.getTransaction();
		HangHoa hh = timHangHoaTheoMaHH(hanghoa.getMaHangHoa());
		if(hh!= null) return false;
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
		return entityManager.createQuery("Select h from HangHoa h", HangHoa.class).getResultList();
	}

	@Override
	public List<HangHoa> getHangHoaByID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HangHoa timHangHoaTheoMaHoacTen(String maTenHH) {
		// TODO Auto-generated method stub
		return entityManager.createQuery("Select h from HangHoa h where h.maHangHoa = :name or h.tenHangHoa = :name", HangHoa.class)
				.setParameter("name", maTenHH)
				.getSingleResult();
	}

	@Override
	public boolean capNhatSoLuongHH(String maHH, int soLuong) {
		// TODO Auto-generated method stub khang capNhatSoLuongKhiTaoHD
		
		return false;
	}
}
