package COMMAND;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import TO.TO_Curso;
import MODEL.MODEL_Curso;

/**
 * Servlet implementation class CTRL_Curso
 */
@WebServlet("/ManterCurso.do")
public class CTRL_Curso extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

		int Codigo, NumeroVagas, LabSala;
		float Valor;

		try {
			Codigo = Integer.parseInt(pCodigo);
			NumeroVagas = Integer.parseInt(pNumeroVagas);
			LabSala = Integer.parseInt(pLabSala);
			Valor = Float.parseFloat(pValor);
		} catch (NumberFormatException e) {
			Codigo = 0;
			NumeroVagas = 0;
			LabSala = 0;
			Valor = 0;
			e.printStackTrace();
		}

		MODEL_Curso Curso = new MODEL_Curso(Codigo, pNomedoCurso, pDataInicio, pDataFim, pHorario, NumeroVagas, Valor,
				LabSala, pDescricao, pMatSoftwares, pArea);

		if (pNao.equals("Cadastrar")) {
			Curso.Cadastrar_Curso();
		} else if (pNao.equals("Alterar")) {
			Curso.Alterar_Curso();
		} else if (pNao.equals("Excluir")) {
			Curso.Excluir_Curso(Codigo);
		} else if (pNao.equals("Consultar")) {
			Curso.Consultar_Curso();
		}
		
Curso.Consultar_Curso();

		TO_Curso to = new TO_Curso();
		to.setCodigo(Curso.getCodigo());
		to.setNomeCurso(Curso.getNomeCurso());
		to.setDataInicio(Curso.getDataInicio());
		to.setDataFim(Curso.getDataFim());
		to.setNumeroVagas(Curso.getNumeroVagas());
		to.setValor(Curso.getValor());
		to.setLabSala(Curso.getLabSala());
		to.setHorario(Curso.getHorario());
		to.setDescricao(Curso.getDescricao());
		to.setMatSoftwares(Curso.getMatSoftwares());
		to.setArea(Curso.getArea());


		request.setAttribute("curso", to);

		RequestDispatcher view = 
					request.getRequestDispatcher("Curso.jsp");
		view.forward(request, response);

		
	}

}