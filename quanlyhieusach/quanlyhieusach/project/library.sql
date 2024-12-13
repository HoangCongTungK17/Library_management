-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th10 30, 2022 lúc 09:38 AM
-- Phiên bản máy phục vụ: 10.4.24-MariaDB
-- Phiên bản PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `library`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `author`
--

CREATE TABLE `author` (
  `Ten` varchar(50) NOT NULL,
  `link_fb` varchar(99) NOT NULL,
  `vaitro` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `author`
--

INSERT INTO `author` (`Ten`, `link_fb`, `vaitro`) VALUES
('Nguyễn Hoàng Minh Nhật', 'https://www.facebook.com/', 'Thành viên nhóm'),
('Nguyễn Ngọc Đan Trường', 'https://facebook.com/berlin.03', 'Trưởng nhóm'),
('Nguyễn Việt Anh', 'https://www.facebook.com/', 'Thành viên nhóm');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `danhmuc`
--

CREATE TABLE `danhmuc` (
  `id` varchar(30) NOT NULL,
  `ten` varchar(50) NOT NULL,
  `mota` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `danhmuc`
--

INSERT INTO `danhmuc` (`id`, `ten`, `mota`) VALUES
('001', 'Luyện Thi THPTQG', NULL),
('002', 'Sách Tham Khảo Cấp 1, 2, 3', NULL),
('003', 'Sách Tâm Lý', NULL),
('004', 'Sách Thiếu Nhi', NULL),
('005', 'Sách Tham Khảo Lớp 9', NULL),
('006', 'Sách Tiếng Anh', NULL),
('007', 'Ngoại Ngữ', NULL),
('008', 'Sách Mới', NULL),
('009', 'Sách Văn Học', NULL),
('010', 'Kỹ năng sống', NULL),
('011', 'Quản lý', NULL),
('012', 'Phật Giáo', NULL),
('013', 'Sách Y Học - Chăm Sóc Sức Khỏe', NULL),
('014', 'Sách Thường Thức Đời Sống', NULL),
('015', 'Truyện Tranh Thiếu Nhi', NULL),
('016', 'Kĩ năng-trí tuệ', NULL),
('017', 'Kiến thức', NULL),
('018', 'Kinh tế', NULL),
('019', 'Cha mẹ', NULL),
('020', 'In Lịch Tết 2023', NULL),
('021', 'Sách Về Danh Nhân', NULL),
('022', 'Lịch Sử', NULL),
('023', 'Vỡ Tập Tô - Tập Viết - Tập Vẽ', NULL),
('024', 'Sách Văn Học Việt Nam', NULL),
('025', 'Kỹ năng', NULL),
('026', 'Sách Văn Hoá - Du Lịch', NULL),
('027', 'Sách Triết Học - Tôn Giáo -Tâm Linh', NULL),
('028', 'Phong Thủy - Tử Vi', NULL),
('029', 'Từ Điển', NULL),
('030', 'Nữ Công Gia Chánh', NULL),
('031', 'Sức khỏe', NULL),
('032', 'Sách Y Học & Thể Dục Thể Thao', NULL),
('033', 'Tư Duy - Sống Đẹp', NULL),
('034', 'Khám Phá', NULL),
('035', 'Tư duy và học tập', NULL),
('036', 'Sách Tham Khảo Lớp 10', NULL),
('037', 'Truyện Cổ Tích', NULL),
('038', 'Khoa Học', NULL),
('039', 'Giáo trình', NULL),
('040', 'Luyện Thi English', NULL),
('041', 'Nuôi Dạy', NULL),
('042', 'KHXH', NULL),
('043', 'KHTN', NULL),
('044', 'Ngoại Văn', NULL),
('045', 'Bonsai', NULL),
('046', 'Chính trị', NULL),
('047', 'Sách Triết Học', NULL),
('048', 'Sách Toán Mẫu Giáo - Thiếu Nhi', NULL),
('049', 'Sách Văn Học Nước Ngoài', NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `inventory`
--

CREATE TABLE `inventory` (
  `user_id` varchar(10) NOT NULL,
  `inventory` varchar(2000) DEFAULT NULL,
  `cart` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `inventory`
--

INSERT INTO `inventory` (`user_id`, `inventory`, `cart`) VALUES
('001', NULL, NULL),
('002', NULL, NULL),
('003', '481:1,867:1', ''),
('004', NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khosach`
--

CREATE TABLE `khosach` (
  `book_id` varchar(10) NOT NULL,
  `book_name` varchar(40) NOT NULL,
  `tacgia` varchar(40) NOT NULL,
  `theloai` varchar(30) NOT NULL,
  `gia` int(14) NOT NULL,
  `soluong` int(5) NOT NULL,
  `luotxem` int(10) NOT NULL DEFAULT 0,
  `luotmua` int(3) NOT NULL DEFAULT 0,
  `image` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `khosach`
--

INSERT INTO `khosach` (`book_id`, `book_name`, `tacgia`, `theloai`, `gia`, `soluong`, `luotxem`, `luotmua`, `image`) VALUES
('001', 'Sách 01', '001', '001', 123456, 999, 1, 1, '1.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(30) NOT NULL,
  `user_id` varchar(10) NOT NULL,
  `banned` int(2) NOT NULL DEFAULT 0,
  `joined_date` date NOT NULL DEFAULT current_timestamp(),
  `isAdmin` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `login`
--

INSERT INTO `login` (`username`, `password`, `user_id`, `banned`, `joined_date`, `isAdmin`) VALUES
('admin', '1', '001', 0, '2022-09-25', 1),
('dantruong', '1', '004', 0, '2022-10-16', 0),
('guest', '1', '003', 0, '2022-09-29', 0),
('staff', '1', '002', 0, '2022-10-02', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `logs`
--

CREATE TABLE `logs` (
  `id` varchar(5) NOT NULL,
  `time` datetime(6) NOT NULL DEFAULT current_timestamp(6),
  `user_id` varchar(5) DEFAULT NULL,
  `user` varchar(50) DEFAULT NULL,
  `type` varchar(20) NOT NULL DEFAULT '',
  `action` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `logs`
--

INSERT INTO `logs` (`id`, `time`, `user_id`, `user`, `type`, `action`) VALUES
('00001', '2022-09-25 09:09:36.000000', '001', 'admin', 'super', 'CREATE PROJECT'),
('00002', '2022-10-21 22:13:52.134151', '003', 'Khách', 'buy', 'buy book ID : 011'),
('00003', '2022-10-21 22:14:21.979700', '003', 'Khách', 'buy', 'buy book ID : 011'),
('00004', '2022-10-21 22:43:05.723375', '002', 'Nhân viên', 'updatebook', 'update book ID : 006, Ten : Dám bị ghét'),
('00005', '2022-10-21 22:51:49.705708', '002', 'Nhân viên', 'updatebook', 'update book ID : -999, Ten : Đắc Nhân Tâm'),
('00006', '2022-10-21 22:59:50.584140', '002', 'Nhân viên', 'updatebook', 'update book ID : 001, Ten : Đắc Nhân Tâm'),
('00007', '2022-10-21 23:00:32.371686', '002', 'Nhân viên', 'addbook', 'add book Sach Ngoai Ngu, ID : 014'),
('00008', '2022-10-23 23:50:40.593961', '001', 'Đan Trường', 'addaccount', 'add account accso5'),
('00009', '2022-10-23 23:57:01.781610', '003', 'Khách', 'buy', 'buy book ID : 002');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `rate`
--

CREATE TABLE `rate` (
  `id_cmt` varchar(15) NOT NULL,
  `book_id` varchar(15) NOT NULL,
  `time` date NOT NULL DEFAULT current_timestamp(),
  `user` varchar(50) NOT NULL,
  `comment` varchar(500) NOT NULL,
  `star` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `rate`
--

INSERT INTO `rate` (`id_cmt`, `book_id`, `time`, `user`, `comment`, `star`) VALUES
('001', '001', '2022-10-10', '001', 'Sách này khá hay, nên đọc', 5),
('002', '001', '2022-10-10', '001', 'Sách này tốt, recommend nên mua', 4),
('003', '001', '2022-10-10', '001', 'Bìa cứng, đẹp lắm á', 4),
('004', '001', '2022-10-10', '001', 'Shipper hơi tệ, nhưng shop hỗ trợ tốt', 3),
('005', '001', '2022-10-10', '001', 'Shop giao sản phẩm lỗi', 1),
('006', '001', '2022-10-10', '001', 'Giao nhầm hàng nhưng không đổi trả', 2),
('007', '001', '2022-10-11', '003', 'Sách này cũng được', 4),
('008', '1332', '2022-10-14', '003', 'Sách này nói chung cũng hay', 5),
('009', '1187', '2022-10-14', '003', 'Sach nay hay', 4),
('010', '1287', '2022-10-16', '003', 'Sach kha hay', 5),
('011', '1040', '2022-10-16', '003', 'Sach hay nhieu nhieu', 4),
('012', '1366', '2022-10-19', '003', 'sach hay', 5),
('013', '481', '2022-10-26', '003', 'sach ok', 5);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `role`
--

CREATE TABLE `role` (
  `ten` varchar(30) NOT NULL,
  `mota` varchar(200) NOT NULL,
  `hesoluong` float NOT NULL,
  `luongcoban` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `role`
--

INSERT INTO `role` (`ten`, `mota`, `hesoluong`, `luongcoban`) VALUES
('Author', 'Đây là tác giả', 1, 10000000),
('Customer', 'Đây là khách', 0, 0),
('Manager', 'Đây là chức vụ quản lý cao nhất', 3, 10000000),
('Staff', 'Đây là chức vụ nhân viên', 2, 5000000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `user_id` varchar(10) NOT NULL,
  `Ten` varchar(40) DEFAULT NULL,
  `Gioi tinh` varchar(5) DEFAULT NULL,
  `Ngay sinh` date DEFAULT NULL,
  `Dia chi` varchar(50) DEFAULT NULL,
  `Sdt` varchar(13) DEFAULT NULL,
  `CMND` varchar(20) DEFAULT NULL,
  `avatar` varchar(20) DEFAULT NULL,
  `chucvu` varchar(30) DEFAULT NULL,
  `so_du` int(20) NOT NULL DEFAULT 100000
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `user`
--

INSERT INTO `user` (`user_id`, `Ten`, `Gioi tinh`, `Ngay sinh`, `Dia chi`, `Sdt`, `CMND`, `avatar`, `chucvu`, `so_du`) VALUES
('001', 'Đan Trường', 'Nam', '2003-12-04', 'Hà Đông', '012345', '1xxxxxxxxxxxx', 'avatar.png', 'Manager', 19999),
('002', 'Nhân viên', 'Nam', '2003-11-01', 'Ha Dong', '0795155630', '123456', 'girl.jpg', 'Staff', 29999),
('003', 'Khách', 'Nu', '2003-12-05', 'Ca Mau', '01292388', '2xxxxxxxxxxxx', 'profile.jpg', 'Customer', 493660860),
('004', 'Dan Truong', 'Nam', '2003-01-01', '', '', '', 'avatar.png', 'Customer', 100000);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `version`
--

CREATE TABLE `version` (
  `version` varchar(100) NOT NULL,
  `detail` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `version`
--

INSERT INTO `version` (`version`, `detail`) VALUES
('Version 1.0.0 (21/09/2022)', 'Triển khai Project và các base'),
('Version 1.0.1 (25/09/2022)', 'Thêm tính năng tự generate ID user'),
('Version 1.0.2 (28/09/2022)', 'Nâng cấp cho phép sửa thông tin sâu'),
('Version 1.0.2.a (01/10/2022)', 'Fix bug cũ'),
('Version 1.0.3 (04/10/2022)', 'Thêm tính năng cập nhật sách'),
('Version 1.0.4 (05/10/2022)', 'Thêm tính năng Preview ảnh khi upload'),
('Version 1.0.5 (07/10/2022)', 'Cập nhật tính năng nhật ký hệ thống'),
('Version 1.0.5 (09/10/2022)', 'Bổ sung 4 tính chất OOP'),
('Version 1.0.6 (10/10/2022)', 'Cập nhật tính năng rương đồ và giỏ hàng User'),
('Version 1.0.7 (10/10/2022)', 'Release tính năng mua sách trong hệ thống'),
('Version 1.0.8 (10/10/2022)', 'Release tính năng đánh giá sách trong hệ thống'),
('Version 1.0.9 (16/10/2022)', 'Release tính năng captcha xác thực người dùng'),
('Version 1.1.0 (18/10/2022)', 'Xây dựng panel thư viện');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `author`
--
ALTER TABLE `author`
  ADD PRIMARY KEY (`Ten`);

--
-- Chỉ mục cho bảng `danhmuc`
--
ALTER TABLE `danhmuc`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `inventory`
--
ALTER TABLE `inventory`
  ADD PRIMARY KEY (`user_id`);

--
-- Chỉ mục cho bảng `khosach`
--
ALTER TABLE `khosach`
  ADD PRIMARY KEY (`book_id`);

--
-- Chỉ mục cho bảng `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- Chỉ mục cho bảng `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `rate`
--
ALTER TABLE `rate`
  ADD PRIMARY KEY (`id_cmt`);

--
-- Chỉ mục cho bảng `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`ten`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- Chỉ mục cho bảng `version`
--
ALTER TABLE `version`
  ADD PRIMARY KEY (`version`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
