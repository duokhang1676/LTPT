package app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import service.EntityManagerFactoryUtil;

public class Test {
	public static void main(String[] args) {
//		Persistence.createEntityManagerFactory("QLBH_server");
		EntityManagerFactoryUtil managerEntityUtil = new EntityManagerFactoryUtil();
		EntityManager entityManager = managerEntityUtil.getEntityManager();
	}
}
