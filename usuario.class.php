<?php
require_once "Conexao.class.php";

class Usuario{
  private $codigo;
  private $nome;
  private $email;
  private $senha;
 
  public function getCodigo(){
	  return $this->codigo;
  }
  
  public function setCodigo($codigo){
	  $this->codigo = $codigo;
  }
  
  public function getNome(){
	  return $this->nome;
  }
  
  public function setNome($nome){
	  $this->nome = $nome;
  }
  
  public function getEmail(){
	  return $this->email;
  }
  
  public function setEmail($email){
	  $this->email = $email;
  }

   public function getSenha(){
	  return $this->$senha;
  }
  
  public function setSenha($senha){
	  $this->email = $email;
  }

  public function __construct($codigo="", $nome="", $email="",  $senha=""){
	  $this->codigo = $codigo;
	  $this->nome = $nome;
	  $this->email = $email;
	  $this->senha = $senha;
  }
  
  public function inserirUsuario(){
	
	$conexao = new Conexao();
	$cn = $conexao->getInstance();
	
	$stmt = $cn->prepare('INSERT INTO usuario VALUES (:codigo,:nome,:email,:senha)');
    $stmt->bindParam(':codigo', $this->codigo);
	$stmt->bindParam(':nome', $this->nome);
	$stmt->bindParam(':email', $this->email);
	$stmt->bindParam(':senha', $this->senha);
    $result = $stmt->execute();
	
	if(!$result){
		echo "Erro";
		exit;
	}
		echo $stmt->rowCount(). " Usuário inserido com sucesso!!";
	}	

public function excluirPorCodigo($codigo){
		$conexao = new Conexao();
		$cn = $conexao->getInstance();

		$stmt = $cn->prepare('DELETE FROM usuario WHERE codigo = :codigo'  );
		$stmt->bindValue(':codigo', $codigo);
		$stmt->execute();

		}


		public function editarUsuario($codigo,$nome,$email,$senha){
		$conexao = new Conexao();
		$cn = $conexao->getInstance();

		$stmt = $cn->prepare('UPDATE usuario SET nome = :nome, email = :email, senha = :senha WHERE codigo = :codigo');
		$stmt->bindValue(':codigo', $codigo);
		$stmt->bindValue(':nome', $nome);
		$stmt->bindValue(':email', $email);
		$stmt->bindValue(':senha', $senha);


		$stmt->execute();

	}

	public function consultaTodosUsuarios(){
		$conexao = new Conexao();
		$cn = $conexao->getInstance();

		$stmt = $cn->prepare('SELECT * FROM usuario');
		$stmt->execute();

		$resultado = $stmt->fetchAll(PDO::FETCH_ASSOC);

		return $resultado;
	}

	public function consultaPorNome($nome){
		$conexao = new Conexao();
		$cn = $conexao->getInstance();

		$stmt = $cn->prepare('SELECT * FROM usuario WHERE nome like :nome');
		$stmt->bindValue(':nome', "%$nome%");
		$stmt->execute();

		$resultado = $stmt->fetchAll(PDO::FETCH_ASSOC);
		return $resultado;
	}
	

}



?>