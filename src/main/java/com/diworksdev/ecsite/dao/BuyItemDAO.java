package com.diworksdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.diworksdev.ecsite.dto.BuyItemDTO;
import com.diworksdev.ecsite.util.DBConnector;

public class BuyItemDAO {
	
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private BuyItemDTO buyItemDTO = new BuyItemDTO();
	
	public BuyItemDTO getBuyItemInfo() {
		//商品情報を取得する
		String sql = "SELECT id, item_neme, item_price FROM item_info_transaction";
		
		try {
			//SQL文を実行する
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				//DBから取得した情報をDTOクラスに格納する
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		//ActionクラスにDTOクラスを返す
		return buyItemDTO;
		
	}

}
