package test;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import factory.DatabaseFactory;

public class ConnTest {

	public static void main(String[] args) {

		
		try{
			ResultSet rs = DatabaseFactory
					.createDatabase("oracle")
					.getConnection()
					.createStatement()
					.executeQuery("SELECT * FROM member");
			String name = "";
			while(rs.next()){
				name = rs.getString("name");
			}
			System.out.println("회원의 이름은:"+name);
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	}


