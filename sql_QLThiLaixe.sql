DROP DATABASE IF EXISTS `sql_qlthilaixe`;
CREATE DATABASE `sql_qlthilaixe`; 
USE `sql_qlthilaixe`;

SET NAMES utf8 ;
SET character_set_client = utf8mb4 ;

CREATE TABLE `loaibanglai` (
`lbl_id` int(4) NOT NULL AUTO_INCREMENT,
`ten_loai_bang_lai` varchar(50) NOT NULL,
PRIMARY KEY (`lbl_id`)
);
CREATE TABLE `cauhoi` (
`id_cau_hoi` int(4) NOT NULL AUTO_INCREMENT,
`lbl_id` int(4) NOT NULL,
`ten_cau_hoi` nvarchar(500) NOT NULL,
`dap_an_1` nvarchar(500) ,
`dap_an_2` nvarchar(500) ,
`dap_an_3` nvarchar(500),
`dap_an_4` nvarchar(500),
`dap_an_dung` nvarchar(500),
PRIMARY KEY (`id_cau_hoi`),
KEY `fk_cauhoi_loaibanglai_idx` (`lbl_id`),
CONSTRAINT `fk_cauhoi_loaibanglai` FOREIGN KEY (`lbl_id`) REFERENCES `loaibanglai` (`lbl_id`) ON UPDATE CASCADE
);


CREATE TABLE `users` (
`username` varchar(50) NOT NULL,
`password` varchar(50) NOT NULL,
`fullname` varchar(50) NOT NULL,
`gioi_tinh` varchar(50) NOT NULL,
`email` varchar(50) NOT NULL,
`sdt` varchar(50) NOT NULL,
`dia_chi` varchar(50) NOT NULL,
`chuc_vu` varchar(50) NOT NULL,
PRIMARY KEY (`username`)
);
CREATE TABLE `sinhvien` (
`sinh_vien_id` int(4) NOT NULL AUTO_INCREMENT,
`users_id` varchar(50) NOT NULL,
`lbl_id` int(4) NOT NULL,
`fullname` varchar(50) NOT NULL,
`ngay_sinh` datetime NOT NULL,
`gioi_tinh` varchar(50) NOT NULL,
`email` varchar(50) NOT NULL,
`sdt` varchar(50) NOT NULL,
`dia_chi` varchar(50) NOT NULL,
`que_quan` varchar(50) NOT NULL,
`cmnd` varchar(50) NOT NULL,
`diem` tinyint(4) NOT NULL,
PRIMARY KEY (`sinh_vien_id`),
KEY `fk_sinhvien_users_idx` (`users_id`),
KEY `fk_sinhvien_loaibanglai_idx` (`lbl_id`),
CONSTRAINT `fk_sinhvien_users` FOREIGN KEY (`users_id`) REFERENCES `users` (`username`) ON UPDATE CASCADE,
CONSTRAINT `fk_sinhvien_loaibanglai` FOREIGN KEY (`lbl_id`) REFERENCES `loaibanglai` (`lbl_id`) ON UPDATE CASCADE
);
CREATE TABLE `ngaythi` (
`id_ngay_thi` int(4) NOT NULL AUTO_INCREMENT,
`sinh_vien_id` int(4) NOT NULL,
`ngay_thi` datetime NOT NULL,
PRIMARY KEY (`id_ngay_thi`),
KEY `fk_ngaythi_sinhvien_idx` (`sinh_vien_id`),
CONSTRAINT `fk_ngaythi_sinhvien` FOREIGN KEY (`sinh_vien_id`) REFERENCES `sinhvien` (`sinh_vien_id`) ON UPDATE CASCADE
);
CREATE TABLE `chitietthi`(
`id` INT(4) not null auto_increment,
`sv_id` int(4) NOT NULL,
`ten_cau_hoi` nvarchar(500),
`cau_chon` nvarchar(500),
`dap_an_dung` nvarchar(500),
`ket_qua` nvarchar(50),
PRIMARY KEY (`id`),
KEY `fk_chitietthi_sinhvien_idx` (`sv_id`),
CONSTRAINT `fk_chitietthi_sinhvien` FOREIGN KEY (`sv_id`) REFERENCES `sinhvien` (`sinh_vien_id`) ON UPDATE CASCADE
);
insert into `users` values('admin', 'admin','Trần Châu Tú', 'Nam', 'tranchautu@gmail.com','0799999999','Hồ Chí Minh','ADMINISTRATOR');
insert into `users` values('staff', 'staff','Trần Tú Châu', 'Nam', 'tuchautran@gmail.com','0788888888','Hà Nội','STAFF');
insert into `loaibanglai` values(1,'Hạng A1');
insert into `loaibanglai` values(2,'Hạng A2');
insert into `loaibanglai` values(3,'Hạng A3');
insert into `loaibanglai` values(4,'Hạng A4');
insert into `loaibanglai` values(5,'Hạng B1');
insert into `loaibanglai` values(6,'Hạng B2');
insert into `loaibanglai` values(7,'Hạng C');
insert into `loaibanglai` values(8,'Hạng D');
insert into `loaibanglai` values(9,'Hạng E');
insert into `loaibanglai` values(10,'Hạng F');
insert into `loaibanglai` values(11,'Hạng FB2');
insert into `loaibanglai` values(12,'Hạng FC');
insert into `loaibanglai` values(13,'Hạng FD');
insert into `loaibanglai` values(14,'Hạng FE');

