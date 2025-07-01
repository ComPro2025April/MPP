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

INSERT INTO Guest VALUES
   ('G01', 'Alice Smith', '23 London Rd, London'),
   ('G02', 'Bob Stone', '45 River Rd, Miami'),
   ('G03', 'Clara Oswald', '31 Queen St, London'),
   ('G04', 'David Tenn', '10 Aspen St, Denver');
   
INSERT INTO Booking VALUES
   ('H01', 'G01', '2024-08-01', '2024-08-05', '102'),
   ('H01', 'G03', '2024-08-02', NULL,         '103'),
   ('H01', 'G02', '2024-07-10', '2024-07-15', '101'),
   ('H02', 'G04', '2024-08-03', '2024-08-08', '202'),
   ('H01', 'G04', '2024-08-10', '2024-08-15', '101');


--Simple queries
--6.7 List full details of all hotels.
SQL > select * from hotel;
+---------+------------------+--------+
| hotelNo | hotelName        | city   |
+---------+------------------+--------+
| H01     | Grosvenor Hotel  | London |
| H02     | Ocean View       | Miami  |
| H03     | Mountain Retreat | Denver |
+---------+------------------+--------+
3 rows in set (0.0004 sec)

--6.8 List full details of all hotels in London.
SQL > select * from hotel where city = 'London';
+---------+-----------------+--------+
| hotelNo | hotelName       | city   |
+---------+-----------------+--------+
| H01     | Grosvenor Hotel | London |
+---------+-----------------+--------+
1 row in set (0.0004 sec)

--6.9 List the names and addresses of all guests living in London, alphabetically ordered by name.
SQL > select guestName,guestAddress from guest where guestAddress like '%London%' order by guestName;
+--------------+----------------------+
| guestName    | guestAddress         |
+--------------+----------------------+
| Alice Smith  | 23 London Rd, London |
| Clara Oswald | 31 Queen St, London  |
+--------------+----------------------+
2 rows in set (0.0004 sec)

--6.10 List all double or family rooms with a price below £40.00 per night, in ascending order of price.
SQL > select * from room where type in ('Double','Family') and price < 40;
+--------+---------+--------+-------+
| roomNo | hotelNo | type   | price |
+--------+---------+--------+-------+
| 102    | H01     | Double |    35 |
| 103    | H01     | Family |    39 |
+--------+---------+--------+-------+
2 rows in set (0.0005 sec)

--6.11 List the bookings for which no dateTo has been specified.
SQL > select * from booking where dateTo is null;
+---------+---------+------------+--------+--------+
| hotelNo | guestNo | dateFrom   | dateTo | roomNo |
+---------+---------+------------+--------+--------+
| H01     | G03     | 2024-08-02 | NULL   | 103    |
+---------+---------+------------+--------+--------+
1 row in set (0.0004 sec)

--Aggregate functions
--6.12 How many hotels are there?
 SQL > select count(*) from hotel;
+----------+
| count(*) |
+----------+
|        3 |
+----------+
1 row in set (0.0007 sec)

--6.13 What is the average price of a room?
 SQL > select AVG(price) from room;
+--------------------+
| AVG(price)         |
+--------------------+
| 63.166666666666664 |
+--------------------+
1 row in set (0.0004 sec)

--6.14 What is the total revenue per night from all double rooms?
  SQL > select sum(price) from room where type='Double';
+------------+
| sum(price) |
+------------+
|        220 |
+------------+
1 row in set (0.0004 sec)

--6.15 How many different guests have made bookings for August?
SQL > select count(distinct guestNo) from booking where dateFrom between '2024-08-01' and '2024-08-30';
+-------------------------+
| count(distinct guestNo) |
+-------------------------+
|                       3 |
+-------------------------+
1 row in set (0.0004 sec)

--Subqueries and joins
--6.16 List the price and type of all rooms at the Grosvenor Hotel.
 SQL > select r.price, r.type from room r inner join hotel h on r.hotelNo = h.hotelNo where h.hotelName='Grosvenor Hotel';
+-------+--------+
| price | type   |
+-------+--------+
|    50 | Single |
|    35 | Double |
|    39 | Family |
+-------+--------+
3 rows in set (0.0005 sec)

--6.17 List all guests currently staying at the Grosvenor Hotel.
 SQL > select * from guest where guestNo in (select b.guestNo from booking b inner join hotel h on b.hotelNo = h.hotelNo where h.hotelName= 'Grosvenor Hotel') ;
+---------+--------------+----------------------+
| guestNo | guestName    | guestAddress         |
+---------+--------------+----------------------+
| G01     | Alice Smith  | 23 London Rd, London |
| G03     | Clara Oswald | 31 Queen St, London  |
| G02     | Bob Stone    | 45 River Rd, Miami   |
| G04     | David Tenn   | 10 Aspen St, Denver  |
+---------+--------------+----------------------+
4 rows in set (0.0005 sec)

select * from guest g
    inner join booking b on g.guestNo = b.guestNo
    inner join hotel h on b.hotelNo = h.hotelNo
    where h.hotelName='Grosvenor Hotel';
+---------+--------------+----------------------+---------+---------+------------+------------+--------+---------+-----------------+--------+
| guestNo | guestName    | guestAddress         | hotelNo | guestNo | dateFrom   | dateTo     | roomNo | hotelNo | hotelName       | city   |
+---------+--------------+----------------------+---------+---------+------------+------------+--------+---------+-----------------+--------+
| G01     | Alice Smith  | 23 London Rd, London | H01     | G01     | 2024-08-01 | 2024-08-05 | 102    | H01     | Grosvenor Hotel | London |
| G03     | Clara Oswald | 31 Queen St, London  | H01     | G03     | 2024-08-02 | NULL       | 103    | H01     | Grosvenor Hotel | London |
| G02     | Bob Stone    | 45 River Rd, Miami   | H01     | G02     | 2024-07-10 | 2024-07-15 | 101    | H01     | Grosvenor Hotel | London |
| G04     | David Tenn   | 10 Aspen St, Denver  | H01     | G04     | 2024-08-10 | 2024-08-15 | 101    | H01     | Grosvenor Hotel | London |
+---------+--------------+----------------------+---------+---------+------------+------------+--------+---------+-----------------+--------+
4 rows in set (0.0006 sec)

--6.18 List the details of all rooms at the Grosvenor Hotel, including the name of the guest staying in the room, if the room is occupied.
SQL > select * from guest g
       inner join booking b on g.guestNo = b.guestNo
       inner join hotel h on b.hotelNo = h.hotelNo
       inner join room r on b.roomNo = r.roomNo
       where h.hotelName='Grosvenor Hotel';
+---------+--------------+----------------------+---------+---------+------------+------------+--------+---------+-----------------+--------+--------+---------+--------+-------+
| guestNo | guestName    | guestAddress         | hotelNo | guestNo | dateFrom   | dateTo     | roomNo | hotelNo | hotelName       | city   | roomNo | hotelNo | type   | price |
+---------+--------------+----------------------+---------+---------+------------+------------+--------+---------+-----------------+--------+--------+---------+--------+-------+
| G01     | Alice Smith  | 23 London Rd, London | H01     | G01     | 2024-08-01 | 2024-08-05 | 102    | H01     | Grosvenor Hotel | London | 102    | H01     | Double |    35 |
| G03     | Clara Oswald | 31 Queen St, London  | H01     | G03     | 2024-08-02 | NULL       | 103    | H01     | Grosvenor Hotel | London | 103    | H01     | Family |    39 |
| G02     | Bob Stone    | 45 River Rd, Miami   | H01     | G02     | 2024-07-10 | 2024-07-15 | 101    | H01     | Grosvenor Hotel | London | 101    | H01     | Single |    50 |
| G04     | David Tenn   | 10 Aspen St, Denver  | H01     | G04     | 2024-08-10 | 2024-08-15 | 101    | H01     | Grosvenor Hotel | London | 101    | H01     | Single |    50 |
+---------+--------------+----------------------+---------+---------+------------+------------+--------+---------+-----------------+--------+--------+---------+--------+-------+
4 rows in set (0.0005 sec)

--6.19 What is the total income from bookings for the Grosvenor Hotel today?
 SQL > select sum(r.price) from guest g
        inner join booking b on g.guestNo = b.guestNo
        inner join hotel h on b.hotelNo = h.hotelNo
        inner join room r on b.roomNo = r.roomNo
        where h.hotelName='Grosvenor Hotel';
+--------------+
| sum(r.price) |
+--------------+
|          174 |
+--------------+
1 row in set (0.0006 sec)

--Grouping
--6.22 List the number of rooms in each hotel.
SQL > select hotelName,count(*)
        from room r join
        hotel h
        on r.hotelNo = h.hotelNo group by hotelName;
+------------------+----------+
| hotelName        | count(*) |
+------------------+----------+
| Grosvenor Hotel  |        3 |
| Ocean View       |        2 |
| Mountain Retreat |        1 |
+------------------+----------+
3 rows in set (0.0004 sec)

--6.23 List the number of rooms in each hotel in London.
 SQL > select hotelName,count(*)
       from room r
       join hotel h
       on r.hotelNo = h.hotelNo
       where h.city = 'London'
       group by hotelName;
+-----------------+----------+
| hotelName       | count(*) |
+-----------------+----------+
| Grosvenor Hotel |        3 |
+-----------------+----------+
1 row in set (0.0005 sec)

--6.24 What is the average number of bookings for each hotel in August?
SQL > SELECT AVG(booking_count) AS avg_bookings_per_hotel_in_august
          FROM (
               SELECT hotelNo, COUNT(*) AS booking_count
               FROM booking
               WHERE dateFrom between '2024-08-01' AND '2024-08-30'
               GROUP BY hotelNo
               ) AS hotel_bookings;
+----------------------------------+
| avg_bookings_per_hotel_in_august |
+----------------------------------+
|                           2.0000 |
+----------------------------------+
1 row in set (0.0005 sec)

