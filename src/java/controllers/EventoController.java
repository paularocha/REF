package controllers;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mocks.MockEspacoDAO;
import model.beans.EspacoBean;
import model.beans.EventoGoogleBean;
import model.beans.UsuarioBean;
import model.dao.EventoGoogleDAO;


public class EventoController extends HttpServlet {

//    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Executando a logica e redirecionando...");
        String espaco = req.getParameter("espaco");
        //String criador = req.getParameter("criador");

       
        if(SessaoController.isLoged(req, res)){
            //EventoGoogleDAO eventoGoogleDAO = new EventoGoogleDAO();
            
            //ArrayList<EventoGoogleBean> ev = eventoGoogleDAO.getListaDeTodosEventosDoUsuario(criador);
            String nomeArq = "conteudos/eventosView.jsp";
            //req.setAttribute("eventoGoogleDAO", eventoGoogleDAO);
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("espaco", espaco);
            
        }else{
           String nomeArq = "conteudos/saudacaoView.jsp";
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("errado","true" );
            //return "/WEB-INF/views/homeView.jsp";
       }
        return "/WEB-INF/views/homeView.jsp";
    }
    
    public String verMeusEventos(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        System.out.println("Executando a logica e redirecionando...");
        String id = req.getParameter("id");
        UsuarioBean usuarioLogado = (UsuarioBean) req.getSession().getAttribute("usuarioLogado");
        
        String criador = usuarioLogado.getNome();

       if(SessaoController.isLoged(req, res)){
            EventoGoogleDAO eventoGoogleDAO = new EventoGoogleDAO();
            
            ArrayList<EventoGoogleBean> ev = eventoGoogleDAO.getListaDeTodosEventosDoUsuario(criador);
            String nomeArq = "conteudos/eventosView.jsp";
            req.setAttribute("eventoGoogleDAO", ev);
            req.setAttribute("nomearq", nomeArq);
            
       }else{
           String nomeArq = "conteudos/saudacaoView.jsp";
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("errado","true" );
            
       }
       return "/WEB-INF/views/homeView.jsp";
    }
    
    public String verEventosPendentes(HttpServletRequest req, HttpServletResponse res) throws Exception {
        System.out.println("Executando a logica e redirecionando...");
        if(SessaoController.isLoged(req, res)){
            String nomeArq = "conteudos/eventosPendentesView.jsp";
            req.setAttribute("nomearq", nomeArq);

            return "/WEB-INF/views/homeView.jsp";
        }else{
            String nomeArq = "conteudos/saudacaoView.jsp";
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("errado","true" );
            return "/WEB-INF/views/homeView.jsp";
       }
    }
    
    
    public String criarEventos(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        System.out.println("Executando a logica e redirecionando...");
        String id = req.getParameter("id");
        //UsuarioBean usuarioLogado = (UsuarioBean) req.getSession().getAttribute("usuarioLogado");
        
        //String criador = usuarioLogado.getNome();

       if(SessaoController.isLoged(req, res)){
            MockEspacoDAO mockEspacoDAO = new MockEspacoDAO();
            //EventoGoogleDAO eventoGoogleDAO = new EventoGoogleDAO();
            
            //ArrayList<EventoGoogleBean> ev = eventoGoogleDAO.getListaDeTodosEventosDoUsuario(criador);
            req.setAttribute("mockEspacoDAO", mockEspacoDAO);
            String nomeArq = "conteudos/eventosView.jsp";
            //req.setAttribute("eventoGoogleDAO", ev);
            req.setAttribute("nomearq", nomeArq);
            
       }else{
           String nomeArq = "conteudos/saudacaoView.jsp";
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("errado","true" );
            
       }
       return "/WEB-INF/views/homeView.jsp";
    }
    
    public String criar(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        System.out.println("Executando a logica e redirecionando para criar...");
        UsuarioBean usuarioLogado = (UsuarioBean) req.getSession().getAttribute("usuarioLogado");
        String motivo = req.getParameter("motivo");
        String espaco = req.getParameter("espaco");
        String data = req.getParameter("data");
        String horaini = req.getParameter("horaini");
        String horafim = req.getParameter("horafim");        
        String criador = req.getParameter("criador");        
//        String criador = usuarioLogado.getNome();
        //System.out.println("criador: " + criador);
        
        
        int year = Integer.parseInt(data.split("/")[0]);
        int month = Integer.parseInt(data.split("/")[1]);
        int dayOfMonth = Integer.parseInt(data.split("/")[2]);
        
        int hourOfDayI = Integer.parseInt(horaini.split(":")[0]);
        int minuteI = Integer.parseInt(horaini.split(":")[1]);
                
        int hourOfDayF = Integer.parseInt(horafim.split(":")[0]);
        int minuteF = Integer.parseInt(horafim.split(":")[1]);
        
        
        GregorianCalendar ini = new GregorianCalendar(year, month-1, dayOfMonth, hourOfDayI, minuteI);
        GregorianCalendar fim = new GregorianCalendar(year, month-1, dayOfMonth, hourOfDayF, minuteF);

       if(SessaoController.isLoged(req, res)){
            
            EventoGoogleDAO eventoGoogleDAO = new EventoGoogleDAO();
            
            EventoGoogleBean ev = new EventoGoogleBean()
                    .setEspaco(espaco)
                    .setMotivo(motivo)
                    .setNomeDoCriador(criador)
                    .setIni(ini)
                    .setFim(fim);
            eventoGoogleDAO.criarEvento(ev);
            
            String nomeArq = "conteudos/eventosView.jsp";
            req.setAttribute("nomearq", nomeArq);
            
       }else{
           String nomeArq = "conteudos/saudacaoView.jsp";
            req.setAttribute("nomearq", nomeArq);
            req.setAttribute("errado","true" );
            
       }
       return "/WEB-INF/views/homeView.jsp";
    }

}
