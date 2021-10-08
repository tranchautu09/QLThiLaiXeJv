-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: sql_qlthilaixe
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cauhoi`
--

DROP TABLE IF EXISTS `cauhoi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cauhoi` (
  `id_cau_hoi` int NOT NULL AUTO_INCREMENT,
  `lbl_id` int NOT NULL,
  `ten_cau_hoi` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `dap_an_1` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `dap_an_2` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `dap_an_3` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `dap_an_4` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `dap_an_dung` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id_cau_hoi`),
  KEY `fk_cauhoi_loaibanglai_idx` (`lbl_id`),
  CONSTRAINT `fk_cauhoi_loaibanglai` FOREIGN KEY (`lbl_id`) REFERENCES `loaibanglai` (`lbl_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cauhoi`
--

LOCK TABLES `cauhoi` WRITE;
/*!40000 ALTER TABLE `cauhoi` DISABLE KEYS */;
INSERT INTO `cauhoi` VALUES (1,1,'Phần của đường bộ được sử dụng cho các phương tiện giao thông qua lại là gì?','Phần mặt đường và lề đường.','Phần đường xe chạy.','Phần đường xe cơ giới.','','Phần đường xe chạy.'),(2,1,'“Làn đường” là gì?','Là một phần của phần đường xe chạy được chia theo chiều dọc của đường, sử dụng cho xe chạy.','Là một phần của phần đường xe chạy được chia theo chiều dọc của đường, có bề rộng đủ cho xe chạy an toàn.','Là đường cho xe ô tô chạy, dừng, đỗ an toàn.\n','','Là một phần của phần đường xe chạy được chia theo chiều dọc của đường, có bề rộng đủ cho xe chạy an toàn.'),(3,1,'Trong các khái niệm dưới đây, “dải phân cách” được hiểu như thế nào là đúng?','Là bộ phận của đường để ngăn cách không cho các loại xe vào những nơi không được phép.','Là bộ phận của đường để phân tách phần đường xe chạy và hành lang an toàn giao thông.','Là bộ phận của đường để phân chia mặt đường thành hai chiều xe chạy riêng biệt hoặc để phân chia phần đường của xe cơ giới và xe thô sơ.','','Là bộ phận của đường để phân chia mặt đường thành hai chiều xe chạy riêng biệt hoặc để phân chia phần đường của xe cơ giới và xe thô sơ.'),(4,1,'“Dải phân cách” trên đường bộ gồm những loại nào?','Dải phân cách gồm loại cố định và loại di động.','Dải phân cách gồm tường chống ồn, hộ lan cứng và hộ lan mềm.','Dải phân cách gồm giá long môn và biển báo hiệu đường bộ.','','Dải phân cách gồm loại cố định và loại di động.'),(5,1,' Người lái xe được hiểu như thế nào trong các khái niệm dưới đây?','Là người điều khiển xe cơ giới.','Là người điều khiển xe thô sơ.','Là người điều khiển xe có súc vật kéo.','','Là người điều khiển xe cơ giới.'),(6,1,'Đường mà trên đó phương tiện tham gia giao thông được các phương tiện giao thông đến từ các hướng khác nhường đường khi qua nơi đường giao nhau, được cắm biển báo hiệu đường ưu tiên là loại đường gì?','Đường không ưu tiên','Đường tỉnh lộ.','Đường quốc lộ.','Đường ưu tiên.','Đường ưu tiên.'),(7,1,'Khái niệm “phương tiện giao thông cơ giới đường bộ” được hiểu như thế nào là đúng?','Gồm xe ô tô; máy kéo; xe mô tô hai bánh; xe mô tô ba bánh; xe gắn máy; xe cơ giới dùng cho người khuyết tật và xe máy chuyên dùng.','Gồm ô tô; máy kéo; rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo; xe mô tô hai bánh; xe mô tô ba bánh, xe gắn máy (kể cả xe máy điện) và các loại xe tương tự.','','','Gồm ô tô; máy kéo; rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo; xe mô tô hai bánh; xe mô tô ba bánh, xe gắn máy (kể cả xe máy điện) và các loại xe tương tự.'),(8,1,' Khái niệm “phương tiện giao thông thô sơ đường bộ” được hiểu như thế nào là đúng?','Gồm xe đạp (kể cả xe đạp máy, xe đạp điện), xe xích lô, xe lăn dùng cho người khuyết tật, xe súc vật kéo và các loại xe tương tự.','Gồm xe đạp (kể cả xe đạp máy, xe đạp điện), xe gắn máy, xe cơ giới dùng cho người khuyết tật và xe máy chuyên dùng.','Gồm xe ô tô, máy kéo, rơ moóc hoặc sơ mi rơ moóc được kéo bởi xe ô tô, máy kéo.','','Gồm xe đạp (kể cả xe đạp máy, xe đạp điện), xe xích lô, xe lăn dùng cho người khuyết tật, xe súc vật kéo và các loại xe tương tự.'),(9,1,'“Phương tiện tham gia giao thông đường bộ” gồm những loại nào?','Phương tiện giao thông cơ giới đường bộ.','Phương tiện giao thông thô sơ đường bộ và xe máy chuyên dùng.','Cả ý 1 và ý 2.','','Cả ý 1 và ý 2.'),(10,1,'“Người tham gia giao thông đường bộ” gồm những đối tượng nào?','Người điều khiển, người sử dụng phương tiện tham gia giao thông đường bộ.','Người điều khiển, dẫn dắt súc vật; người đi bộ trên đường bộ.','Cả ý 1 và ý 2.','','Cả ý 1 và ý 2.'),(11,1,'“Người điều khiển phương tiện tham gia giao thông đường bộ” gồm những đối tượng nào dưới đây?','Người điều khiển xe cơ giới, người điều khiển xe thô sơ.','Người điều khiển xe máy chuyên dùng tham gia giao thông đường bộ.','Cả ý 1 và ý 2.','','Cả ý 1 và ý 2.'),(12,1,'Khái niệm “người điều khiển giao thông” được hiểu như thế nào là đúng?','Là người điều khiển phương tiện tham gia giao thông tại nơi thi công, nơi ùn tắc giao thông, ở bến phà, tại cầu đường bộ đi chung với đường sắt.','Là cảnh sát giao thông, người được giao nhiệm vụ hướng dẫn giao thông tại nơi thi công, nơi ùn tắc giao thông, ở bến phà, tại cầu đường bộ đi chung với đường sắt.','Là người tham gia giao thông tại nơi thi công, nơi ùn tắc giao thông, ở bến phà, tại cầu đường bộ đi chung với đường sắt.','','Là cảnh sát giao thông, người được giao nhiệm vụ hướng dẫn giao thông tại nơi thi công, nơi ùn tắc giao thông, ở bến phà, tại cầu đường bộ đi chung với đường sắt.'),(13,1,'Trong các khái niệm dưới đây khái niệm “dừng xe” được hiểu như thế nào là đúng?','Là trạng thái đứng yên của phương tiện giao thông không giới hạn thời gian để cho người lên, xuống phương tiện, xếp dỡ hàng hóa hoặc thực hiện công việc khác.','Là trạng thái đứng yên tạm thời của phương tiện giao thông trong một khoảng thời gian cần thiết đủ để cho người lên, xuống phương tiện, xếp dỡ hàng hóa hoặc thực hiện công việc khác.','Là trạng thái đứng yên của phương tiện giao thông không giới hạn thời gian giữa 02 lần vận chuyển hàng hóa hoặc hành khách.','','Là trạng thái đứng yên tạm thời của phương tiện giao thông trong một khoảng thời gian cần thiết đủ để cho người lên, xuống phương tiện, xếp dỡ hàng hóa hoặc thực hiện công việc khác.'),(14,1,'Khái niệm “đỗ xe” được hiểu như thế nào là đúng?','Là trạng thái đứng yên của phương tiện giao thông có thời hạn trong một khoảng thời gian cần thiết đủ để cho người lên, xuống phương tiện, xếp dỡ hàng hóa hoặc thực hiện công việc khác.','Là trạng thái đứng yên của phương tiện giao thông không giới hạn thời gian.\n','','','Là trạng thái đứng yên của phương tiện giao thông không giới hạn thời gian.\n'),(15,1,'Cuộc đua xe chỉ được thực hiện khi nào?','Diễn ra trên đường phố không có người qua lại.','Được người dân ủng hộ.','Được cơ quan có thẩm quyền cấp phép.','','Được cơ quan có thẩm quyền cấp phép.'),(16,1,'Người điều khiển phương tiện giao thông đường bộ mà trong cơ thể có chất ma túy có bị nghiêm cấm hay không?','Bị nghiêm cấm.','Không bị nghiêm cấm.','Không bị nghiêm cấm, nếu có chất ma túy ở mức nhẹ, có thể điều khiển phương tiện tham gia giao thông.','','Bị nghiêm cấm.'),(17,1,'Sử dụng rượu, bia khi lái xe, nếu bị phát hiện thì bị xử lý như thế nào?','Chỉ bị nhắc nhở.','Bị xử phạt hành chính hoặc có thể bị xử lý hình sự tùy theo mức độ vi phạm.','Không bị xử lý hình sự.','','Bị xử phạt hành chính hoặc có thể bị xử lý hình sự tùy theo mức độ vi phạm.'),(18,1,'Theo luật phòng chống tác hại của rượu, bia, đối tượng nào dưới đây bị cấm sử dụng rượu, bia khi tham gia giao thông?','Người điều khiển: Xe ô tô, xe mô tô, xe đạp, xe gắn máy.','Người ngồi phía sau người điều khiển xe cơ giới.','Người đi bộ.','Cả ý 1 và ý 2.','Người điều khiển: Xe ô tô, xe mô tô, xe đạp, xe gắn máy.'),(19,1,'Hành vi điều khiển xe cơ giới chạy quá tốc độ quy định, giành đường, vượt ẩu có bị nghiêm cấm hay không?','Bị nghiêm cấm tùy trường hợp.','Không bị nghiêm cấm.','Bị nghiêm cấm.','','Bị nghiêm cấm.'),(20,1,' Khi lái xe trong khu đô thị và đông dân cư trừ các khu vực có biển cấm sử dụng còi, người lái xe được sử dụng còi như thế nào trong các trường hợp dưới đây?','Từ 22 giờ đêm đến 5 giờ sáng.','Từ 5 giờ sáng đến 22 giờ tối.','Từ 23 giờ đêm đến 5 giờ sáng hôm sau.','','Từ 5 giờ sáng đến 22 giờ tối.'),(21,1,'Người lái xe sử dụng đèn như thế nào khi lái xe trong khu đô thị và đông dân cư vào ban đêm?','Bất cứ đèn nào miễn là mắt nhìn rõ phía trước.','Chỉ bật đèn chiếu xa (đèn pha) khi không nhìn rõ đường.','Đèn chiếu xa (đèn pha) khi đường vắng, đèn pha chiếu gần (đèn cốt) khi có xe đi ngược chiều.','Đèn chiếu gần (đèn cốt).','Đèn chiếu gần (đèn cốt).'),(22,1,'Trong trường hợp đặc biệt, để được lắp đặt, sử dụng còi, đèn không đúng với thiết kế của nhà sản xuất đối với từng loại xe cơ giới bạn phải đảm bảo yêu cầu nào dưới đây?','Phải đảm bảo phụ tùng do đúng nhà sản xuất đó cung cấp.','Phải được chấp thuận của cơ quan có thẩm quyền.','Phải là xe đăng ký và hoạt động tại các khu vực có địa hình phức tạp.','','Phải được chấp thuận của cơ quan có thẩm quyền.'),(23,1,'Ở phần đường dành cho người đi bộ qua đường, trên cầu, đầu cầu, đường cao tốc, đường hẹp, đường dốc, tại nơi đường bộ giao nhau cùng mức với đường sắt có được quay đầu xe hay không?','Được phép.','Không được phép.','Tùy từng trường hợp.','','Không được phép.'),(24,1,'Bạn đang lái xe phía trước có một xe cảnh sát giao thông không phát tín hiệu ưu tiên bạn có được phép vượt hay không?','Không được vượt.','Được vượt khi đang đi trên cầu.','Được phép vượt khi đi qua nơi giao nhau có ít phương tiện cùng tham gia giao thông.','Được vượt khi đảm bảo an toàn.','Được vượt khi đảm bảo an toàn.'),(25,1,'Bạn đang lái xe phía trước có một xe cứu thương đang phát tín hiệu ưu tiên bạn có được phép vượt hay không?','Không được vượt.','Được vượt khi đang đi trên cầu.','Được phép vượt khi đi qua nơi giao nhau có ít phương tiện cùng tham gia giao thông.','Được vượt khi đảm bảo an toàn.','Không được vượt.'),(26,1,'Người điều khiển xe mô tô hai bánh, ba bánh, xe gắn máy có được phép sử dụng xe để kéo hoặc đẩy các phương tiện khác khi tham gia giao thông không?','Được phép','Nếu phương tiện được kéo, đẩy có khối lượng nhỏ hơn phương tiện của mình.','Tùy trường hợp.','Không được phép.','Không được phép.'),(27,1,'Khi điều khiển xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy, những hành vi buông cả hai tay; sử dụng xe để kéo, đẩy xe khác, vật khác; sử dụng chân chống của xe quệt xuống đường khi xe đang chạy có được phép hay không?','Được phép.','Tùy trường hợp.','Không được phép.','','Không được phép.'),(28,1,'Khi điều khiển xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy, những hành vi nào không được phép?','Buông cả hai tay; sử dụng xe để kéo, đẩy xe khác, vật khác; sử dụng chân chống của xe quệt xuống đường khi xe đang chạy.','Buông một tay; sử dụng xe để chở người hoặc hàng hóa; để chân chạm xuống đất khi khởi hành.','Đội mũ bảo hiểm; chạy xe đúng tốc độ quy định và chấp hành đúng quy tắc giao thông đường bộ.','Chở người ngồi sau dưới 16 tuổi.','Buông cả hai tay; sử dụng xe để kéo, đẩy xe khác, vật khác; sử dụng chân chống của xe quệt xuống đường khi xe đang chạy.'),(29,1,'Người ngồi trên xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy khi tham gia giao thông có được mang, vác vật cồng kềnh hay không?','Được mang, vác tùy trường hợp cụ thể.','Không được mang, vác.','Được mang, vác nhưng phải đảm bảo an toàn.','Được mang, vác tùy theo sức khỏe của bản thân.','Không được mang, vác.'),(30,1,'Người ngồi trên xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy khi tham gia giao thông có được bám, kéo hoặc đẩy các phương tiện khác không?','Được phép.\n','Được bám trong trường hợp phương tiện của mình bị hỏng.','Được kéo, đẩy trong trường hợp phương tiện khác bị hỏng.','Không được phép.','Không được phép.'),(31,1,'Người ngồi trên xe mô tô hai bánh, xe mô tô ba bánh, xe gắn máy khi tham gia giao thông có được sử dụng ô khi trời mưa hay không?','Được sử dụng.','Chỉ người ngồi sau được sử dụng.','Không được sử dụng.','Được sử dụng nếu không có áo mưa.','Không được sử dụng.'),(32,1,'Khi đang lên dốc người ngồi trên xe mô tô có được kéo theo người đang điều khiển xe đạp hay không?','Chỉ được phép nếu cả hai đội mũ bảo hiểm.','Không được phép.','Chỉ được thực hiện trên đường thật vắng.','Chỉ được phép khi người đi xe đạp đã quá mệt.','Không được phép.'),(33,1,'Hành vi sử dụng xe mô tô để kéo, đẩy xe mô tô khác bị hết xăng đến trạm mua xăng có được phép hay không?','Chỉ được kéo nếu đã nhìn thấy trạm xăng.','Chỉ được thực hiện trên đường vắng phương tiện cùng tham gia giao thông.','Không được phép.','','Không được phép.'),(34,1,'Hành vi vận chuyển đồ vật cồng kềnh bằng xe mô tô, xe gắn máy khi tham gia giao thông có được phép hay không?','Không được vận chuyển.','Chỉ được vận chuyển khi đã chằng buộc cẩn thận.','Chỉ được vận chuyển vật cồng kềnh trên xe máy nếu khoảng cách về nhà ngắn hơn 2 km.','','Không được vận chuyển.'),(35,1,'Người đủ bao nhiêu tuổi trở lên thì được điều khiển xe mô tô hai bánh, xe mô tô ba bánh có dung tích xi lanh từ 50 cm3 trở lên và các loại xe có kết cấu tương tự; xe ô tô tải, máy kéo có trọng tải dưới 3,5 tấn; xe ô tô chở người đến 9 chỗ ngồi?','16 tuổi.','18 tuổi.','17 tuổi.','','18 tuổi.'),(36,1,'Người đủ 16 tuổi được điều khiển các loại xe nào dưới đây?','Xe mô tô 2 bánh có dung tích xi lanh từ 50 cm3 trở lên.','Xe gắn máy có dung tích xi lanh dưới 50 cm3.','Xe ô tô tải dưới 3,5 tấn; xe chở người đến 9 chỗ ngồi.','Tất cả các ý nêu trên.','Xe gắn máy có dung tích xi lanh dưới 50 cm3.'),(37,1,'Người có giấy phép lái xe mô tô hạng A1 không được phép điều khiển loại xe nào dưới đây?','Xe mô tô có dung tích xi lanh 125 cm3.','Xe mô tô có dung tích xi lanh từ 175 cm3 trở lên.','Xe mô tô có dung tích xi lanh 100 cm3.','','Xe mô tô có dung tích xi lanh từ 175 cm3 trở lên.'),(38,1,'Người có giấy phép lái xe mô tô hạng A1 được phép điều khiển loại xe nào dưới đây?','Xe mô tô hai bánh có dung tích xi lanh từ 50 cm3 đến dưới 175 cm3.','Xe mô tô ba bánh dùng cho người khuyết tật.','Cả ý 1 và ý 2.','','Cả ý 1 và ý 2.');
/*!40000 ALTER TABLE `cauhoi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-08 16:17:48
