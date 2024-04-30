package entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PhieuTraHang implements Serializable{
	private String maPhieuTraHang;
	private LocalDateTime thoiGianTao;
	private HoaDon hoaDon;
	private String ghiChu;
	private TrangThaiPhieuTraHang trangThaiPhieuTraHang;
}
