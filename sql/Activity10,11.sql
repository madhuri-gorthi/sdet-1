REM   Script: Activity10
REM   Activity10

select * from order;

select * from scott.emp;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select * from orders;

select * from orders where purchase_amount between 1000 and 2000;

select * from orders;

select sum(purchase_amount) from orders;

select sum(purchase_amount) as maxamount   from orders;

select * from orders;

select max(purchase_amount) as maxamount ,customer_ID  from orders group by customerId;

select max(purchase_amount) as maxamount ,customer_ID  from orders group by customer_Id;

select max(purchase_amount) as maxamount ,customer_ID  from orders group by customer_Id , maxamount;

select max(purchase_amount) as maxamount ,customer_ID  from orders group by customer_Id , maxamount;

select * from orders;

select max(purchase_amount) as maxamount ,customer_ID  from orders where  order_date = to date("20120817","yyyymmdd");

select * from orders;

select max(purchase_amount) as maxamount ,customer_ID  from orders where  order_date = to date("20120817","yyyymmdd") group by salesman_id;

select max(purchase_amount) as maxamount ,customer_ID  from orders where  order_date = to_DATE("2012/08/17","YYYY/MM/DD") group by salesman_id;

select max(purchase_amount) as maxamount ,customer_ID  from orders where  order_date = To_DATE('2012/08/17', 'YYYY/MM/DD') group by salesman_id;

select * from orders;

select max(purchase_amount) as maxamount ,customer_ID  from orders where  order_date = To_DATE('2012/08/17', 'YYYY/MM/DD') group by salesman_id,order_Date;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders  
WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

select max(purchase_amount) as "maxamount" ,customer_ID  from orders where  order_date = To_DATE('2012/08/17', 'YYYY/MM/DD') group by salesman_id,order_Date;

select salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" from orders where order_date = To_DATE('2012/08/17', 'YYYY/MM/DD') group by salesman_id,order_Date;

select MAX(purchase_amount) AS maxamount from orders where order_date = To_DATE('2012/08/17', 'YYYY/MM/DD') group by salesman_id,order_Date;

select * from orders;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD');

select max(purchase_amount) as maxamount ,customer_ID  from orders;

SELECT salesman_id, order_date FROM orders WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD');

select * from orders;

SELECT salesman_id, order_date, MAX(purchase_amount) AS "Max Amount" FROM orders WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert ALl 
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005) 
select 1 from DUAL;

insert ALL 
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005) 
select 1 from DUAL;

insert ALL 
INTO customers VALUES(3002, 'Nick Rimando', 'New York', 100, 5001) 
INTO customers VALUES(3007, 'Brad Davis', 'New York', 200, 5001) 
INTO customers VALUES(3005, 'Graham Zusi', 'California', 200, 5002) 
INTO customers VALUES(3008, 'Julian Green', 'London', 300, 5002) 
INTO customers VALUES(3004, 'Fabian Johnson', 'Paris', 300, 5006) 
INTO customers VALUES(3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
INTO customers VALUES(3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
INTO customers VALUES(3001, 'Brad Guzan', 'London', 300, 5005) 
select 1 from DUAL;

select * from salesman;

select * from salesman;

CREATE TABLE salesman ( 
    salesman_id int, 
    salesman_name varchar2(32), 
    salesman_city varchar2(32), 
    commission int 
);

INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

select * from salesman;

select * from orders;

select * from customers;

select * from salesman 
where salesman.customer_id=customer.customer_id;

select * from salesman 
left outer join customer  
where salesman.customer_id=customer.customer_id;

select * from salesman 
left outer join customer  
on salesman.customer_id=customer.customer_id;

select * from salesman 
left outer join customers  
on salesman.customer_id=customers.customer_id;

select * from salesman 
left outer join customers  
on salesman.salesman_id=customers.salesman_id;

select * from salesman 
inner join customers  
on salesman.salesman_id=customers.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a  
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, c.name AS "Salesman", c.commission FROM customers a  
INNER JOIN salesman c 
ON a.salesman_id=c.salesman_id;

SELECT a.customer_name AS "Customer Name", a.city, c.salesman_name AS "Salesman", c.commission FROM customers a  
INNER JOIN salesman c 
ON a.salesman_id=c.salesman_id;

SELECT * FROM customers a  
INNER JOIN salesman c 
ON a.salesman_id=c.salesman_id;

select * from salesman 
inner join customers  
on salesman.salesman_id=customers.salesman_id;

SELECT * FROM customers a  
INNER JOIN salesman c 
ON a.salesman_id=c.salesman_id;

select * from salesman 
left outer  join customers  
on salesman.salesman_id=customers.salesman_id;

select * from customers c 
left outer join salesman s 
on c.salesman_id = s.salesman_id 
where c.grade<300;

select * from customers c 
right outer join salesman s 
on c.salesman_id = s.salesman_id 
where c.grade<300;

SELECT a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_name, a.city, a.grade, c.salesman_name AS "Salesman", a.city FROM customers a  
LEFT OUTER JOIN salesman c ON a.salesman_id=c.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_id, a.customer_name, a.city, a.grade, c.salesman_name AS "Salesman", a.city FROM customers a  
LEFT OUTER JOIN salesman c ON a.salesman_id=c.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_id, a.customer_name, a.city, a.grade, c.salesman_name AS "Salesman", a.city FROM customers a  
right OUTER JOIN salesman c ON a.salesman_id=c.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_id, a.salesman_id, a.customer_name, a.city, a.grade, c.salesman_name AS "Salesman", a.city FROM customers a  
right OUTER JOIN salesman c ON a.salesman_id=c.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

SELECT a.customer_id, a.salesman_id, a.customer_name, a.city, a.grade, c.salesman_name AS "Salesman", a.city FROM customers a  
right OUTER JOIN salesman c ON a.salesman_id=c.salesman_id WHERE c.commission>12 ;

SELECT a.customer_id, a.salesman_id, a.customer_name, a.city,c.commission, c.salesman_name AS "Salesman", a.city FROM customers a  
right OUTER JOIN salesman c ON a.salesman_id=c.salesman_id WHERE c.commission>12 ;

SELECT a.customer_id, a.salesman_id, a.customer_name, a.city,c.commission, c.salesman_name AS "Salesman", a.city FROM customers a  
left OUTER JOIN salesman c ON a.salesman_id=c.salesman_id WHERE c.commission>12;

SELECT a.customer_id, a.salesman_id, a.customer_name, a.city,c.commission, c.salesman_name AS "Salesman", a.city FROM customers a  
INNER JOIN salesman c ON a.salesman_id=c.salesman_id WHERE c.commission>12;

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.name AS "Salesman", c.commission FROM orders a  
INNER JOIN customers b ON a.customer_id=b.customer_id  
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.salesman_name AS "Salesman", c.commission FROM orders a  
INNER JOIN customers b ON a.customer_id=b.customer_id  
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;

select * from order a where salesman_id in (select salesman_id from orders where customer_id = 3007);

select * from orders where salesman_id in (select salesman_id from orders where customer_id = 3007);

select salesman_id from orders where customer_id = 3007;

select * from orders where salesman_id in (select salesman_id from orders where customer_id = 3007);

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM orders WHERE customer_id=3007);

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM salesman  WHERE salesman_city='paris');

SELECT * FROM orders 
WHERE salesman_id=(SELECT DISTINCT salesman_id FROM salesman  WHERE salesman_city='Paris');

SELECT * FROM orders 
WHERE salesman_id in (SELECT DISTINCT salesman_id FROM salesman  WHERE salesman_city='Paris');

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE city='New York');

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='New York');

SELECT * FROM orders 
WHERE salesman_id IN (SELECT salesman_id FROM salesman WHERE salesman_city='Paris');

select count(*) from customers where grades > (select avg(grade) from customers where city = 'New york');

select count(*) from customers where grade > (select avg(grade) from customers where city = 'New york');

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

select count(*) from customers where grade > (select avg(grade) from customers where city = 'New york') GROUP BY grade;

select avg(grade) from customers where city = 'New york';

select count(*) from customers where grade > (select avg(grade) from customers where city = 'New York');

select avg(grade) from customers where city = 'New York';

SELECT grade, COUNT(*) FROM customers 
GROUP BY grade HAVING grade>(SELECT AVG(grade) FROM customers WHERE city='New York');

select * from orders where salesmanid=(select max(commision) from salesman);

select * from orders where salesman_id=(select max(commision) from salesman);

select * from orders where salesman_id=(select max(commission) from salesman);

select max(commission) from salesman;

select * from orders where salesman_id=(select salesman_id  from salesman where commission= max(commission));

select * from orders where salesman_id=(select salesman_id from salesman where commission =(SELECT MAX(commission) FROM salesman));


SELECT customer_id, customer_name FROM customers a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id)
UNION
SELECT salesman_id, name FROM salesman a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id)
ORDER BY customer_name;



SELECT a.salesman_id, name, order_no, 'highest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date)
UNION
SELECT a.salesman_id, name, order_no, 'lowest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

