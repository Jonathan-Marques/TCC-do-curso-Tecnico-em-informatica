-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.6.26-log - MySQL Community Server (GPL)
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura do banco de dados para quatropatas
CREATE DATABASE IF NOT EXISTS `quatropatas` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `quatropatas`;


-- Copiando estrutura para tabela quatropatas.agenda
CREATE TABLE IF NOT EXISTS `agenda` (
  `id_agenda` int(11) NOT NULL AUTO_INCREMENT,
  `agenda_codpaciente` bigint(20) NOT NULL,
  `agenda_turno` varchar(10) DEFAULT NULL,
  `agenda_codmedico` bigint(20) NOT NULL,
  `agenda_data` date DEFAULT NULL,
  `agenda_motivo` varchar(100) NOT NULL,
  `agenda_status` varchar(15) NOT NULL,
  PRIMARY KEY (`id_agenda`),
  KEY `agenda_codpaciente_idx` (`agenda_codpaciente`),
  KEY `agenda_codmedico_idx` (`agenda_codmedico`),
  CONSTRAINT `agenda_codmedico` FOREIGN KEY (`agenda_codmedico`) REFERENCES `medicos` (`id_medico`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `agenda_codpaciente` FOREIGN KEY (`agenda_codpaciente`) REFERENCES `animal` (`cod_animal`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela quatropatas.agenda: ~15 rows (aproximadamente)
DELETE FROM `agenda`;
/*!40000 ALTER TABLE `agenda` DISABLE KEYS */;
INSERT INTO `agenda` (`id_agenda`, `agenda_codpaciente`, `agenda_turno`, `agenda_codmedico`, `agenda_data`, `agenda_motivo`, `agenda_status`) VALUES
	(1, 1, 'Vespetino', 2, '2016-09-22', 'febre', 'Atendimento'),
	(2, 1, 'matutino', 1, '2016-09-23', 'febre', 'aberto'),
	(3, 1, 'Vespertino', 2, '2016-09-25', 'Vaca louca', 'Aberto'),
	(4, 1, 'Matutino', 1, '2016-09-23', 'vaca louca', 'Aberto'),
	(5, 1, 'Matutino', 2, '2016-09-23', 'vaca louca', 'Aberto'),
	(6, 1, 'Matutino', 1, '2016-09-23', 'vaca louca', 'Aberto'),
	(7, 1, 'Matutino', 2, '2016-09-22', 'vaca loca ', 'Aberto'),
	(8, 1, 'Matutino', 1, '2016-09-22', 'vaca loca ', 'Aberto'),
	(9, 1, 'Matutino', 1, '2016-09-22', 'vaca loca ', 'Atendimento'),
	(10, 1, 'Matutino', 2, '2016-09-22', 'vaca loca ', 'Aberto'),
	(11, 1, 'Matutino', 1, '2016-09-22', 'vaca loca ', 'Aberto'),
	(12, 1, 'Matutino', 2, '2016-09-26', '', 'Atendimento'),
	(13, 1, 'Matutino', 2, '2016-09-26', '', 'Aberto'),
	(14, 1, 'Matutino', 2, '2016-09-26', '', 'Atendimento'),
	(15, 1, 'Matutino', 1, '2016-09-26', 'v', 'Atendimento');
/*!40000 ALTER TABLE `agenda` ENABLE KEYS */;


-- Copiando estrutura para tabela quatropatas.animal
CREATE TABLE IF NOT EXISTS `animal` (
  `cod_animal` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome_animal` varchar(50) NOT NULL,
  `especie` varchar(30) NOT NULL,
  `pelagem` varchar(30) NOT NULL,
  `sexo_animal` varchar(10) NOT NULL,
  `raca` varchar(30) DEFAULT NULL,
  `peso` decimal(10,2) NOT NULL,
  `data_nasci` char(8) DEFAULT NULL,
  `porte` varchar(50) DEFAULT NULL,
  `idade` char(2) DEFAULT NULL,
  `cod_proprietario` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`cod_animal`),
  KEY `cod_proprietario_idx` (`cod_proprietario`),
  CONSTRAINT `cod_proprietario` FOREIGN KEY (`cod_proprietario`) REFERENCES `cliente` (`cod_proprietario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela quatropatas.animal: ~0 rows (aproximadamente)
DELETE FROM `animal`;
/*!40000 ALTER TABLE `animal` DISABLE KEYS */;
INSERT INTO `animal` (`cod_animal`, `nome_animal`, `especie`, `pelagem`, `sexo_animal`, `raca`, `peso`, `data_nasci`, `porte`, `idade`, `cod_proprietario`) VALUES
	(1, 'Chaude', 'seila', 'seila', 'masculino', 'seila', 22.00, '101010', 'sei la', '6', 2);
/*!40000 ALTER TABLE `animal` ENABLE KEYS */;


-- Copiando estrutura para tabela quatropatas.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `cod_proprietario` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome_proprietario` varchar(50) NOT NULL,
  `RG` char(10) NOT NULL,
  `cpf` char(11) NOT NULL,
  `sexo_proprietario` varchar(10) NOT NULL,
  `data_nasci` char(8) DEFAULT NULL,
  `telefone` char(10) DEFAULT NULL,
  `celular` char(11) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `nome_rua` varchar(50) NOT NULL,
  `numero_casa` varchar(20) NOT NULL,
  `cep` varchar(45) NOT NULL,
  `bairro` varchar(45) NOT NULL,
  `estado` char(2) NOT NULL,
  `cidade` varchar(30) NOT NULL,
  PRIMARY KEY (`cod_proprietario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela quatropatas.cliente: ~1 rows (aproximadamente)
DELETE FROM `cliente`;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`cod_proprietario`, `nome_proprietario`, `RG`, `cpf`, `sexo_proprietario`, `data_nasci`, `telefone`, `celular`, `email`, `nome_rua`, `numero_casa`, `cep`, `bairro`, `estado`, `cidade`) VALUES
	(2, 'Jonathan', '234709921', '13606300743', 'masculino', '22071993', '2131578803', '21984420374', 'dota-marques@hotmail.com', 'Estrada sao domingos savio', '494', '23525033', 'Santa Cruz', 'RJ', 'Rio de Janeiro'),
	(3, '', '', '', 'masculino', '', '', '', '', '', '', '', '', 'AC', '');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;


-- Copiando estrutura para tabela quatropatas.consulta
CREATE TABLE IF NOT EXISTS `consulta` (
  `id_consulta` int(11) NOT NULL AUTO_INCREMENT,
  `consulta_cod_agenda` int(11) DEFAULT NULL,
  `consulta_diagnostico` varchar(50) DEFAULT NULL,
  `consulta_obs` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_consulta`),
  KEY `agenda_idx` (`consulta_cod_agenda`),
  CONSTRAINT `agenda` FOREIGN KEY (`consulta_cod_agenda`) REFERENCES `agenda` (`id_agenda`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela quatropatas.consulta: ~0 rows (aproximadamente)
DELETE FROM `consulta`;
/*!40000 ALTER TABLE `consulta` DISABLE KEYS */;
/*!40000 ALTER TABLE `consulta` ENABLE KEYS */;


-- Copiando estrutura para tabela quatropatas.fornecedor
CREATE TABLE IF NOT EXISTS `fornecedor` (
  `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT,
  `fornecedor_nome` varchar(50) DEFAULT NULL,
  `fornecedor_endereco` varchar(50) DEFAULT NULL,
  `fornecedor_bairro` varchar(45) DEFAULT NULL,
  `fornecedor_cidade` varchar(45) DEFAULT NULL,
  `fornecedor_estado` varchar(45) DEFAULT NULL,
  `fornecedor_cnpj` varchar(45) DEFAULT NULL,
  `fornecedor_telefone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_fornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela quatropatas.fornecedor: ~1 rows (aproximadamente)
DELETE FROM `fornecedor`;
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
INSERT INTO `fornecedor` (`id_fornecedor`, `fornecedor_nome`, `fornecedor_endereco`, `fornecedor_bairro`, `fornecedor_cidade`, `fornecedor_estado`, `fornecedor_cnpj`, `fornecedor_telefone`) VALUES
	(3, 'Neo Quimica', 'Avenida Rio Branco', 'Centro', 'Rio de Janeiro', 'RJ', '00.000.000/0000-01', '(21)2230-5019');
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;


-- Copiando estrutura para tabela quatropatas.medicos
CREATE TABLE IF NOT EXISTS `medicos` (
  `id_medico` bigint(20) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `crm` int(11) DEFAULT NULL,
  `especialidade` varchar(50) NOT NULL,
  `cpf` char(11) NOT NULL,
  `rg` char(10) NOT NULL COMMENT '234709921',
  `telefone` varchar(10) NOT NULL,
  `celular` varchar(11) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `rua` varchar(45) DEFAULT NULL,
  `numero` varchar(45) DEFAULT NULL,
  `bairro` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_medico`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela quatropatas.medicos: ~2 rows (aproximadamente)
DELETE FROM `medicos`;
/*!40000 ALTER TABLE `medicos` DISABLE KEYS */;
INSERT INTO `medicos` (`id_medico`, `nome`, `crm`, `especialidade`, `cpf`, `rg`, `telefone`, `celular`, `email`, `rua`, `numero`, `bairro`) VALUES
	(1, 'Jonathan Santiago Marques', 564231813, 'Dermatologia', '13606300743', '234709921', '2131578803', '21984420374', 'dota-marques@hotmail.com', 'Estrada sao domingos savios', '494', 'Santa Cruz'),
	(2, 'John', 12121221, 'Anestesiologia', '11111111111', '234709921', '2131578803', '21984420374', 'dssdfsdfsdf', 'ssdfsdfsd', '4454545', 'dsfsdfs');
/*!40000 ALTER TABLE `medicos` ENABLE KEYS */;


-- Copiando estrutura para tabela quatropatas.produto
CREATE TABLE IF NOT EXISTS `produto` (
  `id_produto` int(11) NOT NULL AUTO_INCREMENT,
  `produto_nome` varchar(50) DEFAULT NULL,
  `produto_preco_compra` double DEFAULT NULL,
  `produto_preco_venda` double DEFAULT NULL,
  `produto_quantidade` int(11) DEFAULT NULL,
  `produtoco_codFornecedor` int(11) DEFAULT NULL,
  `produto_tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela quatropatas.produto: ~0 rows (aproximadamente)
DELETE FROM `produto`;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;


-- Copiando estrutura para tabela quatropatas.recipsonista
CREATE TABLE IF NOT EXISTS `recipsonista` (
  `id_recipsonista` int(11) NOT NULL AUTO_INCREMENT,
  `r_nome` varchar(45) DEFAULT NULL,
  `r_cpf` varchar(45) DEFAULT NULL,
  `r_rg` varchar(45) DEFAULT NULL,
  `r_email` varchar(45) DEFAULT NULL,
  `r_telefone` varchar(45) DEFAULT NULL,
  `r_celular` varchar(45) DEFAULT NULL,
  `r_datanasci` date DEFAULT NULL,
  `r_endereco` varchar(45) DEFAULT NULL,
  `r_bairro` varchar(45) DEFAULT NULL,
  `r_cidade` varchar(45) DEFAULT NULL,
  `r_estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_recipsonista`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela quatropatas.recipsonista: ~1 rows (aproximadamente)
DELETE FROM `recipsonista`;
/*!40000 ALTER TABLE `recipsonista` DISABLE KEYS */;
INSERT INTO `recipsonista` (`id_recipsonista`, `r_nome`, `r_cpf`, `r_rg`, `r_email`, `r_telefone`, `r_celular`, `r_datanasci`, `r_endereco`, `r_bairro`, `r_cidade`, `r_estado`) VALUES
	(1, 'Wanessa', '123.700.350-50', '22.071.991-2', 'Wanessa@wanessa.com.br', '(21)2255-5002', '(21)95460-2417', '1994-09-28', 'Rua do matadouro', 'Santa Cruz', 'RJ', 'Rio de Janeiro');
/*!40000 ALTER TABLE `recipsonista` ENABLE KEYS */;


-- Copiando estrutura para tabela quatropatas.usuarios
CREATE TABLE IF NOT EXISTS `usuarios` (
  `use_cod` bigint(20) NOT NULL AUTO_INCREMENT,
  `use_nome` varchar(80) NOT NULL,
  `use_usuario` varchar(30) NOT NULL,
  `use_senha` varchar(20) NOT NULL,
  `use_tipo` varchar(50) NOT NULL,
  PRIMARY KEY (`use_cod`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela quatropatas.usuarios: ~2 rows (aproximadamente)
DELETE FROM `usuarios`;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`use_cod`, `use_nome`, `use_usuario`, `use_senha`, `use_tipo`) VALUES
	(1, 'admin', 'admin', 'admin', 'Administrador'),
	(6, 'Jhonpllayer', 'John', '102030', 'Recepcionista');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
