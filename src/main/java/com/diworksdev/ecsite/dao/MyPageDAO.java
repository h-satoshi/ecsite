package com.diworksdev.ecsite.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.diworksdev.ecsite.dto.MyPageDTO;
import com.diworksdev.ecsite.util.DBConnector;

public class MyPageDAO {
	
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	
	public ArrayList<MyPageDTO> getMyPageUserInfo(String item_transaction, String user_master_id) throws SQLException {
		
		ArrayList<MyPageDTO> myPageDTO = new ArrayList<MyPageDTO>();
		
		String spl = "SELECT ubit.id, iit.item_name, ubit.total_price, ubit.total_count, ubit.pay, ubit.insert_date "
					+ "FROM user_buy_item_transaction ubit "
					+ "LEFT JOIN item_info_transaction iit "
					+ "ON ubit.item_transaction_id = iit.id "
					+ "WHERE ubit.item_transaction_id = ? AND ubit.user_master_id = ? "
					+ "ORDER BY insert_date DESC";
		
	}

}
