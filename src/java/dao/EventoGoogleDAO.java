package dao;

import beans.EventoGoogleBean;
import java.util.ArrayList;


public class EventoGoogleDAO {
    private String agendaId;
    private ArrayList<EventoGoogleBean> eventList;
    private ArrayList<Object> eventListDay;

    public EventoGoogleDAO(String agendaId) {        
        this.agendaId = agendaId;
    }

    
    public ArrayList<EventoGoogleBean> listarTodosEventos(){    
        eventList = new ArrayList<>();
        return eventList;
    }
    public ArrayList<EventoGoogleBean> listarEventosDoDia(String dia){
        eventListDay = new ArrayList<>();
        return eventList;
    }
    
    public void deletarEvento(String eventoId){}
    
    public String criarEvento(String sumario, String motivo, String startDateTime, String endDateTime){
        
        return "idEventCreate";
    }
    
    public void atualizarEvento(String eventoId){}
    
    
    
    
    
    
    public String getAgendaId() {
        return agendaId;
    }

    public void setAgendaId(String agendaId) {
        this.agendaId = agendaId;
    }
    
    
}
