-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema Estampados
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Estampados` ;

-- -----------------------------------------------------
-- Schema Estampados
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Estampados` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `Estampados` ;

-- -----------------------------------------------------
-- Table `Estampados`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Estampados`.`Usuario` (
  `idusuario` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(16) NOT NULL,
  `password` VARCHAR(32) NOT NULL,
  `create_time` DATETIME NULL,
  PRIMARY KEY (`idusuario`));


-- -----------------------------------------------------
-- Table `Estampados`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Estampados`.`Cliente` (
  `idcliente` INT NOT NULL AUTO_INCREMENT,
  `create_time` DATETIME NULL,
  `nombre` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `direccion` VARCHAR(45) NULL,
  `Usuario_idusuario` INT NOT NULL,
  INDEX `fk_Cliente_Usuario1_idx` (`Usuario_idusuario` ASC),
  PRIMARY KEY (`idcliente`),
  CONSTRAINT `fk_Cliente_Usuario1`
    FOREIGN KEY (`Usuario_idusuario`)
    REFERENCES `Estampados`.`Usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `Estampados`.`Artista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Estampados`.`Artista` (
  `idArtista` INT NOT NULL AUTO_INCREMENT,
  `create_time` DATETIME NULL,
  `nombre` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `direccion` VARCHAR(45) NULL,
  `Usuario_idusuario` INT NOT NULL,
  PRIMARY KEY (`idArtista`),
  INDEX `fk_Artista_Usuario1_idx` (`Usuario_idusuario` ASC),
  CONSTRAINT `fk_Artista_Usuario1`
    FOREIGN KEY (`Usuario_idusuario`)
    REFERENCES `Estampados`.`Usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


-- -----------------------------------------------------
-- Table `Estampados`.`Estampado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Estampados`.`Estampado` (
  `idestampado` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(45) NULL,
  `popularidad` INT NULL,
  `valor` INT NULL,
  `Artista_idArtista` INT NOT NULL,
  PRIMARY KEY (`idestampado`),
  INDEX `fk_Estampado_Artista1_idx` (`Artista_idArtista` ASC),
  CONSTRAINT `fk_Estampado_Artista1`
    FOREIGN KEY (`Artista_idArtista`)
    REFERENCES `Estampados`.`Artista` (`idArtista`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Estampados`.`Imagen`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Estampados`.`Imagen` (
  `idimagen` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(145) NULL,
  `Estampado_idestampado` INT NOT NULL,
  PRIMARY KEY (`idimagen`),
  INDEX `fk_Imagen_Estampado1_idx` (`Estampado_idestampado` ASC),
  CONSTRAINT `fk_Imagen_Estampado1`
    FOREIGN KEY (`Estampado_idestampado`)
    REFERENCES `Estampados`.`Estampado` (`idestampado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Estampados`.`Tema`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Estampados`.`Tema` (
  `idtema` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idtema`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Estampados`.`Compra`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Estampados`.`Compra` (
  `idcompra` INT NOT NULL AUTO_INCREMENT,
  `fecha` DATETIME NULL,
  `Cliente_idcliente` INT NOT NULL,
  PRIMARY KEY (`idcompra`),
  INDEX `fk_Compra_Cliente1_idx` (`Cliente_idcliente` ASC),
  CONSTRAINT `fk_Compra_Cliente1`
    FOREIGN KEY (`Cliente_idcliente`)
    REFERENCES `Estampados`.`Cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Estampados`.`Compra_has_Estampado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Estampados`.`Compra_has_Estampado` (
  `Compra_idcompra` INT NOT NULL,
  `Estampado_idestampado` INT NOT NULL,
  `cantidad` INT NULL,
  `tono` VARCHAR(45) NULL,
  `talla` VARCHAR(45) NULL,
  `estilo` VARCHAR(45) NULL,
  `ubicacion` VARCHAR(45) NULL,
  `texto` VARCHAR(45) NULL,
  `rating` INT NULL,
  PRIMARY KEY (`Compra_idcompra`, `Estampado_idestampado`),
  INDEX `fk_Compra_has_Estampado_Estampado1_idx` (`Estampado_idestampado` ASC),
  INDEX `fk_Compra_has_Estampado_Compra1_idx` (`Compra_idcompra` ASC),
  CONSTRAINT `fk_Compra_has_Estampado_Compra1`
    FOREIGN KEY (`Compra_idcompra`)
    REFERENCES `Estampados`.`Compra` (`idcompra`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compra_has_Estampado_Estampado1`
    FOREIGN KEY (`Estampado_idestampado`)
    REFERENCES `Estampados`.`Estampado` (`idestampado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Estampados`.`Estampado_has_Tema`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Estampados`.`Estampado_has_Tema` (
  `Estampado_idestampado` INT NOT NULL,
  `Tema_idtema` INT NOT NULL,
  PRIMARY KEY (`Estampado_idestampado`, `Tema_idtema`),
  INDEX `fk_Estampado_has_Tema_Tema1_idx` (`Tema_idtema` ASC),
  INDEX `fk_Estampado_has_Tema_Estampado1_idx` (`Estampado_idestampado` ASC),
  CONSTRAINT `fk_Estampado_has_Tema_Estampado1`
    FOREIGN KEY (`Estampado_idestampado`)
    REFERENCES `Estampados`.`Estampado` (`idestampado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Estampado_has_Tema_Tema1`
    FOREIGN KEY (`Tema_idtema`)
    REFERENCES `Estampados`.`Tema` (`idtema`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
