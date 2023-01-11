package conection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconection {
 static String bd = "libreria_db";
 static String port = "3306";
 static String user = "root";
 static String password = "sofia";
 
 //cadena de conexión jdbc es el protocolo de conexión
 static String url = "jdbc:mysql://localhost:"+ port + "/" + bd;
 //clase de java.sql
 Connection connection = null;
public DBconection() {
	try {
		Class.forName("org.mariadb.jdbc.Driver");
		connection = DriverManager.getConnection(url, user, password);
		
		if(connection == null) {
			System.out.println("La conexión a "+ bd + " ha fallado");
		}else {
			System.out.print("La conexión a "+ bd+ " fué exitosa");
		}
	}catch(Exception ex){
		System.out.println(ex.getMessage());		
	}
}

//Métodos
 
 public Connection getConnection () {
	 return connection;
 }
 public void logOff() {
	 connection = null;
 }
 
}
