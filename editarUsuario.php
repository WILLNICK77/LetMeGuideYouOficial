<!DOCTYPE html>
    <html lang="pt-br">
      <head>
        <title>Editar Usuário</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <meta charset="utf-8">
      </head>
      <body>
    <div class="jumbotron">
    <h1> Editar Usuário </h1>
   
      


  <form name="editar" action="recebeEditarUsuario.php" method="post">
  <div class="form-group row">
    <label for="codigo" class="col-sm-2 col-form-label">Codigo</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="codigo" id="codigo" value="codigo"placeholder="codigo">
    </div>
  </div>
  <div class="form-group row">
    <label for="nome" class="col-sm-2 col-form-label">Nome</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="nome" value=" nome" id="nome" placeholder="Nome">
    </div>
  </div>
  <div class="form-group row">
    <label for="email" class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="email" value="email" id="email" placeholder="email">
    </div>
  </div>

   <div class="form-group row">
    <label for="senha" class="col-sm-2 col-form-label">Senha</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="senha" id="senha" value="senha"placeholder="senha">
    </div>
  </div>
  <div class="form-group row">
    <div class="col-sm-10">
      <button type="submit" class="btn btn-primary">Salvar</button>
    </div>
  </div>
</form>
</div>
</body>
</html>