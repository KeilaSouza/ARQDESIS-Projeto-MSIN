package Util;

import java.util.TreeSet;

import DAO.DAO_Curso;
import MODEL.MODEL_Curso;
import TO.TO_Aluno;

public class JSonFacade {

	private int ra, numeroVagas, labSala;
	public double valor;
	private String nomeCurso, dataInicio, dataFim, horario, descricao, matSoftwares, area;
	// Classe DAO_Curso
	DAO_Curso CursoDAO = new DAO_Curso();

	public JSonFacade() {
		/*	
		 * pst.setInt(11, Curso.getCodigo());
			pst.setInt(5, Curso.getNumeroVagas());
			pst.setFloat(6, Curso.getValor());
			pst.setInt(7, Curso.getLabSala());
		*/
	}

	public JSonFacade(int ra, String nomeCurso, String dataInicio, String dataFim, String horario,
			String descricao, String matSoftware, String area, int numeroVagas,
			int labSala, double valor) {
		this.nomeCurso = nomeCurso;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.horario = horario;
		this.descricao = descricao;
		this.matSoftwares = matSoftwares;
		this.area = area;
		this.ra = ra;
		this.numeroVagas = numeroVagas;
		this.labSala = labSala;
		this.valor = valor;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public int getNumeroVagas() {
		return numeroVagas;
	}

	public void setNumeroVagas(int numeroVagas) {
		this.numeroVagas = numeroVagas;
	}

	public int getLabSala() {
		return labSala;
	}

	public void setLabSala(int labSala) {
		this.labSala = labSala;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMatSoftwares() {
		return matSoftwares;
	}

	public void setMatSoftwares(String matSoftwares) {
		this.matSoftwares = matSoftwares;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public DAO_Curso getCursoDAO() {
		return CursoDAO;
	}

	public void setCursoDAO(DAO_Curso cursoDAO) {
		CursoDAO = cursoDAO;
	}

	public static char[] listToJSon(TreeSet<MODEL_Curso> lista) {
		// ADD.EX
		
		return null;
	}
	
	
}
