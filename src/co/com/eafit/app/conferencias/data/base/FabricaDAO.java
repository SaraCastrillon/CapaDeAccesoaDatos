package co.com.eafit.app.conferencias.data.base;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.com.eafit.app.conferencias.data.dao.ConferenciaDAO;

public class FabricaDAO {

	public static ConferenciaDAO createConferenciaDAO(){
		Connection conn = crearConexion();
		return new ConferenciaDAO(conn);
		
	}
	
	public static Connection crearConexion(){
		Driver driver;
		Connection conn = null;
		try{
			driver = DriverManager.getDriver("com.mysql.Driver");
			conn= driver.connect("mysql://localhost:3693", null);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	}
	/*public static DAOGenerico createDAO(String nombreDAO){
		switch(nombreDAO){
		case "Conferencia":
			return new ConferenciaDAO();
		default:
			break;
		}
		return null;
	}*/

}
