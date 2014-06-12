<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h2 id="cabecalho">  <a href="javascript:;">Lista de Espaços Físicos</a> &blacktriangleleft; <a href="index?log=Espaco$id=xxx">xxx</a></h2>
    <jsp:useBean id="dao" class="testemvc.Mocc" />

        <% 

        //    for(int i = 0; i < 4;i++){

          //  } 

        %>

<div id="conteudo">

        <c:forEach var="espaco" items="${dao.bd}">
            <div id="pastilha">
                <a href="index?log=Espaco&id=esp1">
                    <b>${espaco.nome}</b><br>
                    <span>${espaco.informacoes}</span>
                </a>
            </div>
        </c:forEach>    
               
            
</div>
    