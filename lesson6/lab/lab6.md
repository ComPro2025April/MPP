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


Simple queries
6.7 List full details of all hotels.
SQL > select * from hotel;
+---------+------------------+--------+
| hotelNo | hotelName        | city   |
+---------+------------------+--------+
| H01     | Grosvenor Hotel  | London |
| H02     | Ocean View       | Miami  |
| H03     | Mountain Retreat | Denver |
+---------+------------------+--------+
3 rows in set (0.0004 sec)

6.8 List full details of all hotels in London.
SQL > select * from hotel where city = 'London';
+---------+-----------------+--------+
| hotelNo | hotelName       | city   |
+---------+-----------------+--------+
| H01     | Grosvenor Hotel | London |
+---------+-----------------+--------+
1 row in set (0.0004 sec)

6.9 List the names and addresses of all guests living in London, alphabetically ordered by name.
SQL > select guestName,guestAddress from guest where guestAddress like '%London%' order by guestName;
+--------------+----------------------+
| guestName    | guestAddress         |
+--------------+----------------------+
| Alice Smith  | 23 London Rd, London |
| Clara Oswald | 31 Queen St, London  |
+--------------+----------------------+
2 rows in set (0.0004 sec)

6.10 List all double or family rooms with a price below £40.00 per night, in ascending order of price.
6.11 List the bookings for which no dateTo has been specified.
Aggregate functions
6.12 How many hotels are there?
6.13 What is the average price of a room?
6.14 What is the total revenue per night from all double rooms?
6.15 How many different guests have made bookings for August?
Subqueries and joins
6.16 List the price and type of all rooms at the Grosvenor Hotel.
6.17 List all guests currently staying at the Grosvenor Hotel.
6.18 List the details of all rooms at the Grosvenor Hotel, including the name of the guest staying in the room, if the
room is occupied.
6.19 What is the total income from bookings for the Grosvenor Hotel today?
Grouping
6.22 List the number of rooms in each hotel.
6.23 List the number of rooms in each hotel in London.
6.24 What is the average number of bookings for each hotel in August?


