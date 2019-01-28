package factory;
import java.sql.Connection;
import java.sql.DriverManager;

public class Oracle implements Database {

	private Connection conn;
	private String driver, url, user, password;
	
	public Oracle(
			String driver,
			String url,
			String user,
			String password) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
	@Override
	public Connection getConnection() {
		conn = null;
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(
					url, 
					user, 
					password);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
}
