<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="conteudo">
    <h2 id="cabecalho">  <a href="index?log=Espaco">Lista de Espaços Físicos</a> &blacktriangleleft; <a href="index?log=Evento&espaco=${espaco}&dia=hoje">${espaco}</a> &blacktriangleleft; Eventos</h2>    
    <div id="cont">
        evento de hoje de ${espaco}
        <c:forEach var="evento" items="${eventoGoogleDAO}">
            <b>${evento.espaco}</b><br>
            <span>${evento.motivo}</span>
        </c:forEach>            
    </div>
</div>
    