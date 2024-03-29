package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MostrarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String paramId = request.getParameter("id");
		 Integer id= Integer.parseInt(paramId);
		 
		 DB db = new DB();
		 Empresa emp = db.buscarEmpresaPorId(id);
		 
		 request.setAttribute("empresa", emp);
		 
		 RequestDispatcher rd = request.getRequestDispatcher("/FormModificarEmpresa.jsp");
		 rd.forward(request, response);
		 
		 System.out.println(emp.getNombre());
		
	}
}
