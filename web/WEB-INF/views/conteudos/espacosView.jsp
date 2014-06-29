<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="conteudoespaco">
    
    <h2 id="cabecalho">  <a href="javascript:;">Lista de Espaços Físicos</a></h2>
    <div id="cont">
        <c:if test="${usuarioLogado.nivel eq 'adm'}">
           <!-- <div id="pastilhadeadd">
                <a href="index?log=Espaco&ac=criar">
                    <b>+</b><br>
                    <span>Add novo espaço</span>
                </a>
            </div>                -->
        </c:if>    
        <c:forEach var="espaco" items="${mockEspacoDAO.espacos}">
            <div id="pastilha">
                <a href="index?log=Evento&espaco=${espaco.nome}&data=hoje">
                    <b>${espaco.nome}</b><br>
                    <span>${espaco.informacoes}</span>
                </a>
            </div>                
        </c:forEach>    
        
    </div>
            
</div>
    