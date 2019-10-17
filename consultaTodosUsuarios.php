<!DOCTYPE html>
    <html lang="pt-br">
      <head>
        <title>Consulta Usuários</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta charset="utf-8">
        <script>
          function confirmarExclusao(codigo){
            var resposta = confirm("Tem certeza?");
            if(resposta){
              window.location.href="recebeExcluirUsuario.php?pront="+prontuario;
            }
          }

        </script>
      </head>
      <body>
    		<div class="jumbotron">
      		<h1> Consulta Todos Usuarios </h1>
      		<?php 
            require_once "usuario.class.php";
      			      		
            echo "<br>";
          ?>
          <br>
          <form name="consultaPorNome" action="recebeConsultaPorNome.php">
            Nome: <input type="text" name="nome">
            <input type="submit" value="buscar">
          </form>          
          <br>
          <?php
            $objUsuario = new Usuario("","","");
            $todosUsuarios = $objUsuario->consultaTodosUsuarios();

          ?>
          <table class="table table-borderd">
            <tr>
              <th> Código </th>
              <th> Nome </th>
              <th> Email </th>
              <th> Senha </th>
              
            </tr>
          <?php
            foreach($todosUsuarios AS $usuario){
              echo "<tr>";
              echo "<td> {$usuario['codigo']} </td>";
              echo "<td> {$usuario['nome']} </td>";
              echo "<td> {$usuario['email']} </td>";
               echo "<td> {$usuario['senha']} </td>";
              echo "<td> <a href=recebeEditarPessoa.php?codigo={$usuario['codigo']}&nome={$usuario['nome']}& email={$usuario['email']}& senha={$usuario['senha']}>Editar</a> | 
              <a href='javascript:func()' onclick='confirmarExclusao({$usuario['codigo']})'> Excluir</a> </td>";
              echo "</tr>";
            }

          ?>
          </table>

        </div>
</body>
</html>