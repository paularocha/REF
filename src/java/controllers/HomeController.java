package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.beans.UsuarioBean;


public class HomeController {

//	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("Executando a logica e redirecionando...");
                String id = req.getParameter("id");
                
                String nomeArq = "conteudos/saudacaoView.jsp";
                req.setAttribute("nomearq", nomeArq);
            return "/WEB-INF/views/homeView.jsp";
	}
        
        public String testar(HttpServletRequest req, HttpServletResponse res){
            String id = req.getParameter("id");    
            //req.getS
            HttpSession sessao = req.getSession();
            UsuarioBean usuarioLogado = (UsuarioBean) sessao.getAttribute("usuarioLogado");
            System.out.println("tiipo de usuario: " + usuarioLogado.getCargo());
            if(usuarioLogado.getCargo().equals("adm")){
                System.out.println("Acao permitida apenas a este usuário");
            }
            String nomeArq = "conteudos/testeView.jsp";
                req.setAttribute("nomearq", nomeArq);
            return "/WEB-INF/views/homeView.jsp";
        
        }

}
