SELECT * FROM predmet
SELECT * FROM dosije WHERE mesto_rodjenja="Beograd"
SELECT mesto_rodjenja FROM dosije WHERE mesto_rodjenja IS NOT NULL
SELECT naziv FROM predmet WHERE bodovi>6
SELECT sifra, naziv FROM predmet WHERe bodovi>8 AND bodovi<15
SELECT * FROM ispit WHERE bodovi=81 OR bodovi=76 OR bodovi=59
SELECT * FROM ispit WHERE NOT bodovi=81 OR NOT bodovi=76 OR NOT bodovi=59
SELECT naziv, bodovi*1500 FROM predmet 
SELECT naziv,bodovi*1500 as "cena u dinarima" from predmet
SELECT * FROM predmet ORDER BY bodovi ASC
SELECT * FROM predmet ORDER BY bodovi DESC
SELECT * FROM predmet ORDER BY bodovi ASC, naziv DESC
SELECT ime,prezime, datum_rodjenja FROM dosije WHERE datum_rodjenja<'1995-10-10' AND datum_rodjenja>'1995-2-4' ORDER BY prezime DESC
SELECT oznaka_roka, COUNT(SELECT ocena FROM ispit WHERE ocena>5), COUNT(SELECT DISTINCT indeks FROM ispit WHERE ocena>5)  FROM ispit  GROUP BY (oznaka_roka)
SELECT ime,prezime FROM ispit,dosije WHERE ispit.indeks=dosije.indeks AND ispit.id_predmeta=1001 AND ispit.oznaka_roka="jan" AND ispit.ocena>5 AND ispit.godina_roka=2015 
SELECT AVG(bodovi) FROM ispit WHERE sifra=1021 AND godina_roka=2015 AND NOT ispit.oznaka_roka="apr"
SELECT COUNT(DISTINCT indeks) FROM ispit WHERE ocena>5
SELECT AVG(bodovi) FROM ispit WHERE indeks=20130023
SELECT AVG(ocena) FROM ispit WHERE ispit.godina_roka=2015 AND ispit.oznaka_roka="jan"
SELECT naziv FROM ispit,predmet WHERE ispit.id_predmeta=predmet.id_predmeta AND predmet.bodovi=6 AND ispit.oznaka_roka="jan" AND ispit.godina_roka=2015