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
        <link type="text/css" rel="stylesheet" href="arquivos_web/estilo.css" />
        <link type="text/css" rel="stylesheet" href="conteudos/estiloespace.css" />
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
                    <%
                        if(false){
                            out.println("<b>Saudações,<a href=\"index?log=Logout\"> sair</a></b>");
                        }else{
                    %>
                    <!--
                    <?php
                    
                        if ( logado() ) 
                        {
                            echo "VocÃª entrou como <b>" . $_SESSION["usuario"]["nome"] . 
                                 '</b> | <a href="index.php?pagina=logout">Sair</a>';
                        }
                        else
                        {
                    ?>
                    -->
                    <form id="form_login" method="post" action="index?log=logar">
                        <div class="row-fluid">
                            <label for="login">Login: </label>
                            <input type="text" maxlength="200" size="15" id="login" class="logar" name="login" />
                            <label for="senha">Senha: </label>
                            <input type="password" maxlength="140" size="10" id="senha" class="logar" name="senha" />
                        <!--<input type="hidden" name="enviado" value="sim" />-->
                        <button id="botao" type="submit">Entrar</button>
                        </div>
                    </form>
                    <% } %>
                    <!--<?php } ?> -->
                </div>
            </div>
                
        </section>
        
        
        <section class="site">
            <header class="site">

            </header>

            <aside id="flutuante">
                <nav class="site">
                    <h3 class="h3_center">Menu</h3>
                    <ul>
                        <a href="index?log=Agenda&ac=executa"><li>Visualizar agenda</li></a>
                        <a href="index?log=Espaco&ac=executa"><li>Lista de Espaços Físicos</li></a>
                        <a href="index?log=MinhasReservas&ac=executa"><li>Minhas Reservas</li></a>
                        
                    </ul>
                </nav>
            </aside>
            
            <section class="pagina">
                
                <jsp:include page="${nomearq}" flush="true"/>
                <!--
                <?php
                    $pagina = ( isset($_GET["pagina"]) ? $_GET["pagina"] : "home");
                    $pagina = "paginas/" . $pagina . ".php";
                    
                    if ( !empty($pagina) )
                    {
                        if ( file_exists($pagina) ) { include $pagina; }
                        else { print "Esta pÃ¡gina nao existe!"; }
                    }
                ?> -->
            </section>

            <footer class="site">
            </footer>
        </section>
        <section id="barra-inferior"><a href="index.php">Copyright &copy; 2013</a></section>
    </body>
</html>
