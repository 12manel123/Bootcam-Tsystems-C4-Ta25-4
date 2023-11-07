DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

CREATE TABLE peliculas (
    codigo INT PRIMARY KEY,
    nombre VARCHAR(100), 
    calificacion_edad INT
);

CREATE TABLE salas (
    codigo INT PRIMARY KEY,
    nombre VARCHAR(100),
    pelicula INT,
    FOREIGN KEY (Pelicula) REFERENCES Peliculas(Codigo)
);

INSERT INTO peliculas (codigo, nombre, calificacion_edad) VALUES
(1, 'El Rey León', 0),
(2, 'Toy Story 4', 0),
(3, 'Spider-Man: Lejos de Casa', 12),
(4, 'Joker', 18);

INSERT INTO salas (codigo, nombre, pelicula) VALUES
(101, 'Sala 1', 1),
(102, 'Sala 2', 2),
(103, 'Sala 3', 3),
(104, 'Sala 4', 1);
