<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
    <c:when test="${espaco != null}"> <!-- ==============================================================================  -->
       
        <div id="conteudoMeusEventos">
            <h2 id="cabecalho">  <a href="index?log=Espaco">Lista de Espaços Físicos</a> &blacktriangleleft; <a href="index?log=Evento&espaco=${espaco}&dia=hoje">${espaco}</a> &blacktriangleleft; Eventos</h2>    
            <div id="cont">
                evento de hoje de ${espaco}
                <c:forEach var="evento" items="${eventoGoogleDAO}">
                    <b>${evento.espaco}</b><br>
                    <span>${evento.motivo}</span>
                </c:forEach>            
            </div>
        </div>

    </c:when>
    <c:when test="${eventoGoogleDAO != null}"> <!-- ==============================================================================  -->
        <div id="conteudoMinhasReservas">
            <h2 id="cabecalho">Minhas Reservas</h2>

            <form id="formMinhasReservas" action="xxxxxxxxxx">
                <p id="nomeEspaco">Nome do Espaço</p> <p id="dataEvento">Data do Evento</p>
                <p id="inicioEvento">Início</p> <p id="fimEvento">Fim</p>
                <br>
                <c:forEach var="evento" items="${eventoGoogleDAO}">
                    <input type="checkbox" name="idReserva">
                    <input id="campoEspaco" type="text" name="espaco" value="${evento.espaco}" disabled>
                    <input id="campoData" type="text" name="data" value="${evento.data}" disabled>
                    <input id="campoHoraInicio" type="text" name="horaInicio" value="${evento.horaInicial}" disabled>
                    <input id="campoHoraFim" type="text" name="horaFim"  value="${evento.horaFinal}" disabled>
                    <br>        
                </c:forEach>
            </form>
        </div>
        
    </c:when>
    <c:otherwise> <!-- ==============================================================================  -->
        nada       
    </c:otherwise>

</c:choose>