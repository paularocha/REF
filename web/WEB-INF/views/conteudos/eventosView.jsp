<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
    <c:when test="${espaco != null}"> 
        <!-- ==============================================================================  -->
        <!-- ==============================================================================  -->
        <!-- (Arnaldo)  Conteudo para cadastrar uma reserva depois de clicar em um espaco =  -->
        <!-- ==============================================================================  -->
        <!-- ==============================================================================  -->
        <div id="conteudoForm">
            <h1 id="cabecalho">Formulário de Reserva</h1>
            <form action="index?log=Evento&ac=criar" method="post">
                <h2>Espaço Físico
                    <input type="text-area" id="espaco" readonly="readonly" name="espaco" value="${espaco.nome}">
                    <input type="hidden" name="agendaId" value="${espaco.agendaId}">
                </h2>
                <h2>Data:
                    <input type="text" name="data" id="datepicker" size="30" value="click ao lado" readonly="readonly">
                </h2>
                <h2>Hora de início:
                    <input type="text" name="horaini" id="hrinicio" maxlength="5" readonly="readonly">
                </h2>
                <h2>Hora de término: 
                    <input type="text" name="horafim" id="hrtermino" maxlength="5" readonly="readonly">
                </h2>
                <h2>Nome: 
                    <input type="text-area" name="criador" value="${usuarioLogado.nome}" disabled="true" id="nome" readonly="readonly"> 
                </h2>
                <h2>Motivos:</h2>
                <h2>
                    <textarea id="motivo" name="motivo" cols="5" rows="40" name="msg2"></textarea>
                </h2>
                
                <input id="salvar" type="submit" value="Salvar">
                <input id="cancelar" type="reset" value="Cancel">
            </form>
        </div>

    </c:when>
    <c:when test="${eventoGoogleDAO != null}"> 
        <!-- ==============================================================================  -->
        <!-- ==============================================================================  -->
        <!-- (EDIVANDRO) minhas reservas ==================================================  -->
        <!-- ==============================================================================  -->
        <!-- ==============================================================================  -->
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
    <c:otherwise> 
        <!-- ==============================================================================  -->
        <!-- ==============================================================================  -->
        <!-- ============ (Arnaldo)  Conteudo para cadastrar uma reserva diretamente =======  -->
        <!-- ==============================================================================  -->
        <!-- ==============================================================================  -->
        <div id="conteudoForm">
            <h1 id="cabecalho">Formulário de Reserva</h1>
            <form action="index?log=Evento&ac=criar" method="post">
                <h2>Espaço Físico                    
                    <select name="agendaId" id="espaco">
                        <c:forEach var="espacos" items="${mockEspacoDAO.espacos}">
                            <option value="${espacos.agendaId}">${espacos.nome}</option>
                        </c:forEach>        
                    </select>
                </h2>
                 <h2>Data:
                    <input type="text" name="data" id="datepicker" size="30" value="click ao lado" readonly="readonly">
                </h2>
                <h2>Hora de início:
                    <input type="text" name="horaini" id="hrinicio" maxlength="5" readonly="readonly">
                </h2>
                <h2>Hora de término: 
                    <input type="text" name="horafim" id="hrtermino" maxlength="5" readonly="readonly">
                </h2>
                <h2>Nome: 
                    <input type="text-area" name="criador" value="${usuarioLogado.nome}" disabled="true" id="nome" readonly="readonly"> 
                </h2>
                <h2>Motivos:</h2>
                <h2>
                    <textarea id="motivo" name="motivo" cols="5" rows="40" name="msg2"></textarea>
                </h2>
                <input id="salvar" type="submit" value="Salvar">
                <input id="cancelar" type="reset" value="Cancel">
            </form>
        </div>
    </c:otherwise>

</c:choose>