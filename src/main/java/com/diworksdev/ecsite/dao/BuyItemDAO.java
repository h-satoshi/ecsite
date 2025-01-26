package com.diworksdev.ecsite.dao;

import java.sql.Connection;

import com.diworksdev.ecsite.dto.BuyItemDTO;
import com.diworksdev.ecsite.util.DBConnector;

public class BuyItemDAO {
	
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	
	public BuyItemDTO getBuyItemInfo() {
		
		String sql = "SELECT id, item_neme, item_price FROM item_info_transaction";
		
	}

}
