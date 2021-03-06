package com.entity.other;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation Color. 
 * @author DeveUp.
 * @phone 3118398189.
 * @email deveup@gmail.com.
 * @version 1.0.0.0.
 */
public class Color implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<String> colores;
	
	///////////////////////////////////////////////////////
	// Builder
	///////////////////////////////////////////////////////
	public Color() {
		this.color();
	}
	
	///////////////////////////////////////////////////////
	// Method
	///////////////////////////////////////////////////////
	/**
	 * Metodo que inicializa los colores a usar.
	 */
	public void color() {
		this.colores= new ArrayList<String>();
		this.colores.add("rgb(255, 99, 132)");
		this.colores.add("rgb(54, 162, 235)");
		this.colores.add("rgb(216, 075, 032)");
		this.colores.add("rgb(001, 093, 082)");
		this.colores.add("rgb(255, 255, 000)");
		this.colores.add("rgb(250, 244, 227)");
		this.colores.add("rgb(255, 164, 032)");
		this.colores.add("rgb(059, 131, 189)");
	}
	
	///////////////////////////////////////////////////////
	// Getter y Setters
	///////////////////////////////////////////////////////
	public List<String> getColores() {
		return colores;
	}

	public void setColores(List<String> colores) {
		this.colores = colores;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
