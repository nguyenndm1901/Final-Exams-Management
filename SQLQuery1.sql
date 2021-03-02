use [master]
GO

create database QLLTCK
GO

use QLLTCK
GO

create table [dbo].[PHANCONG]
(
	maLop varchar(15) not null,
	tenMH nvarchar(50) not null,
	ngayThi date not null,
	caThi int not null,
	phongThi varchar(6) not null,
	soSV float not null,
	soCBCT int not null,
)

INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE214.I11',N'Công nghệ phần mềm chuyên sâu','2019-01-02',1,'C113',48,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE327.I11',N'Phát triển và vận hành game','2019-01-02',1,'C208',13,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE108.I11',N'Kiểm chứng phần mềm','2019-01-08',3,'C114',42,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE108.I11',N'Kiểm chứng phần mềm','2019-01-08',3,'C205',42,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE108.I11.PMCL',N'Kiểm chứng phần mềm','2019-01-08',3,'E22',22,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE108.I12',N'Kiểm chứng phần mềm','2019-01-08',3,'C206',39,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE108.I12.PMCL',N'Kiểm chứng phần mềm','2019-01-08',3,'E24',26,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE104.I11',N'Nhập môn Công nghệ phần mềm','2019-01-09',3,'C305',64,3) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE104.I12',N'Nhập môn Công nghệ phần mềm','2019-01-09',3,'C306',54,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE215.I11',N'Giao tiếp người máy','2019-01-10',3,'C114',54,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE215.I11.PMCL',N'Giao tiếp người máy','2019-01-10',3,'C101',22,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE215.I11.PMCL',N'Giao tiếp người máy','2019-01-10',3,'C201',21,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE215.I12',N'Giao tiếp người máy','2019-01-10',3,'C205',75,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('IT002.I11',N'Lập trình hướng đối tượng','2019-01-12',2,'C305',40,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('IT002.I11',N'Lập trình hướng đối tượng','2019-01-12',2,'C306',40,2)
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('IT002.I12',N'Lập trình hướng đối tượng','2019-01-12',2,'C308',66,3) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('IT002.I13',N'Lập trình hướng đối tượng','2019-01-12',2,'C311',50,2) 
INSERT INTO [dbo].[PHANCONG] ([maLop],[tenMH],[ngayThi],[caThi],[phongThi],[soSV],[soCBCT]) VALUES('SE330.I11.PMCL',N'Ngôn ngữ lập trình Java','2019-01-18',3,'C201',21,2)

alter table PHANCONG add xepLoai nvarchar(15)
update PHANCONG set xepLoai = N'Đạt' where soSV/25 <= soCBCT
update PHANCONG set xepLoai = N'Không Đạt' where soSV/25 > soCBCT

SELECT * FROM PHANCONG