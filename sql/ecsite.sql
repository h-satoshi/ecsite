set name utf8;

set foreign_key_cehcks = 0;

drop database if exists ecsite;

create database if not exists ecsite;			//ecsiteがデータベース名になる

use ecsite;

drop table if exists login_user_transaction;	//login_user_transactionがテーブル名

create table login_user_transactio(				//login_user_transactionに情報を保存する
	id int not null primary key auto_increment,
	login_id varchar(16) unique,
	login_pass varchar(16),
	user_name varchar(50),
	insert_date datetime,
	updated_date datetime
	);
	
drop table if exists item_info_transaction;

create table user_buy_item_transaction(
	id int not null primary key auto_increment,
	item_transaction_id int,
	total_price int,
	total_count int,
	user_master_id varchar(16),
	pay varchar(30),
	insert_date datetime,
	delete_date datetime
	);

INSERT INTO item_info_transaction(item_name, item_price, item_stock)
VALUES("ノートBook",100,50);