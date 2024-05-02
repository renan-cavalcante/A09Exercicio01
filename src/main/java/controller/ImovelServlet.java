package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cidade;
import model.Imovel;

@WebServlet("/imovel")
public class ImovelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ImovelServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		atribuirCidade(request);
		RequestDispatcher rd = request.getRequestDispatcher("imovel.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Imovel i = new Imovel();
		
		i.setEndereco( request.getParameter("endereco"));
		i.setAreaTotal( Long.parseLong(request.getParameter("area_terreno")));
		i.setNumeroQuartos( Integer.parseInt(request.getParameter("numquartos")));
		i.setNumeroComodos( Integer.parseInt(request.getParameter("num_comodos")));
		i.setAreaGaragem( Double.parseDouble(request.getParameter("area_garagem")));
		i.setIdade( Integer.parseInt(request.getParameter("idade")));
		System.out.println(request.getParameter("cidade"));
		i.setCidade(Cidade.getCidade(Integer.parseInt(request.getParameter("cidade"))));
		
		ICalculoImposto cal = i.getCidade().defineCalculoImposto();
		cal.defineImposto(i);
		
		atribuirCidade(request);
		request.setAttribute("Imposto", i.getImposto());
		RequestDispatcher rd = request.getRequestDispatcher("imovel.jsp");
		rd.forward(request, response);
	}
	
	private void atribuirCidade(HttpServletRequest request) {
		request.setAttribute("cidades", Cidade.obtercidades());
	}

}

