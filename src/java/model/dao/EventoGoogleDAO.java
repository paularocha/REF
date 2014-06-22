package model.dao;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.CalendarScopes;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventDateTime;
import com.google.api.services.calendar.model.Events;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import model.beans.EventoGoogleBean;


public class EventoGoogleDAO {
    private String agendaId;
    private ArrayList<EventoGoogleBean> listaDeTodosEventos;
    private ArrayList<EventoGoogleBean> listaDeEventosDeUmDia;
    private ArrayList<EventoGoogleBean> listaDeTodosEventosDoUsuario;
    
    private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new JacksonFactory();
    private GoogleCredential credential;
    private Calendar service; 
    
    
    
    public EventoGoogleDAO() throws IOException{
        File file = new File("");
		System.out.println("absolute: " + file.getAbsolutePath());

        try {
            credential = new GoogleCredential.Builder().setTransport(HTTP_TRANSPORT)
            .setJsonFactory(JSON_FACTORY)
            .setServiceAccountId("700930084539-bpfdffda74bonnh3q53g6koru2ku7k43@developer.gserviceaccount.com")
            .setServiceAccountScopes(Collections.singleton(CalendarScopes.CALENDAR))
            .setServiceAccountPrivateKeyFromP12File(
                new File(file.getAbsolutePath() + 
                        File.separator + 
                        "key.p12"))
            .setServiceAccountUser("andre.rammos7@gmail.com")
            .build();
            //credential.refreshToken();

            service = new Calendar.Builder(HTTP_TRANSPORT, JSON_FACTORY,credential)
                .setApplicationName("aps")
                .setHttpRequestInitializer(credential).build();
                System.out.println(service.getApplicationName());
            } catch (GeneralSecurityException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

    }    
    
    public EventoGoogleDAO(String agendaId) {        
        this.agendaId = agendaId;
    }
    
    public ArrayList<EventoGoogleBean> getListaDeTodosEventosDoUsuario(String nome) throws IOException{    
        listaDeTodosEventosDoUsuario = new ArrayList<>();
       // EventoGoogleBean evGoogleBean;
        //Events ev = service.events().list("primary").setQ("displayName='" + nome + "'").execute();
        Events ev = service.events().list("reservingspace@gmail.com").execute();

        while (true) {
            for (Event evento : ev.getItems()) {
                
                EventoGoogleBean evGoogleBean = new EventoGoogleBean()
                        .setMotivo(evento.getSummary())
                        .setEspaco(evento.getLocation())
                        .setDataHoraInicial(evento.getStart().getDateTime().toStringRfc3339())
                        .setDataHoraFinal(evento.getEnd().getDateTime().toStringRfc3339())
                        .setNomeDoCriador(evento.getCreator().getDisplayName())
                        .setDescricao(evento.getDescription())
                        //.setData(evento.getStart().getDate().toStringRfc3339())
                        .setEventoGoogleId(evento.getId());
                if(evento.getCreator().getDisplayName().equals(nome))
                listaDeTodosEventosDoUsuario.add(evGoogleBean);
                
                //System.out.println("<b> Criador:</b> " + evento.getCreator().getDisplayName() + " <b>Sumario:</b> " + evento.getSummary() + " <b>data:</b> " +  evento.getEnd().getDate().toStringRfc3339() + "<br>");
            }
            String pageToken = ev.getNextPageToken();
            if (pageToken != null && !pageToken.isEmpty()) {
                ev = service.events().list("reservingspace@gmail.com").setPageToken(pageToken).execute();
            } else {
                break;
            }
        }
        return listaDeTodosEventosDoUsuario;
    }
    
    public ArrayList<EventoGoogleBean> getListaDeTodosEventos() throws IOException{    
        listaDeTodosEventos = new ArrayList<>();
       // EventoGoogleBean evGoogleBean;
        
        Events ev = service.events().list("reservingspace@gmail.com").execute();

        while (true) {
            for (Event evento : ev.getItems()) {
                EventoGoogleBean evGoogleBean = new EventoGoogleBean()
                        .setMotivo(evento.getSummary())
                        .setEspaco(evento.getLocation())
                        .setDataHoraInicial(evento.getStart().getDateTime().toStringRfc3339())
                        .setDataHoraFinal(evento.getEnd().getDateTime().toStringRfc3339())
                        .setNomeDoCriador(evento.getCreator().getDisplayName())
                        .setDescricao(evento.getDescription())
                        .setEventoGoogleId(evento.getId());
                
                listaDeTodosEventos.add(evGoogleBean);
                
                System.out.println("<b> Criador:</b> " + evento.getCreator().getDisplayName() + 
                    " <b>Sumario:</b> " + evento.getSummary() + 
                    " <b>dateTime:</b> " +  evento.getEnd().getDateTime().toStringRfc3339() + "<br>");
            }
            String pageToken = ev.getNextPageToken();
            if (pageToken != null && !pageToken.isEmpty()) {
                ev = service.events().list("reservingspace@gmail.com").setPageToken(pageToken).execute();
            } else {
                break;
            }
        }
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
