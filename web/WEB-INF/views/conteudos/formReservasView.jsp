<%-- 
    Document   : formReservasView
    Created on : 24/06/2014, 08:31:24
    Author     : Arnaldo Souza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Formulário de Reserva</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="arquivos_web/estiloFormReservas.css">
    </head>
    <body>
        <div>
            <h1 id="titulo">Formulário de Reserva</h1>
            <form action="" method="post">
                <h2>Espaço Físico
                    <input type="text-area" id="espaco" disabled="true" name="espaco" >
                </h2>
                <h2>Data:
                  <input type="text-area" id="data" disabled="true" value="Calendario do Sebastião">
                </h2>
                <h2>Hora de início:
                    <input type="text-area" id="hrinicio" value="00:00" maxlength="5">
                </h2>
                <h2>Hora de término: 
                    <input type="text-area" id="hrtermino" value="00:00" maxlength="5">
                </h2>
                <h2>Nome: 
                    <input type="text-area" disabled="true" id="nome"> 
                </h2>
                <h2>Motivos:</h2>
                <h2>
                    <textarea id="motivo" cols="5" rows="40" name="msg2"></textarea>
                </h2>
                <h2>Descrição:</h2>
                <textarea id="descricao" cols="5" rows="40" name="msg"></textarea> <br><br>
                <input id="salvar" type="submit" value="Salvar">
                <input id="cancelar" type="button" value="Cancel">
            </form>
        
    </body>
</html>
