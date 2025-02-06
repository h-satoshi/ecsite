package com.diworksdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.ecsite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {
	
	private String loginUserId;
	private String loginPassword;
	private String userName;
	public Map<String, Object> session;
	
	private UserCreateCompleteDAO userCreateCompleteDAO=new UserCreateCompleteDAO();
	
	public String execute() throws SQLException {
		
		userCreateCompleteDAO.cerateUser(session.get("loginUserId").toString(),
										 session.get("loginPassword").toString(),
										 session.get("userName").toString());
		
	}

}
