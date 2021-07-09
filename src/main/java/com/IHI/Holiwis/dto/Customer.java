package com.IHI.Holiwis.dto;

public class Customer {
	private int id;
	private String nombre;
	private String apellidos;
	private String rfc;
	private String correo;
	//private Region region;
	private int iDregion;
	
	public Customer() {super();}

	/*public Customer(int id, String nombre, String apellidos, String rfc, String correo, Region region) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rfc = rfc;
		this.correo = correo;
		this.region = region;
	}*/
	
	public Customer(int id, String nombre, String apellidos, String rfc, String correo, int iDregion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.rfc = rfc;
		this.correo = correo;
		this.iDregion = iDregion;
	}
	
	public int getId() {
		return id;
	}

	public int getiDregion() {
		return iDregion;
	}

	public void setiDregion(int iDregion) {
		this.iDregion = iDregion;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/*public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}*/
	
	
}
