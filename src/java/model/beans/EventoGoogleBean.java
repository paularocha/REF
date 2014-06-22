package model.beans;

public class EventoGoogleBean {
    private String eventoGoogleId;    
    private String motivo;
    private String espaco;
    private String agendaGoogleId;
    private String descricao;
    private String data;
    private String horaInicial;
    private String horaFinal;
    
    private String dataHoraInicial;
    private String dataHoraFinal;
    private String nomeDoCriador;
    private String dataDeAtualizacao;
    private String dataDeCriacao;
    String dataHora[];

    public EventoGoogleBean() {
         this.dataHora = new String[2];
    }

    
    
    public String getEventoGoogleId() {
        return eventoGoogleId;
    }

    public EventoGoogleBean setEventoGoogleId(String eventoGoogleId) {
        this.eventoGoogleId = eventoGoogleId;
        return this;
    }

    public String getMotivo() {
        return motivo;
    }

    public EventoGoogleBean setMotivo(String motivo) {
        this.motivo = motivo;
         return this;
    }

    
    public String getEspaco() {
        return espaco;
    }

    public EventoGoogleBean setEspaco(String espaco) {
        this.espaco = espaco;
         return this;
    }

    public String getAgendaGoogleId() {
        return agendaGoogleId;
    }

    public EventoGoogleBean setAgendaGoogleId(String agendaGoogleId) {
        this.agendaGoogleId = agendaGoogleId;
         return this;
    }
    public String getData() {
        this.data = this.dataHoraInicial.split("T")[0];
        return this.data;
    }

    

    public String getDescricao() {
        return descricao;
    }

    public EventoGoogleBean setDescricao(String descricao) {
        this.descricao = descricao;
         return this;
    }

    public String getDataHoraInicial() {
        return dataHoraInicial;
    }

    public EventoGoogleBean setDataHoraInicial(String dataHoraInicial) {
        this.dataHoraInicial = dataHoraInicial;
         return this;
    }

    public String getDataHoraFinal() {
        return dataHoraFinal;
    }

    public EventoGoogleBean setDataHoraFinal(String dataHoraFinal) {
        this.dataHoraFinal = dataHoraFinal;
         return this;
    }

    public String getNomeDoCriador() {
        return nomeDoCriador;
    }

    public EventoGoogleBean setNomeDoCriador(String nomeDoCriador) {
        this.nomeDoCriador = nomeDoCriador;
         return this;
    }

    public String getDataDeAtualizacao() {
        return dataDeAtualizacao;
    }

    public EventoGoogleBean setDataDeAtualizacao(String dataDeAtualizacao) {
        this.dataDeAtualizacao = dataDeAtualizacao;
         return this;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public EventoGoogleBean setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
         return this;
    }

    public String getHoraInicial() {
        this.horaInicial = this.dataHoraInicial.split("T")[1].substring(0, 5);
        return this.horaInicial;
    }

    public String getHoraFinal() {
         this.horaFinal = this.dataHoraFinal.split("T")[1].substring(0, 5);
        return this.horaFinal;
    }

   
    
    
    
    
}
