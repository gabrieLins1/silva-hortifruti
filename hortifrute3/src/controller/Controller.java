package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = { "/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// criar objetos para acessar a camada model (MVC)
	JavaBeans javabeans = new JavaBeans();
	DAO dao = new DAO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// text de conexao
		// dao.testarConexao();
		// a linha a baixo cria uma variavel de nome action que recebe a requisicoa
		String action = request.getServletPath();
		System.out.println(action);
		// encaminha mento daas requisi�oes
		if (action.contentEquals("/main")) {
			// encaminhar para o metodo contatoas
			produtos(request, response);

		} else if (action.equals("/insert")) {
			adicionarestoque(request, response);
		}
		

	}

	// selecionar produtos(crud read)
	protected void produtos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// executar o metodo (dao) para listar todos os contatos do banco - passos 1 e 6
				//armazenando o resultado numa niva lista
				// listar contatos () passo 1
				//lista p�sso 6 
				ArrayList<JavaBeans> lista = dao.listarprodutos();
				//despachae a lista para o documento agenda.jsp (passo 7)
				request.setAttribute("javabeans", lista);
				RequestDispatcher rd = request.getRequestDispatcher("addestoque.jsp");
				rd.forward(request, response);
				
				// encaminhar ao documento addestoque.jsp
				//response.sendRedirect("addestoque.jsp");  
		

	}

	// adicionar produto (crud create)
	protected void adicionarestoque(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// setar as variaveis java beans
				// capitura o conteudo do compo nome formulario novo
		     
				javabeans.setProdutos(request.getParameter("produtos"));
				javabeans.setQuantidade(request.getParameter("quantidade"));
				javabeans.setValor(request.getParameter("valor"));
				javabeans.setDatapd(request.getParameter("datapd"));
				javabeans.setValidade(request.getParameter("validade"));
				// a linha abaixo executa o metodo enserir contatos da classe dao,
				// PASSANDO o objeto javabeans como parametro (passo 6)
				dao.inserirestoque(javabeans);
				response.sendRedirect("main");
		

	}

}
