package com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class DB {
	
	private static List<Empresa> listaEmpresas= new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNombre("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNombre("Celium");
		Empresa empresa3 = new Empresa();
		empresa3.setNombre("Ciena");
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
		listaEmpresas.add(empresa3);
	}
	
	public void agregarEmpresa(Empresa empresa) {
		DB.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresa(){
		return DB.listaEmpresas;
	}
	
}
