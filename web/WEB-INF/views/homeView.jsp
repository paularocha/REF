<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html> 
<html>
    <head>
        <title>Sistema de Reserva de Espaços físicos</title>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Edivandro Aquino Damasceno" >
        <script src="arquivos_web/jquery-1.10.2.min.js"></script>
        <script type="text/javascript">
        /*    $(document).ready(function(){ 
                $(window).scroll(function(){
                    $("aside#flutuante").animate({"top":$(this).scrollTop()},50);
                });
            });*/
        </script>
        
         <meta charset="utf-8">
        <title>jQuery UI Dialog - Default functionality</title>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script>
            function dialogar(){
                $(function() {
                $( "#dialog" ).dialog({
                    modal: true,
                    buttons: {
                    Ok: function() {
                    $( this ).dialog( "close" );
                    }
                    }
                    
                });
                });
            }
            //dialogar();
        </script>
        <link type="text/css" rel="stylesheet" href="arquivos_web/estilo.css" />
        <link type="text/css" rel="stylesheet" href="arquivos_web/estiloespacoview.css" />
        <link type="text/css" rel="stylesheet" href="arquivos_web/estiloagendaview.css" />
        <link href="arquivos_web/imagens/favicon.ico" rel="shortcut icon">
    </head>
    <body>
        <section id="barra-superior">
            <!--<div id="titulo"><h1><a href="index.php">SISTEMA DE RESERVA DE ESPAÃOS FÃSICOS</a></h1></div>-->
            <div id="menu-login">
                <nav>
                    <a href="index?log=Home">Home</a>
                    <a href="index?log=contato">Contato</a>
                    <a href="index?log=quemsomos">Quem somos</a>
                </nav>
                <div id="usuario">
                    <c:choose>
                        <c:when test="${usuarioLogado != null}" >
                            <b>Saudações, ${usuarioLogado.nome}<a href="index?log=Sessao&ac=efetuarLogout"> sair</a></b>
                        </c:when>    

                        <c:otherwise>
                        <form id="form_login" method="post" action="index?log=Sessao&ac=efetuarLogin">
                            <div class="row-fluid">
                                <label for="login">Login: </label>
                                <input type="text" maxlength="200" size="15" id="login" class="logar" name="login" />
                                <label for="senha">Senha: </label>
                                <input type="password" maxlength="140" size="10" id="senha" class="logar" name="senha" />
                            <!--<input type="hidden" name="enviado" value="sim" />-->
                            <button id="botao" type="submit">Entrar</button>
                            </div>
                        </form>
                        </c:otherwise>
                    </c:choose>                 
                    <c:if test="${errado eq 'true'}">
                        <script>dialogar();</script>
                    </c:if>
                </div>
            </div>
                
        </section>
        
        
        <section class="site">
            <header class="site">

            </header>

            
                <c:choose>
                    <c:when test="${usuarioLogado.cargo eq 'aluno'}">
                        <aside id="flutuante">
                        <nav class="site">
                            <h3 class="h3_center">Menu</h3>
                            <ul>
                                <a href="index?log=Agenda&ac=executa"><li>Visualizar agenda</li></a>
                                <a href="index?log=Espaco&ac=executa"><li>Lista de Espaços Físicos</li></a>
                                <a href="index?log=MinhasReservas&ac=executa"><li>Minhas Reservas</li></a>
                                <a href="index?log=Home&ac=testar"><li>testar outras acoes</li></a>

                            </ul>
                        </nav>
                        </aside>
                    </c:when>
                    
                    <c:when test="${usuarioLogado.cargo eq 'usuarioadm'}">
                        <aside id="flutuante">
                        <nav class="site">
                            <h3 class="h3_center">Menu</h3>
                            <ul>
                                <a href="index?log=Agenda&ac=executa"><li>Visualizar agenda</li></a>
                                <a href="index?log=Espaco&ac=executa"><li>Lista de Espaços Físicos</li></a>
                                <a href="index?log=MinhasReservas&ac=executa"><li>Minhas Reservas</li></a>
                                <a href="index?log=MinhasReservas&ac=executa"><li>Reservas para confirmar</li></a>
                                <a href="index?log=Home&ac=testar"><li>testar outras acoes</li></a>

                            </ul>
                        </nav>
                        </aside>
                    </c:when>
                    <c:when test="${usuarioLogado.cargo eq 'adm'}">
                        <aside id="flutuante">
                        <nav class="site">
                            <h3 class="h3_center">Menu</h3>
                            <ul>
                                <a href="index?log=Agenda"><li>Visualizar agenda</li></a>
                                <a href="index?log=Agenda"><li>Cadastros para confirmar</li></a>
                                <a href="index?log=Espaco"><li>Lista de Espaços Físicos</li></a>
                                <a href="index?log=MinhasReservas&ac=executa"><li>Reservas para confirmar</li></a>
                                <a href="index?log=Home&ac=testar"><li>testar outras acoes</li></a>

                            </ul>
                        </nav>
                        </aside>
                    </c:when>
                    <c:otherwise>
                        
                    </c:otherwise>
                
                </c:choose>
                
            </aside>
            
            <section class="pagina">
                
                <jsp:include page="${nomearq}" flush="true"/>
                
            </section>

            <footer class="site">
            </footer>
        </section>
        <section id="barra-inferior"><a href="index.php">Copyright &copy; 2014</a></section>
        
        <div id="dialog" title="Erro" style="display: none;">
            <p>Você não está autorizado.</p>
        </div>
    </body>
</html>
