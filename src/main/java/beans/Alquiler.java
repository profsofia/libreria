package beans;

import java.sql.Date;

public class Alquiler {
	private int id;
	private String nombreUsuario;
	private Date fecha;
	
	private String genero;
	private boolean novedad;
	
	public Alquiler(int id, String nombreUsuario, Date fecha, String genero, boolean novedad) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.fecha = fecha;
		this.genero = genero;
		this.novedad = novedad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean isNovedad() {
		return novedad;
	}
	public void setNovedad(boolean novedad) {
		this.novedad = novedad;
	}
	
}
