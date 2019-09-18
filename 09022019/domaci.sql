SELECT "Odsek"."Naziv", COUNT("Kurs"."SifO") FROM "Odsek","Kurs" WHERE "Kurs"."SifO"="Odsek"."SifO" GROUP BY "Kurs"."SifO"
SELECT "Kurs"."Naziv" FROM "Kurs", "Pohadja", "Raspored" WHERE "Pohadja"."SifR"="Raspored"."SifR" AND "Raspored"."SifK"="Kurs"."SifK" GROUP BY ("Raspored"."SifK") HAVING COUNT("Pohadja"."SifS")>3
--treci skip
SELECT "Kurs"."Naziv" FROM "Kurs", "Pohadja", "Raspored" WHERE "Pohadja"."SifR"="Raspored"."SifR" AND "Raspored"."SifK"="Kurs"."SifK" AND "Pohadja"."SifS"=1
SELECT "Student"."Ime" FROM "Student","Pohadja", "Raspored" WHERE "Student"."SifS"="Pohadja"."SifS" AND "Pohadja"."SifR"="Raspored"."SifR" GROUP BY "Pohadja"."SifS" HAVING COUNT("Pohadja"."SifS")>2
SELECT "Student"."Ime" FROM "Student", "Pohadja", "Raspored" WHERE "Student"."SifS"="Pohadja"."SifS" AND "Pohadja"."SifR"="Raspored"."SifR" AND "Raspored"."SifU"=111 AND "Raspored"."Dan"="Pon"
SELECT "Kurs"."Naziv" FROM "Kurs", "Raspored","Pohadja" WHERE "Raspored"."SifP"=7 AND "Pohadja"."SifR"="Raspored"."SifR" AND "Kurs"."SifK"="Raspored"."SifK" GROUP BY ("Pohadja"."SifS") ORDER BY COUNT("Pohadja"."SifS") DESC LIMIT 1
SELECT "Kurs"."Naziv" FROM "Kurs", "Preduslov" WHERE "Preduslov"."SifK"=4 AND "Preduslov"."SifKP"="Kurs"."SifK"
SELECT "Kurs"."Naziv" , COUNT("Preduslov"."SifKP") FROM "Kurs", "Preduslov" WHERE "Preduslov"."SifK"="Kurs"."SifK" GROUP BY ("Preduslov"."SifK")
SELECT "Profesor"."Ime", COUNT("Pohadja"."SifS") FROM "Profesor", "Raspored", "Pohadja" WHERE "Profesor"."SifP"="Raspored"."SifP" AND "Raspored"."Dan"="Pon" AND "Pohadja"."SifR"="Raspored"."SifR" GROUP BY ("Raspored"."SifP")