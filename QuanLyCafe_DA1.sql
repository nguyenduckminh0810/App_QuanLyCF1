CREATE DATABASE QuanLyCafe_DA1
GO
USE QuanLyCafe_DA1
GO 
--DROP DATABASE UPCOFFEE
CREATE TABLE NhanVien(
	ID_Nhanvien VARCHAR(10) PRIMARY KEY NOT NULL,
	TenNV NVARCHAR(50) NOT NULL,
	Gender BIT NOT NULL,
	Ngaysinh DATE NOT NULL,
	Diachi NVARCHAR(100),
	Email NVARCHAR(100),
	SDT VARCHAR(11),
	Username VARCHAR(50) NOT NULL,
	Pass VARCHAR(50) NOT NULL,
	Vaitro BIT DEFAULT 0,
	Trangthai BIT DEFAULT 1,
	Hinh NVARCHAR(100)
)

GO 
CREATE TABLE HoaDon(
	ID_Hoadon INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	ID_Nhanvien VARCHAR(10) NOT NULL,
	Ngaytao DATETIME DEFAULT GETDATE(),
	Trangthai BIT DEFAULT 1,
	TTThanhtoan BIT DEFAULT 0,
	Thanhtien INT,
	Lydohuy NVARCHAR(100),
	Soluongsanphamhuy INT,
	ghichu NVARCHAR(100),
	SDT VARCHAR(11),
	Ten NVARCHAR(50),
	diaChi NVARCHAR(50),
	tenShip INT 
)
GO 
CREATE TABLE SanPham(
	ID_Sanpham VARCHAR(10) PRIMARY KEY NOT NULL,
	TenSP NVARCHAR(50) NOT NULL,
	Gia INT NOT NULL,
	ID_DonviSP VARCHAR(10) NOT NULL,
	ID_LoaiSP VARCHAR(10) NOT NULL,
	Trangthai BIT DEFAULT 1,
	Hinh NVARCHAR(100)
)
GO 
CREATE TABLE LoaiSanPham(
	ID_LoaiSP VARCHAR(10) NOT NULL PRIMARY KEY,
	TenLoai NVARCHAR(20) NOT NULL,
)
GO 
CREATE TABLE DonViSanPham(
	ID_DonviSP VARCHAR(10) NOT NULL PRIMARY KEY,
	TenDonvi NVARCHAR(20) NOT NULL,
	Kichthuoc INT NOT NULL,
	ThemTien INT 
)
GO 
CREATE TABLE Ban(
	ID_Ban INT NOT NULL PRIMARY KEY,
	Trangthai BIT, -- Bàn ảo = 0 là dùng để tạo đơn mang về và bàn thật = 1
	Hoatdong BIT, 
	Soluongcho INT, -- Số lượng chỗ ngồi trong 1 bàn
)
GO 
CREATE TABLE BanChiTiet(
	ID_Ban INT NOT NULL,
	ID_Hoadon INT NOT NULL,
	Thoidiemconguoi TIME,
	Donchinh BIT -- =0 đơn phụ không thực hiện thao tác =1 là đơn chính thực hiện thao tác
)
GO 
CREATE TABLE HoaDonChiTiet(
	ID_HoaDon INT NOT NULL,
	ID_SanPham VARCHAR(10) NOT NULL,
	Soluong INT NOT NULL,
	Gia INT NOT NULL,
	TongGia INT NOT NULL,
	TTthanhtoan BIT DEFAULT 0,
	Lydohuy NVARCHAR(100),
	ghichu NVARCHAR(100)
	--trang thai thanh toan
)
GO 
CREATE TABLE BanDat(
	ID_Ban INT NOT NULL,
	ID_NhanVien VARCHAR(10) NOT NULL, 
	TenKH NVARCHAR(50) NOT NULL,
	SDT VARCHAR(11) NOT NULL,
	Thoigian TIME NOT NULL
)
GO 
 
--Foreign key
ALTER TABLE dbo.HoaDon ADD FOREIGN KEY(ID_Nhanvien) REFERENCES dbo.NhanVien(ID_Nhanvien) --Hoadon
ALTER TABLE dbo.HoaDonChiTiet ADD FOREIGN KEY(ID_HoaDon) REFERENCES dbo.HoaDon(ID_Hoadon) --Hoadonchitiet
ALTER TABLE dbo.HoaDonChiTiet ADD FOREIGN KEY(ID_SanPham) REFERENCES dbo.SanPham(ID_Sanpham) --Hoadonchitiet
ALTER TABLE dbo.SanPham ADD FOREIGN KEY(ID_DonviSP) REFERENCES dbo.DonViSanPham(ID_DonviSP) --Sanpham
ALTER TABLE dbo.SanPham ADD FOREIGN KEY(ID_LoaiSP) REFERENCES dbo.LoaiSanPham(ID_LoaiSP) --SanPham
ALTER TABLE dbo.BanDat ADD FOREIGN KEY(ID_Ban) REFERENCES dbo.Ban(ID_Ban) --BanDat
ALTER TABLE dbo.BanDat ADD FOREIGN KEY(ID_NhanVien) REFERENCES dbo.NhanVien(ID_Nhanvien) --BanDat
ALTER TABLE dbo.BanChiTiet ADD FOREIGN KEY(ID_Ban) REFERENCES dbo.Ban(ID_Ban) --banchitiet
ALTER TABLE dbo.BanChiTiet ADD FOREIGN KEY(ID_Hoadon) REFERENCES dbo.HoaDon(ID_Hoadon) --banchitiet

------------------ PHẦN TRUY VẤN -------------------
select * from NhanVien
select * from HoaDon
select * from HoaDonChiTiet
select * from Ban
select * from BanChiTiet
select * from SanPham
select * from DonViSanPham
select * from LoaiSanPham
------------------ PHẦN INSERT---------------------
-- PHẦN INSERT DỮ LIỆU --
-- >Bảng LoaiSP
insert dbo.LoaiSanPham values('LSP1', N'Cà Phê Phin')
insert dbo.LoaiSanPham values('LSP2', N'Trà')
insert dbo.LoaiSanPham values('LSP3', N'PhinDi')
insert dbo.LoaiSanPham values('LSP4', N'Bánh')
insert dbo.LoaiSanPham values('LSP5', N'Freeze')
insert dbo.LoaiSanPham values('LSP6', N'Đồ Ăn Khác')
go

-- > Bảng DonViSanPham
insert dbo.DonViSanPham values('DV1', N'Nhỏ',300,0)
insert dbo.DonViSanPham values('DV2', N'Vừa',350,4000)
insert dbo.DonViSanPham values('DV3', N'Lớn',450,12000)
go

-- > Bảng SanPham
insert dbo.SanPham values ('SP1',N'Phin Sữa Đá',30000,'DV1','LSP1',1,N'') -- Cà Phê Phin
insert dbo.SanPham values ('SP2',N'Phin Đen Đá',30000,'DV1','LSP1',1,N'') -- Cà Phê Phin
insert dbo.SanPham values ('SP3',N'Bạc Xỉu',30000,'DV1','LSP1',1,N'') -- Cà Phê Phin
insert dbo.SanPham values ('SP4',N'Trà Sen Vàng',45000,'DV1','LSP2',1,N'') -- Trà
insert dbo.SanPham values ('SP5',N'Trà Thạch Đào',45000,'DV1','LSP2',1,N'') -- Trà
insert dbo.SanPham values ('SP6',N'Trà Thanh Đào',45000,'DV1','LSP2',1,N'') -- Trà
insert dbo.SanPham values ('SP7',N'PhinDi Hạnh Nhân',45000,'DV1','LSP3',1,N'') -- PhinDi
insert dbo.SanPham values ('SP8',N'PhinDi Kem Sữa',10000,'DV1','LSP3',1,N'') -- PhinDi
insert dbo.SanPham values ('SP9',N'Freeze Trà Xanh',55000,'DV1','LSP5',1,N'') -- Freeze
insert dbo.SanPham values ('SP10',N'Caramel Phin Freeze',55000,'DV1','LSP5',1,N'') -- Freeze
insert dbo.SanPham values ('SP11',N'Cookies & Cream',55000,'DV1','LSP5',1,N'') -- Freeze
insert dbo.SanPham values ('SP12',N'Bánh Su Kem',29000,'DV1','LSP4',1,N'') -- Bánh
insert dbo.SanPham values ('SP13',N'Mousse Đào',35000,'DV1','LSP4',1,N'') -- Bánh
insert dbo.SanPham values ('SP14',N'Sữa Chua Phô Mai',39000,'DV1','LSP4',1,N'') -- Bánh
insert dbo.SanPham values ('SP15',N'Bánh Mì Que',19000,'DV1','LSP6',1,N'') -- Đồ Ăn Khác
go

-- > Bảng NhanVien
insert dbo.NhanVien values('NV1',N'Nguyễn Minh Phúc Thành',1,'1996/01/01',N'Hải Phòng',N'thanhnmp@gmail.com','0123456789','thanhnmp','123456',1, 1,N'')
insert dbo.NhanVien values('NV2',N'Bùi Văn Long',1,'2005/01/01',N'Hải Phòng',N'longbv@gmail.com','0123456789','longbv','123456',1, 1,N'')
insert dbo.NhanVien values('NV3',N'Nguyễn Đức Minh',1,'2004/10/08',N'Hải Phòng',N'nguyenduckminh0810@gmail.com','0948341895','minhnd','123456',1, 1,N'')
insert dbo.NhanVien values('NV4',N'Trưởng Phòng Demo',1,'2000/01/01',N'Hải Phòng',N'truongphong@gmail.com','0123456789','truongphong','123456789',0, 1,N'')
go

--Ban
--INSERT dbo.Ban VALUES(0,1,1,2)--TRang thai = 1 la mang ban su dung, Hoatdong = 1 la ban trong =0 la ban dang co nguoi
--INSERT dbo.Ban VALUES(15,0,1,2)
--SELECT * FROM dbo.Ban WHERE Trangthai = 1
--DELETE FROM dbo.HoaDon
--UPDATE dbo.Ban SET Hoatdong = 1 WHERE ID_Ban = 0
--HoaDon
--select*from HoaDon
--select*from HoaDonChiTiet
--INSERT dbo.HoaDon VALUES ('NV1',GETDATE(),1,1) --Trangthai = 1 la hoatdong, Trangthai = 0 la huydon
--INSERT dbo.HoaDon VALUES ('NV1',GETDATE(),1,0) --TTThanhtoan = 1 la da thanh toan = 0 chua thanh toan
--INSERT dbo.HoaDon VALUES ('NV1',GETDATE(),0,0) --
--SELECT * FROM dbo.HoaDon where Trangthai = 1 AND TTThanhtoan = 0'
select * from hoadon
GO 
CREATE PROC chuyendon (@mahd int)
AS
BEGIN 
	DELETE FROM dbo.BanChiTiet WHERE ID_Hoadon = @mahd
	DELETE FROM dbo.HoaDon WHERE ID_Hoadon = @mahd
END 