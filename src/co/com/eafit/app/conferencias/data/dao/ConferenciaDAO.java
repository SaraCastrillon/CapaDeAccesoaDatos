package co.com.eafit.app.conferencias.data.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.app.conferencias.data.base.DAOGenerico;
import co.com.eafit.app.conferencias.data.base.ObjetoTO;
import co.com.eafit.app.conferencias.data.to.ConferenciaTO;

public class ConferenciaDAO implements DAOGenerico {

	java.sql.Connection conn;
	public ConferenciaDAO(Connection conn2) {
		this.conn = conn2;
	}

	@Override
	public ObjetoTO crear(ObjetoTO parametro) {
		ConferenciaTO conf = null;
		
		try{
			conf = (ConferenciaTO) parametro;
			PreparedStatement prep = conn.prepareStatement("INSERT INTO conferencias values(1,2,3)");
			prep.setString(1, conf.getNombre());
			prep.setString(2, conf.getNombreConferencista());
			prep.setString(3, conf.getTipo());
			
			
			Date fecha = new Date(conf.getFecha().getTime());
			
			prep.setDate(4, fecha);
			prep.setInt(5,  conf.getSillasDisponibles());
			int resultado = prep.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public Collection<ObjetoTO> recuperar(ObjetoTO parametros) {
		
		return null;
	}

	@Override
	public ObjetoTO update(ObjetoTO nuevoObjeto) {
		
		return null;
	}

	@Override
	public int borrar(ObjetoTO objetoaBorrar) {
		
		return 0;
	}

}
