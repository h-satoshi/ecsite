set names utf8;

set foreign_key_checks = 0;

/*「ecsite」というデータベースがあったら、削除する*/
drop database if exists ecsite;

/*「ecsite」データベースを作成する*/
create database if not exists ecsite;

/*「ecsite」を利用する*/
use ecsite;

/*「ecsite」にlogin_user_transactionというテーブルがあったら、削除する*/
drop table if exists login_user_transaction;

/*login_user_transactionに情報を保存する*/
create table login_user_transaction(
id int not null primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(50),
insert_date datetime,
updated_date datetime
);
	
/*「ecsite」にitem_info_transactionというテーブルがあったら、削除する*/
drop table if exists item_info_transaction;

/*item_info_transactionに情報を保存する*/
create table item_info_transaction(
id int not null primary key auto_increment,
item_name varchar(30),
item_price int,
item_stock int,
insert_date datetime,
update_date datetime
);

/*「ecsite」にuser_buy_item_transactionというテーブルがあったら、削除する*/
drop table if exists user_buy_item_transaction;	

/*user_buy_item_transactionに情報を保存する*/
create table user_buy_item_transaction(
id int not null primary key auto_increment,
item_transaction_id int,
total_price int,
total_count int,
user_master_id varchar(16),
pay varchar(30),
insert_date datetime,
delete_data datetime
);

/*item_info_transactionに情報を格納する*/
INSERT INTO item_info_transaction(item_name, item_price, item_stock)
VALUES("ノートBook",100,50);

/*login_user_transactionに情報を格納する*/
INSERT INTO login_user_transaction(login_id, login_pass, user_name)
VALUES("diworks","diworks01","test");