SELECT * FROM "Fakultet" WHERE "Drzavni/Privatni"="D"
SELECT "Naziv" FROM "Fakultet" WHERE "Drzavni/Privatni"="P"
SELECT COUNT(*) FROM "Fakultet" WHERE "Drzavni/Privatni"="D"
SELECT AVG("BrojStudenata") FROM "Fakultet" 
SELECT AVG("BrojStudenata") FROM "Fakultet" WHERE "Drzavni/Privatni"="D"
SELECT DISTINCT "Grad" FROM "Fakultet"
SELECT SUM("BrojStudenata") FROM "Fakultet"
SELECT "Ime","Prezime" FROM "Student"
SELECT * FROM "Student" WHERE "GodinaStudija"=3
SELECT * from "Student" WHERE "Prosek"= (SELECT MAX("Prosek") from "Student") 
SELECT * from "Student" WHERE "Prosek"= (SELECT MAX("Prosek") from "Student" where "GodinaStudija"=3) 
SELECT AVG("Prosek") FROM "Student" WHERE "GodinaStudija"=4
SELECT AVG("Prosek") FROM "STUDENT" WHERE "Pol"="M"
SELECT * FROM "STUDENT" WHERE "Prosek" IS NULL
SELECT * FROM "Student" WHERE "Prosek" IS NOT NULL
SELECT * FROM "Student" WHERE "Prosek">(SELECT AVG("PROSEK") FROM "Student")