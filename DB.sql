-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.12-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping data for table examen.tbodega: ~4 rows (approximately)
DELETE FROM `tbodega`;
/*!40000 ALTER TABLE `tbodega` DISABLE KEYS */;
INSERT INTO `tbodega` (`id`, `nombre`) VALUES
	(1, 'Bodega Curridabat'),
	(2, 'Bodega Central'),
	(3, 'Bodega Guanacaste'),
	(4, 'Bodega Cartago');
/*!40000 ALTER TABLE `tbodega` ENABLE KEYS */;

-- Dumping data for table examen.tsuministro: ~4 rows (approximately)
DELETE FROM `tsuministro`;
/*!40000 ALTER TABLE `tsuministro` DISABLE KEYS */;
INSERT INTO `tsuministro` (`id`, `nombre`, `gradocalidad`, `cantidad`, `bodega`, `cantidadcaja`, `created`) VALUES
	(10, 'Botellas plasticas', 'A', 100, 'Bodega Curridabat', 0, '2020-01-01'),
	(11, 'Suero antiofídico', 'B', 10, 'Bodega Guanacaste', 0, '2020-02-02'),
	(12, 'Guantes', 'A', 200, 'Bodega Cartago', 5, '2020-02-02'),
	(13, 'Alcohol en gel', 'A', 25, 'Bodega Curridabat', 0, '2020-03-03');
/*!40000 ALTER TABLE `tsuministro` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
