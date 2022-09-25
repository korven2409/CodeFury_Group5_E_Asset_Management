create database E_Asset_Management;
use E_Asset_Management;
create table `User`(
	`Id` int primary key auto_increment,
    `Name` varchar(20),
    `Role` varchar(20),
    `Telephone` varchar(10),
    `Email` varchar(20),
    `UserName` varchar(20),
    `Password` varchar(20)
);
create table `Asset`(
	`Id` int primary key auto_increment,
    `Name` varchar(20),
    `Type` varchar(20),
    `Description` varchar(60),
    `Date added` varchar(30),
    `isAvailable` varchar(5),
    `lending time` varchar(20),
    `fine price` int,
    `ban penalty` varchar(30)

);
create table `Manage Assets`(
	`Asset` varchar(20),
    `Lending Period` varchar(20),
    `Late return fee/day` int,
    `No. of days borrower is banned from borrowing for late return` varchar(50)
);
select* from user;
insert into user(`Name`,`Role`,`Telephone`,`Email`,`UserName`,`Password`) values("John","admin","112-938-39","john@hotmail.com","johnadmin","@123#%");


insert into user(`Name`,`Role`,`Telephone`,`Email`,`UserName`,`Password`) values("sedrwed","sdfe","gfhtrt","grtsrfg","fgdre","fdgser");
delete from user where id=22;
select* from user where `UserName` = "lucasfilms";
select* from asset;

insert into asset(`Name`,`Type`,`Description`,`Date Added`,`isAvailable`,`lending time`,`fine price`,`ban penalty`) values("HP Pavilion 360","Laptop","Pavilion 360 is a touch laptop with stylus facility","2020-09-23","Yes","10 days",100,"14 days");
insert into asset(`Name`,`Type`,`Description`,`Date Added`,`isAvailable`,`lending time`,`fine price`,`ban penalty`) values("OnePlus 10T","Mobile","16GB RAM, 256GB internal storage, 6.7 inches screen, Android","2021-07-13","Yes","15 days",75,"10 days");
insert into asset(`Name`,`Type`,`Description`,`Date Added`,`isAvailable`,`lending time`,`fine price`,`ban penalty`) values("Lenovo WorkStation","Desktop","Model-P340, HDD- 1Tb,Processor-Corei7","2019-10-07","No","20 days",150,"30 days");
insert into asset(`Name`,`Type`,`Description`,`Date Added`,`isAvailable`,`lending time`,`fine price`,`ban penalty`) values("JDBC Programming","Book","Features in-depth coverage of ODBC,SQL","2018-11-30","Yes","7 days",15,"Till current item is returned");
delete from user where id=31;
delete from asset where id=7;