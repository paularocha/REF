package dao;

import beans.EventoGoogleBean;
import java.util.ArrayList;


public class EventoGoogleDAO {
    private String agendaId;
    private ArrayList<EventoGoogleBean> listaDeTodosEventos;
    private ArrayList<Object> listaDeEventosDeUmDia;

    public EventoGoogleDAO() {
    
    }    
    
    public EventoGoogleDAO(String agendaId) {        
        this.agendaId = agendaId;
    }
    
    public ArrayList<EventoGoogleBean> listarTodosEventos(){    
        listaDeTodosEventos = new ArrayList<>();
        return listaDeTodosEventos;
    }
    public ArrayList<EventoGoogleBean> listarEventosDoDia(String dia){
        listaDeEventosDeUmDia = new ArrayList<>();
        return listaDeTodosEventos;
    }
    
    public void deletarEvento(String eventoId){}
    
    public String criarEvento(EventoGoogleBean eventoGoogleBean){        
        return "idEventCreate";
    }
    
    public String atualizarEvento(String eventoId){
        return "idEventUpdate";
    }
    
    
    
    
    
    
    public String getAgendaId() {
        return agendaId;
    }

    public void setAgendaId(String agendaId) {
        this.agendaId = agendaId;
    }
    
    
}
