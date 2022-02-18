## Intro

SMV APP is a Java desktop application that serves to record customers, their vehicles, workers and services performed on specific vehicles. The user interface of the application is created in the Swing environment, while the data is stored in the MariaDB database(local storage) thanks to Hibernate ORM.

## Used tools

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

## Summary

The application consists of a main window within which there is a main menu (jMenu) through which it is possible to access various categories of this application. A number of controls are responsible for the correct operation of the application, and a certain security in the form of roles has been implemented. The application is used by operators and administrators where the administrator has insight into all categories of the application, and the operator has the ability to use only certain functions such as entering clients, vehicles and services. The administrator has the ability to enter, change and delete workers, operators and brands of vehicles that the service has the ability to service. This process is due to the authorization at the very beginning of the application launch, where it is necessary to enter the appropriate email address and password to access the application.

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Prijava%20admin.PNG" />
</p>

After successfully logging in to the application, the home screen opens. On the home screen, there is a "Main Menu" jMenu component that allows you to navigate within the application and open individual windows. The display of the main menu depends on the role or whether the application was used by an administrator or an operator.

<p align="left">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Admin%20view.PNG" />
</p>

<p align="right">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Operater%20view.PNG" />
</p>

* The "Klijenti" category allows you to enter, change, print and delete clients from or in database(CRUDs). Clients can be searched and sorted in several ways using the implemented search engine.

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Klijenti%20view.PNG" />
</p>

* The "Vozila" category allows you to enter, change, print and delete vehicles from an individual client from / to a database (CRUD).

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Vozila%20view.PNG" />
</p>

* The "Servisi" category allows you to enter, change, print and delete services from / to databases (CRUD). There is an additional option for exporting JSON files in this category.

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Servisi%20view.PNG" />
</p>

* The "Marke" category allows you to enter, change, print and delete vehicle brands from / into the database (CRUD).

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Marke%20view.PNG" />
</p>

* The "Radnici" category allows you to enter, change, print and delete workers from the database (CRUD).

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Radnici%20view.PNG" />
</p>

* The "Operateri" category allows you to enter, change, print and delete operators from the database (CRUD).

<p align="center">
<img src="https://github.com/bfriscic/ZavrsniRad/blob/master/images/Operateri%20view.PNG" />
</p>

* The last option in the main menu is "Izlaz" which closes the application.

