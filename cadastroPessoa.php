 <!DOCTYPE html>
    <html lang="pt-br">
      <head>
        <title>Cadastro de Usuário</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta charset="utf-8">
      </head>
      <body>
		<div class="jumbotron">
		<h1> Cadastro de Usuário </h1>
		
	<form name="cadastro" action="recebecadastroPessoa.php" method="post">
    <div class="form-group row">
    <label for="codigo" class="col-sm-2 col-form-label">Código</label>
    <div class="col-sm-10">
      <input type="number" class="form-control" name="codigo" id="codigo" placeholder="Código">
    </div>
  </div>
  <div class="form-group row">
    <label for="nome" class="col-sm-2 col-form-label">Nome</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="nome" id="nome" placeholder="Nome">
    </div>
  </div>
  <div class="form-group row">
    <label for="email" class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" name="email" id="email" placeholder="Email">
    </div>
  </div>
  <div class="form-group row">
    <label for="senha" class="col-sm-2 col-form-label">Senha</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" name="senha" id="senha" placeholder="Senha">
    </div>
  </div>
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Cadastro</button>
    </div>
  </div>
</form>
</div>
</body>
</html>