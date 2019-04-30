package br.com.fatec.servelet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fatec.DAO.ContatoDAO;
import br.com.fatec.entidadesBD.Eleitor;

public class ValidarUsuario implements Logica{

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ContatoDAO dao = new ContatoDAO();
		String numeroTituloEleitor = null;
		String senha;
			numeroTituloEleitor = request.getParameter("numeroUsuario");
		    senha = request.getParameter("fSenhaFuncionario");
			Eleitor eleitor = dao.getEleitor(numeroTituloEleitor);
			if(eleitor != null && senha.intern() == eleitor.getSenha().intern()) {
				return "/eleitoresJSP/votar.jsp";
			}
			else {
				return "Usuario não encontrado";
			}
	}

}
