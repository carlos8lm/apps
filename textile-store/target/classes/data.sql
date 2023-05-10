CREATE TABLE IF NOT EXISTS Prices(
	brand_id int NOT NULL,
	start_date varchar(50) NOT NULL,
	end_date varchar(50) NOT NULL,
	price_list int NOT NULL,
	product_id int NOT NULL,
	priority int NOT NULL,
	price double NOT NULL,
	curr varchar(50) NOT NULL	
);

INSERT INTO PRICES (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) 
VALUES (1, '2020-06-14-00.00.00', '2020-06-14-00.00.00', 1, 35455, 0, 35.50, 'EUR');

INSERT INTO PRICES (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) 
VALUES (1, '2020-06-14-15.00.00', '2020-06-14-15.00.00', 2, 35455, 1, 25.45, 'EUR');

INSERT INTO PRICES (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) 
VALUES (1, '2020-06-14-15.00.00', '2020-06-15-11.00.00', 3, 35455, 1, 30.50, 'EUR');

INSERT INTO PRICES (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) 
VALUES (1, '2020-06-15-16.00.00', '2020-12-31-23.59.59', 4, 35455, 1, 38.95, 'EUR');
