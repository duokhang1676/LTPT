package app;

import dao.HangHoaDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import services.EntityManagerFactoryUtil;
import services.HangHoaService;
import services.KhachHangService;

public class Test {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("QLBH_server");
		EntityManagerFactoryUtil managerEntityUtil = new EntityManagerFactoryUtil();
		EntityManager entityManager = managerEntityUtil.getEntityManager();
	}
}
