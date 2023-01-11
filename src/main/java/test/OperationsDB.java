package test;
import java.sql.Statement;
import conection.DBconection;

public class OperationsDB {
 public static void main(String[] args) {
	 update(1, "Historia");
	 
 }
 
 public static void update(int id, String genero) {
	 DBconection connection = new DBconection();
	 String sql = "UPDATE libros SET genero = '"+ genero + "' where id = " + id;
	 try {
		 if(connection != null) {
			//java.sql el objeto Statement nos permite realizar consultas.
			 System.out.println(connection);
			 Statement st = connection.getConnection().createStatement();
			 //le pasamos la consulta que queremos ejecutar.
			 st.executeQuery(sql);
		 }
	 }
	 catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	 finally {
		 //siempre llamamos al método que desconecta.
		 connection.logOff();
	 }
 }
}
