package com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DB {
	
	private static List<Empresa> listaEmpresas= new ArrayList<>();
	private static Integer llaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(DB.llaveSequencial++);
		empresa.setNombre("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(DB.llaveSequencial++);
		empresa2.setNombre("Celium");
		Empresa empresa3 = new Empresa();
		empresa3.setId(DB.llaveSequencial++);
		empresa3.setNombre("Ciena");
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
		listaEmpresas.add(empresa3);
	}
	
	public void agregarEmpresa(Empresa empresa) {
		empresa.setId(DB.llaveSequencial++);
		DB.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresa(){
		return DB.listaEmpresas;
	}

	public void eliminarEmpresa(Integer id) {
		Iterator<Empresa> it= listaEmpresas.iterator();
		while (it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId()==id) {
				it.remove();
			}
			
		}
		
		for(Empresa empresa: listaEmpresas) {
			if(empresa.getId() == id) {
				listaEmpresas.remove(empresa);
			}
		}
		
	}

	public Empresa buscarEmpresaPorId(Integer id) {
		for (Empresa empresa : listaEmpresas) {
			if (empresa.getId()==id) {
				return empresa;
			}
		}
		return null;
	}
	
}
