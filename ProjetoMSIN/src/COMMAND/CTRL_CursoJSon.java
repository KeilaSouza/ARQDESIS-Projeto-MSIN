package COMMAND;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Util.JSonFacade;
import MODEL.MODEL_Curso;

/**
 * Servlet implementation class SelecionarCervejasJSon
 */
@WebServlet("/selecao.json")
public class CTRL_CursoJSon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		String url = request.getRequestURL().toString();
		url = url.substring(0, url.lastIndexOf('/'));
		
		String pCodigo = request.getParameter("Codigo");
		String pNomedoCurso = request.getParameter("NomeCurso");
		String pDataInicio = request.getParameter("DataInicio");
		String pDataFim = request.getParameter("DataFim");
		String pNumeroVagas = request.getParameter("NumeroVagas");
		String pValor = request.getParameter("Valor");
		String pLabSala = request.getParameter("LabSala");
		String pHorario = request.getParameter("Horario");
		String pDescricao = request.getParameter("Descricao");
		String pMatSoftwares = request.getParameter("MatSoftwares");
		String pArea = request.getParameter("Area");
		String pNao = request.getParameter("Nao");
		
		TreeSet<MODEL_Curso> lista = new TreeSet<MODEL_Curso>();
		PrintWriter out = response.getWriter();
		/*CASO QUEIRA RETORNAR IMAGEM
		for(MODEL_Curso curso:lista){
			curso.setImagem(url+"/img/"+curso.getImagem()+".jpg");
		}*/
		out.println(JSonFacade.listToJSon(lista));

	}

}
