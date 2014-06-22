<%-- 
    Document   : reservas
    Created on : 17/06/2014, 09:16:39
    Author     : edivandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div id="minhasReservas">
    <h2 id="cabecalho">Minhas Reservas</h2>
    
    <form id="formMinhasReservas" action="xxxxxxxxxx">
        <p id="nomeEspaco">Nome do Espaço</p> <p id="dataEvento">Data do Evento</p>
        <p id="inicioEvento">Início</p> <p id="fimEvento">Fim</p>
        <br>
        
        <input type="checkbox" name="idReserva">
        <input id="campoEspaco" type="text" name="espaco" value="Lab 40" disabled>
        <input id="campoData" type="text" name="data" value="22/06/2014" disabled>
        <input id="campoHoraInicio" type="text" name="horaInicio" value="10:00h" disabled>
        <input id="campoHoraFim" type="text" name="horaFim"  value="12:00h" disabled>
        <br>
        
        <input type="checkbox" name="idReserva">
        <input id="campoEspaco" type="text" name="espaco" value="Lab 40" disabled>
        <input id="campoData" type="text" name="data" value="22/06/2014" disabled>
        <input id="campoHoraInicio" type="text" name="horaInicio" value="10:00h" disabled>
        <input id="campoHoraFim" type="text" name="horaFim"  value="12:00h" disabled>
        <br>        
    </form>
</div>
