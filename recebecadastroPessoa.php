 <!DOCTYPE html>
	<?php
		require_once "usuario.class.php";
	?>
    <html lang="pt-br">
      <head>
        <title>Cadastro</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta charset="utf-8">
      </head>
      <body>
		<div class="jumbotron">
		<h1> Cadastro de Usuário</h1>
		
			<p>
			<?php
				$codigo = $_POST["codigo"];
				$nome = $_POST["nome"];
				$email = $_POST["email"];
				$senha = $_POST["senha"];
				
				$novoUsuario = new Usuario($codigo, $nome, $email, $senha);
				$novoUsuario->inserirUsuario();


			?>

			<a href="Perfil.html" class="btn btn-primary">OK</a>
			</p>
		</div>
	</body>
</html>