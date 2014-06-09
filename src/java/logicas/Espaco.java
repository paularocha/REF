package logicas;

import beans.EspacoBean;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import testemvc.Mocc;


public class Espaco implements Logica {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Executando a logica e redirecionando...");
        String id = req.getParameter("id");

       
        Mocc mock = new Mocc();
        ArrayList<EspacoBean> bd = mock.getBd();
        // Guarda a lista no request
        // req.setAttribute("contatos", contatos);
        
        String nomeArq = "conteudos/espacos.jsp";
        req.setAttribute("nomearq", nomeArq);
        req.setAttribute("bd", bd);
        return "home.jsp";
    }

}
