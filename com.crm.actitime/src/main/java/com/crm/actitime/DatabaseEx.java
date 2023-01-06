package com.crm.actitime;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class DatabaseEx {

	public static void main(String[] args) throws SQLException {
Driver db=new Driver();
DriverManager.registerDriver(db);
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weekend","root","root");
Statement statement = connection.createStatement();
ResultSet result = statement.executeQuery("select * from employee");
while(result.next()) {
	System.out.println(result.getString("ename")+"  "+result.getInt("eid"));
}
statement.executeUpdate("insert into employee values('Mahesh',4,40000);");
connection.close();
statement.close();
	}
}
