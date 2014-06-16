package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HomeController //implements Controller 
{

//	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		System.out.println("Executando a logica e redirecionando...");
                String id = req.getParameter("id");
                
                String nomeArq = "conteudos/saudacaoView.jsp";
                req.setAttribute("nomearq", nomeArq);
            return "/WEB-INF/views/homeView.jsp";
	}
        
        public String testar(HttpServletRequest req, HttpServletResponse res){
            String id = req.getParameter("id");    
            
            String nomeArq = "conteudos/testeView.jsp";
                req.setAttribute("nomearq", nomeArq);
            return "/WEB-INF/views/homeView.jsp";
        
        }

}
