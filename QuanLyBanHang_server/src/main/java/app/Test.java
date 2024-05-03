package app;

import java.util.List;

import dao.HangHoaDAO;
import entities.HangHoa;
import entities.NhomHang;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import services.EntityManagerFactoryUtil;
import services.HangHoaService;
import services.KhachHangService;
import services.NhomHangService;

public class Test {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("QLBH_server");
		EntityManagerFactoryUtil managerEntityUtil = new EntityManagerFactoryUtil();
		EntityManager entityManager = managerEntityUtil.getEntityManager();
		
		HangHoaService hangHoaDao = new HangHoaService(entityManager);
		NhomHangService nhomHangDao = new NhomHangService(entityManager);
		
//		List<NhomHang> listNH = nhomHangDao.getAllNH();
//		listNH.forEach(nh->System.out.println(nh.toString()));
		
//		List<HangHoa> listHH = hangHoaDao.getAllHangHoa();
//		listHH.forEach(hh->System.out.println(hh.toString()));
		
//		NhomHang nh = new NhomHang("Ten Nhom Hang 02");
//		boolean rs = nhomHangDao.addHH(nh);
//		System.out.println(rs);
		
		NhomHang nHang = nhomHangDao.getNHByName("Ten Nhom Hang 02");
//		System.out.println(nHang.toString());
		
		
		HangHoa hh = new HangHoa("HH01", nHang, null, null, null, 0, "MV00004", 0, 0, null, 0, 0, null, null, null, null);
		boolean rs_addHH = hangHoaDao.add(hh);
		System.out.println(rs_addHH);
	}
}
