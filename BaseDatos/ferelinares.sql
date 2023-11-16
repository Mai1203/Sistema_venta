CREATE DATABASE IF NOT EXISTS ferelinares;

USE ferelinares;

DROP TABLE IF EXISTS clientes;

CREATE TABLE clientes (
	id_clien int NOT NULL AUTO_INCREMENT,
    dni int NOT NULL,
    nombre varchar(125) NOT NULL,
    direccion varchar(125) NOT NULL,
    telefono varchar(10) NOT NULL,
    fecha datetime DEFAULT current_timestamp,
	PRIMARY KEY (id_clien)
) ENGINE=InnoDB;

DROP TABLE IF EXISTS config;

CREATE TABLE config (
	id_config int NOT NULL AUTO_INCREMENT,
    ruc varchar(45) NOT NULL,
    nombre varchar(125) NOT NULL,
    direccion varchar(125) NOT NULL,
    telefono varchar(10) NOT NULL,
    razonsocial varchar(125) NOT NULL,
	PRIMARY KEY (id_config)
) ENGINE=InnoDB;

DROP TABLE IF EXISTS detalle_movimiento;

CREATE TABLE detalle_movimiento (
	id_detalle int NOT NULL AUTO_INCREMENT,
    descrip varchar (50),
    cod_produc varchar(25),
    cantidad int,
    precio decimal(10,2),
    id_venta int,
    fecha datetime DEFAULT current_timestamp,
	PRIMARY KEY (id_detalle)
) ENGINE=InnoDB;

DROP TABLE IF EXISTS caja_venta;

CREATE TABLE caja_venta(
	id_caja int NOT NULL AUTO_INCREMENT,
	caja decimal(10,2),
    PRIMARY KEY (id_caja)
)ENGINE=InnoDB;

DROP TABLE IF EXISTS productos;

CREATE TABLE productos (
	id_produc int NOT NULL AUTO_INCREMENT,
    codigo varchar(30) NOT NULL,
    producto varchar(125) NOT NULL,
    proveedor varchar(125) NOT NULL,
    stock int NOT NULL,
    precio decimal(10,2) NOT NULL,
    fecha datetime DEFAULT current_timestamp,
	PRIMARY KEY (id_produc)
) ENGINE=InnoDB;

DROP TABLE IF EXISTS proveedor;

CREATE TABLE proveedor (
	id_prove int NOT NULL AUTO_INCREMENT,
    dni int NOT NULL,
    nombre varchar(125) NOT NULL,
    direccion varchar(125) NOT NULL,
    telefono varchar(10) NOT NULL,
    fecha datetime DEFAULT current_timestamp,
	PRIMARY KEY (id_prove)
) ENGINE=InnoDB;

DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
	id_usu int NOT NULL AUTO_INCREMENT,
    username varchar(30) NOT NULL,
    password varchar(32) NOT NULL,
    email varchar(50) NOT NULL,
    rol varchar(25) NOT NULL,
    nombre varchar(50) NOT NULL,
    apellido varchar(50) NOT NULL,
	PRIMARY KEY (id_usu)
) ENGINE=InnoDB;

DROP TABLE IF EXISTS facturas;

CREATE TABLE facturas (
	id_factura int NOT NULL AUTO_INCREMENT,
    cliente varchar(45) NOT NULL,
    vendedor varchar(45) NOT NULL,
    tipo_pago varchar(45) NOT NULL,
    total varchar(45) NOT NULL,
    abono decimal(10,2) NOT NULL,
    saldo decimal(10,2) NOT NULL,
	fecha datetime DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id_factura)
) ENGINE=InnoDB;

DROP TABLE IF EXISTS movimientos;

CREATE TABLE movimientos(
	id_movimientos int NOT NULL AUTO_INCREMENT,
    tipo_movimiento varchar(45) NOT NULL,
    descripcion varchar(100),
    monto decimal(10,2) NOT NULL,
    id_factura int,
    fecha datetime DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id_movimientos)
) ENGINE=InnoDB;

INSERT INTO caja_venta (caja) VALUES (0.0);
INSERT INTO usuarios (username,password,email,rol,nombre,apellido) VALUES ("stiven","MTIwMzIwMDM=","maicolcoral@gmail.com","Administrador","Michael","Coral");
INSERT INTO config (ruc, nombre, direccion,telefono,razonsocial) VALUES ("10005", "FereLinares", "San Francisco","3158986561","razon Social");