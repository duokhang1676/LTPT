package app;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.util.List;

import entities.ChiTietHoaDon;
import entities.HangHoa;
import entities.HoaDon;
import entities.KhachHang;
import entities.NhaCungCap;
import entities.NhanVien;
import entities.NhomHang;
import entities.TrangThaiHoaDon;
import jakarta.persistence.EntityManager;
import services.ChiTietHoaDonService;
import services.EntityManagerFactoryUtil;
import services.HangHoaService;
import services.HoaDonService;
import services.KhachHangService;
import services.NhaCungCapService;
import services.NhanVienService;
import services.NhomHangService;

public class Server {
	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(8888);) {

			System.out.println("Server started on port 8888");
//			ExecutorService executorService = Executors.newCachedThreadPool();

			while (true) {
				Socket clientSocket = server.accept();

//				executorService.execute(new ClientHandler(clientSocket));
				
//				Way 2
				Thread t = new Thread(new ClientHandler(clientSocket));
				t.start();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class ClientHandler implements Runnable {
	private Socket clientSocket;
	private EntityManagerFactoryUtil mangerFactoryUtil;
	private EntityManager entityManager;
	private HangHoaService hangHoaService;
	private KhachHangService khachHangService;
	private NhanVienService nhanVienService;
	private NhomHangService nhomHangService;
	private HoaDonService hoaDonService;
	private ChiTietHoaDonService chiTietHoaDonService;
	private NhaCungCapService nhaCungCapService;


	public ClientHandler(Socket clientSocket) {
		this.clientSocket = clientSocket;
		this.mangerFactoryUtil = new EntityManagerFactoryUtil();
		this.entityManager = mangerFactoryUtil.getEntityManager();
		this.hangHoaService = new HangHoaService(this.entityManager);
		this.khachHangService = new KhachHangService(entityManager);
		this.nhanVienService = new NhanVienService(entityManager);
		this.nhomHangService = new NhomHangService(entityManager);
		this.hoaDonService = new HoaDonService(entityManager);
		this.chiTietHoaDonService = new ChiTietHoaDonService(entityManager);
		this.nhaCungCapService = new NhaCungCapService(entityManager);
	}

	@Override
	public void run() {

		try {
			ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
			ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());

			String choice = "";

			while (true) {
				choice = in.readUTF();
				
				switch (choice) {
				case "TIM_HANGHOA_THEOMA":
					HangHoa hangHoa = hangHoaService.timHangHoaTheoMaHH(in.readUTF());
					out.writeObject(hangHoa);
					out.flush();
					break;
				case "TIM_KHACHHANG_THEOMA":
					KhachHang khachHang = khachHangService.getKHTheoMaHoacSDT(in.readUTF());
					out.writeObject(khachHang);
					out.flush();
					break;
				case "TIM_NHANVIEN_THEOMA":
					NhanVien nhanVien = nhanVienService.timNVTheoMa(in.readUTF());
					out.writeObject(nhanVien);
					out.flush();
					break;
				case "GET_DANHSACH_HANGHOA":
					List<HangHoa> dsHangHoa = hangHoaService.getAllHangHoa();
					out.writeObject(dsHangHoa);
					out.flush();
					break;
				case "GET_DANHSACH_NHOMHANG":
					List<NhomHang> dsNhomHang = nhomHangService.getAllNH();
					out.writeObject(dsNhomHang);
					out.flush();
					break;
				case "TIM_HANGHOA_THEOMA_THEOTEN":
					HangHoa hangHoa1 = hangHoaService.timHangHoaTheoMaHoacTen(in.readUTF());
					out.writeObject(hangHoa1);
					out.flush();
					break;

				case "THEM_HOADON":
					boolean temp = hoaDonService.themHoaDon((HoaDon)in.readObject());
					out.writeBoolean(temp);
					out.flush();
					break;
				case "THEM_CTHD":
					chiTietHoaDonService.themCTHD((ChiTietHoaDon)in.readObject());
					break;
				case "CAPNHAT_HANGHOA":
					hangHoaService.updateHH((HangHoa)in.readObject());
					break;
				case "CAPNHAT_KHACHHANG":
					khachHangService.updateKH((KhachHang)in.readObject());
					break;
				case "THEM_HANGHOA":
					boolean rsThemHH = hangHoaService.add((HangHoa)in.readObject());
					out.writeBoolean(rsThemHH);
					out.flush();
					break;
				case "GET_DANHSACH_NCC":
					List<NhaCungCap> dsNCC = nhaCungCapService.getAllNCC();
					out.writeObject(dsNCC);
					out.flush();
					break;
				case "GET_ALL_HOADON":
					List<HoaDon> dsHD = hoaDonService.getAll((TrangThaiHoaDon)in.readObject());
					out.writeObject(dsHD);
					out.flush();
					break;
				case "GET_HOADON_THEOTG":
					List<HoaDon> dsHD1 = hoaDonService.locHDTheoTG((LocalDate)in.readObject(), (LocalDate)in.readObject(), (TrangThaiHoaDon)in.readObject());
					out.writeObject(dsHD1);
					out.flush();
					break;
				case "GET_HOADON_THEOMA":
					HoaDon hoaDon = hoaDonService.timHDTheoMa(in.readUTF());
					out.writeObject(hoaDon);
					out.flush();
					break;
				case "GET_CTHD_THEOMAHD":
					List<ChiTietHoaDon> dsCTHD = chiTietHoaDonService.getDSCTHDTheoMaHD((HoaDon)in.readObject());
					out.writeObject(dsCTHD);
					out.flush();
					break;
				case "UPDATE_HOADON":
					temp = hoaDonService.updateHoaDon((HoaDon)in.readObject());
					out.writeBoolean(temp);
					out.flush();
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			this.mangerFactoryUtil.closeEnManager();
			this.mangerFactoryUtil.closeEnManagerFactory();
		}
	}
}

