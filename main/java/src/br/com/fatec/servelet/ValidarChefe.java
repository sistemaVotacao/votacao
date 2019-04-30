package br.com.fatec.servelet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.DAO.ContatoDAO;
import br.com.fatec.entidadesBD.Funcionario;

public class ValidarChefe implements Logica{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ContatoDAO dao = new ContatoDAO();
		String numeroTituloEleitor = null;
		String senha;
			numeroTituloEleitor = request.getParameter("numeroUsuario");
		    senha = request.getParameter("fSenhaFuncionario");
			Funcionario funcionario = dao.getFuncionario(numeroTituloEleitor);
			if(funcionario != null && senha.intern() == funcionario.getSenha().intern() && funcionario.getCargo().intern() == "chefe") {
				request.setAttribute("classe", "conteinerBotoes");
				return "/funcionariosJSP/painel-funcionarios.jsp";
			}
			else {
				return "Usuario n�o encontrado";
			}

	}

}
