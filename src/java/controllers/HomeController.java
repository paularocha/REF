package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HomeController implements Controller {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		System.out.println("Executando a logica e redirecionando...");
                String id = req.getParameter("id");
                
                String nomeArq = "conteudos/saudacao.jsp";
                req.setAttribute("nomearq", nomeArq);
            return "/WEB-INF/views/home.jsp";
	}

}
