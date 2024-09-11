/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utilidades;

import javax.swing.table.DefaultTableModel;


public class ModeloTabla extends DefaultTableModel{
	
	String[] titulos;
	Object[][] datos;
	
	/**
	 * Determina el modelo con el que se va a construir la tabla
	 * @param datos
	 * @param titulos
	 */
	public ModeloTabla(Object[][] datos, String[] titulos) {
		super();
		this.titulos=titulos;
		this.datos=datos;
		setDataVector(datos, titulos);
	}
	
	public ModeloTabla() {
		// TODO Auto-generated constructor stub
	}

	public boolean isCellEditable (int row, int column)
	{
		//Definimos si una celda puede ser o no editable
		if (column!=utilidades.Hora && column!=utilidades.Apellido && column!=utilidades.Nombre && column!=utilidades.DNI && column!=utilidades.Obra_Social && column!=utilidades.Coseguro){   
	    	   return false; 
	       }else{
	    	   return true;
	       }
 
	}

}