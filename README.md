## Uvod

SMV APP je Java desktop aplikacija koja služi za evidenciju klijenata, njihovih vozila, radnika i servisa koji se obavljaju na određenim vozilima. Korisničko sučelje aplikacije izrađeno je u Swing okruženju, dok se podaci pohranjunu u MariaDB bazu podataka zahvaljujući Hibernate ORMu.

## Korišteni alati

* [Java JDK 14](https://www.oracle.com/java/technologies/javase/14-relnote-issues.html)
* [MariaDB](https://mariadb.org/)
* [Apache Netbeans IDE](http://netbeans.apache.org/)
* [Hibernate ORM](http://hibernate.org/orm/)
* [XAMPP](https://www.apachefriends.org/index.html)
* [Gson](https://github.com/google/gson)
* [DBeaver](https://dbeaver.io/)
* [Java Faker](https://github.com/DiUS/java-faker)
* [LGoodDatePicker](https://github.com/LGoodDatePicker/LGoodDatePicker)
* [VIN validator](https://gist.github.com/ubergesundheit/5626679)

## Sažetak

Aplikacija se sastoji od glavnog prozora unutar kojeg postoji glavni izbornik (jMenu) pomoću kojeg je moguće pristupiti raznim kategorijama ove aplikacije. Za ispravan rad aplikacije zaslužan je niz kontrola te je implementirana određena sigurnost u obliku uloga. Aplikaciju koriste operateri i administratori gdje administrator ima uvid u sve kategorije aplikacije, a operater ima mogućnost korištenja samo određenih funkcija poput unosa klijenata, vozila i servisa. Administrator ima mogućnost unosa, promjene i brisanja radnika, operatera te marki vozila koje servis ima mogućnost servisirati. Za ovaj proces zaslužna je autorizacija na samom početku pokretanja aplikacije gdje je potrebno unijeti odgovarajuću email adresu i lozinku za pristup aplikaciji. 

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Prijava%20admin.PNG" />
</p>

Nakon uspješne prijave u aplikaciju otvara se početni zaslon. Na početnom zaslonu nalazi se "Glavni izbornik" jMenu komponenta pomoću koje je moguće navigirati unutar aplikacije i otvarati pojedine prozore. Prikaz glavnog izbornika ovisi o ulozi odnosno koristili li aplikaciju administrator ili operater.

<p align="left">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Admin%20view.PNG" />
</p>

<p align="right">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Operater%20view.PNG" />
</p>

* Kategorija "Klijenti" omogućava unos, promjenu, ispis i brisanje klijenata iz(u baze podataka (CRUD). Klijente se može pretraživati i sortirati na više načina pomoću implementirane tražilice.

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Klijenti%20view.PNG" />
</p>

* Kategorija "Vozila" omogućava unos, promjenu, ispis i brisanje vozila od pojedinog klijenta iz/u baze podataka (CRUD).

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Vozila%20view.PNG" />
</p>

* Kategorija "Servisi" omogućava unos, promjenu, ispis i brisanje servisa iz/u baze podataka (CRUD). U ovoj kategoriji nalazi se i dodatna opcija za export JSON datoteke.

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Servisi%20view.PNG" />
</p>

* Kategorija "Marke" omogućava unos, promjenu, ispis i brisanje marki vozila iz/u baze podataka (CRUD).

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Marke%20view.PNG" />
</p>

* Kategorija "Radnici" omogućava omogućava unos, promjenu, ispis i brisanje radnika iz baze podataka (CRUD).

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Radnici%20view.PNG" />
</p>

* Kategorija "Operateri" omogućava omogućava unos, promjenu, ispis i brisanje operatera iz baze podataka (CRUD).

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Operateri%20view.PNG" />
</p>

* Posljednja opcija u glavnom izborniku je "Izlaz" pomoću koje se zatvara aplikacija.

Aplikacija pruža osnovne funkcije CRUD-a te postoji niz mogućnosti koje bi poboljšale rad aplikacije i omogućile bolju preglednost. Npr. unutar prozora "Servisi" moguće je postaviti dodatnu listu sa ispisom servisa koji su u tijeku i implementirati mogućnost ispisa računa. Ovo je samo jedan od primjera, no daljnji razvoj aplikacije planiram izvesti u obliku web aplikacije. :leaves:

