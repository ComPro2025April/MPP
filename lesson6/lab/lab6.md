

CREATE TABLE Hotel(
hotelNo VARCHAR(4) PRIMARY KEY,
hotelName VARCHAR(30),
city VARCHAR(30));



CREATE TABLE Room(
roomNo VARCHAR(4) PRIMARY KEY,
hotelNo VARCHAR(30),
type VARCHAR(30),
price double ,
FOREIGN KEY (hotelNo) REFERENCES Hotel(hotelNo)
);

CREATE TABLE Guest(
guestNo VARCHAR(4) PRIMARY KEY,
guestName VARCHAR(30),
guestAddress VARCHAR(100));



CREATE TABLE Booking(
hotelNo VARCHAR(4),
guestNo VARCHAR(30),
dateFrom Date,
dateTo Date ,
roomNo VARCHAR(30),
FOREIGN KEY (hotelNo) REFERENCES Hotel(hotelNo),
FOREIGN KEY (roomNo) REFERENCES Room(roomNo)
);


MySQL  localhost:3306 ssl  lab6  SQL > select * from hotel;
+---------+------------------+--------+
| hotelNo | hotelName        | city   |
+---------+------------------+--------+
| H01     | Grosvenor Hotel  | London |
| H02     | Ocean View       | Miami  |
| H03     | Mountain Retreat | Denver |
+---------+------------------+--------+
3 rows in set (0.0004 sec)

