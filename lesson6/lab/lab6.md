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

INSERT INTO Hotel VALUES
   ('H01', 'Grosvenor Hotel', 'London'),
   ('H02', 'Ocean View', 'Miami'),
   ('H03', 'Mountain Retreat', 'Denver');

INSERT INTO Room VALUES
   ('101', 'H01', 'Single', 50.00),
   ('102', 'H01', 'Double', 35.00),
   ('103', 'H01', 'Family', 39.00),
   ('201', 'H02', 'Single', 70.00),
   ('202', 'H02', 'Double', 120.00),
   ('301', 'H03', 'Double', 65.00);

NSERT INTO Guest VALUES
   ('G01', 'Alice Smith', '23 London Rd, London'),
   ('G02', 'Bob Stone', '45 River Rd, Miami'),
   ('G03', 'Clara Oswald', '31 Queen St, London'),
   ('G04', 'David Tenn', '10 Aspen St, Denver');
   
NSERT INTO Booking VALUES
   ('H01', 'G01', '2024-08-01', '2024-08-05', '102'),
   ('H01', 'G03', '2024-08-02', NULL,         '103'),
   ('H01', 'G02', '2024-07-10', '2024-07-15', '101'),
   ('H02', 'G04', '2024-08-03', '2024-08-08', '202'),
   ('H01', 'G04', '2024-08-10', '2024-08-15', '101');

6.7 List full details of all hotels.
MySQL  localhost:3306 ssl  lab6  SQL > select * from hotel;
+---------+------------------+--------+
| hotelNo | hotelName        | city   |
+---------+------------------+--------+
| H01     | Grosvenor Hotel  | London |
| H02     | Ocean View       | Miami  |
| H03     | Mountain Retreat | Denver |
+---------+------------------+--------+
3 rows in set (0.0004 sec)


