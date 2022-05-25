CREATE TABLE aves(
	id INT NOT NULL AUTO_INCREMENT,
	nom CHAR(60),
	habitat CHAR(60),
	nubosidad VARCHAR(100),
	fuerza_viento CHAR(50),
	direccion_viento CHAR(30),
	sexo CHAR(10),
	temperatura CHAR(2),
	profundidad CHAR(4),
	tamaño CHAR(6),
	peso CHAR(6),
	parasitos CHAR(4),
	fecha CHAR(50),
	velocidad CHAR(6),
	PRIMARY KEY(id)
)engine=innodb DEFAULT CHARSET=utf8;

CREATE TABLE peces(
	id INT NOT NULL AUTO_INCREMENT,
	nom CHAR(60),
	habitat CHAR(60),
	nubosidad VARCHAR(100),
	fuerza_viento CHAR(50),
	direccion_viento CHAR(30),
	sexo CHAR(10),
	temperatura CHAR(2),
	profundidad CHAR(4),
	tamaño CHAR(6),
	peso CHAR(6),
	parasitos CHAR(4),
	fecha CHAR(50),
	embarcaciones CHAR(3),
	num_anzuelos CHAR(3),
	navegacion CHAR(50),
	cebo CHAR(50),
	PRIMARY KEY(id)
)engine=innodb DEFAULT CHARSET=utf8;

CREATE TABLE mamíferos(
	id INT NOT NULL AUTO_INCREMENT,
	nom CHAR(60),
	habitat CHAR(60),
	nubosidad VARCHAR(100),
	fuerza_viento CHAR(50),
	direccion_viento CHAR(30),
	sexo CHAR(10),
	temperatura CHAR(2),
	profundidad CHAR(4),
	tamaño CHAR(6),
	peso CHAR(6),
	parasitos CHAR(4),
	fecha CHAR(50),
	tipo CHAR(20),
	PRIMARY KEY(id)
)engine=innodb DEFAULT CHARSET=utf8;
